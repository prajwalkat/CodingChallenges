//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().trim().split(" ");
            int[] array = new int[n - 1];
            for (int i = 0; i < n - 1; i++) {
                array[i] = Integer.parseInt(str[i]);
            }
            Solution sln = new Solution();
            System.out.println(sln.missingNumber(array, n));
        }
    }
}
// } Driver Code Ends




// User function Template for Java

class Solution {
    int missingNumber(int ar[], int n) {
        // Your Code Here
        int[] b =new int[n];
        for(int i=0;i<n;i++){
            b[i]=i+1;
           // System.out.println(b[i]);
        }
        
        
        
        Arrays.sort(ar);
        for(int i=0;i<ar.length;i++){
        if(b[i]!=ar[i]){
        
            return b[i];
        } 
       
        }
         return b[n-1];
    }
}