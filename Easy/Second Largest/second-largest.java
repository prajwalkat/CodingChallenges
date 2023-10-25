//{ Driver Code Starts
//Initial Template for Java



import java.util.stream.Collectors; 
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

            int ans = new Solution().print2largest(arr, n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    int print2largest(int a[], int n) {
        // code here
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE+1;
        
        for (int i=0;i<n;i++){
            if(a[i]>max1){
                max1=a[i];
            }
                    
                
            }
         for (int i=0;i<n;i++){
            if(a[i]>max2 && a[i]!=max1){
                max2=a[i];
            }
                    
                
            }  
            
            if(max2==-2147483647){
                max2=-1;
            }
           return max2; 
        }
    }
