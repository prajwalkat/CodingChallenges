//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            
            int N=sc.nextInt();
            int K=sc.nextInt();
            ArrayList<Integer> Arr = new ArrayList<Integer>(N); 
  
            // Appending new elements at 
            // the end of the list 
            for (int i = 0; i < N; i++) {
                int x = sc.nextInt();
                Arr.add(x); 
            }

            Solution ob = new Solution();
            System.out.println(ob.maximumSumSubarray(K,Arr,N));
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{
    static long maximumSumSubarray(int k, ArrayList<Integer> a,int n){
        // code here
        long res=Long.MIN_VALUE;
        long sum=0L;
        
        for(int i=0;i<k;i++){
            sum=sum+a.get(i);
        }
        
        if(sum>res){
            res=sum;
        }
       // System.out.println(res);
        int j=0;
        for(int i=k;i<a.size();i++){
            sum=sum+a.get(i);
            sum=sum-a.get(j);
            j++;
            
            //System.out.println(sum+" " + a.get(k)+" "+a.get(j));
            if(sum>res){
            res=sum;
            }  
            
        }
        
        
       // System.out.println();
        
        return res;
        
        
        
    }
}