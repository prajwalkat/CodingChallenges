//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            Solution obj = new Solution();
            int ans = obj.minCandy(n, a);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    static int minCandy(int n, int r[]) {
        // code here
        int[] t=new int[n];
        Arrays.fill(t,1);
        int sum=n;
        
        for(int i=0;i<n-1;i++){
            if(r[i+1]>r[i]){
                t[i+1]=t[i]+1;
            }
        }
        
       // System.out.println(Arrays.toString(t));
        
     
     
     
        
        //  for(int i=n-1;i>=1;i--){
        //     if(r[i-1]>r[i] && t[i-1]< t[i]){
        //         t[i-1]++;
        //     }
        // }
        
        for(int i=0;i<n-1;i++){
            int x=(n-i)-1;
            if(r[x]<r[x-1] && t[x-1]<=t[x]){
                t[x-1]=t[x]+1;
            }
        }
        
   
       //   System.out.println(Arrays.toString(t));
        
        int k=0;
        for(int i=0;i<n;i++){
            k+=t[i];
        }
        
        
        
        
        
        
        return k;
        
        
        
    }
}
