//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().findMaxSum(arr, n);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int findMaxSum(int arr[], int n) {
        // code here
        int max=Integer.MIN_VALUE;
        
        if(n==1){
            return arr[0];
        }
        if(n==2){
            return Math.max(arr[0],arr[1]);
        }
        
        arr[1]=Math.max(arr[0],arr[1]);
        for(int i=2;i<n;i++){
            arr[i]=arr[i]+arr[i-2];
            arr[i-1]=Math.max(arr[i-1],arr[i-2]);
        }
       // System.out.println(Arrays.toString(arr));
        return Math.max(arr[n-1],arr[n-2]);
        
    }
}
/*
5 5 10 100 10 5 




*/