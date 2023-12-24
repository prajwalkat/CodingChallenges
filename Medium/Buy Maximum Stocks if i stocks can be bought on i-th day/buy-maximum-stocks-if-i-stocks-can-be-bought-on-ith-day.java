//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            String str=br.readLine();
    		String[] starr=str.split(" ");
    		
    		//input n and d
    	    int n=Integer.parseInt(starr[0]);
    		int k= Integer.parseInt(starr[1]);
            
            starr = br.readLine().trim().split(" ");
            int[] price = new int[n];
            for(int i = 0; i < n; i++)
                price[i] = Integer.parseInt(starr[i]);
            
            Solution obj = new Solution();
            int res = obj.buyMaximumProducts(n, k, price);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    // public static int buyMaximumProducts(int n, int k, int[] p) {
    //     // code here
    //     HashMap<Integer,Integer> hm= new HashMap<>();
    //     for(int i=0;i<n;i++){
    //         hm.put(p[i],i+1);
    //     }
    //     System.out.println(hm);
    //     Arrays.sort(p);
    //     int count=0;
    //     for(int i=0;i<p.length;i++){
    //         if(hm.get(p)*p<=k){
    //             count+=hm.get(p);
    //             k=k-p*hm.get(p);
                
    //         }else{
                
    //         }
            
    //     }
        
    //     return 10;
    // }
     public static int buyMaximumProducts(int n, int k, int[] price) {
        // code here
         TreeMap<Integer, Integer> hm = new TreeMap<>();
        for(int i=0; i<n;i++){
            hm.put(price[i], hm.getOrDefault(price[i],0)+i+1);
        }
        int ans =0;
        for(Map.Entry<Integer,Integer> entry : hm.entrySet()){
            while(entry.getValue()>0 && k>= entry.getKey()){
                k-= entry.getKey();
                ans++;
                entry.setValue(entry.getValue()-1);
            }
            
        }
        return ans;
    
    }
}
        
