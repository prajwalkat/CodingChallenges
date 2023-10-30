//{ Driver Code Starts
//Initial Template for Java



import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            String[] inputLine = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            new Solution().pushZerosToEnd(arr, n);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    void pushZerosToEnd(int[] a, int n) {
     int[] a2=new int[n];
      int c0=0;
      int k=0;
        for(int i=0;i<n;i++){
            if(a[i]==0){
                c0++;
            }else{
                a2[k]=a[i];
               // System.out.println(a[i]);
                k++;
            }    
        }
        // for(int i=0;i<n;i++){
        //  System.out.println(a2[i]);
        // }
        
        for(int i=0;i<n;i++){
            a[i]=a2[i];    
        }
        
        // code here
    }
}