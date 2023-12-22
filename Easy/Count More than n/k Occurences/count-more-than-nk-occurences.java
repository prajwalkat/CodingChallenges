//{ Driver Code Starts
/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class Driverclass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int k = sc.nextInt();

            System.out.println(new Solution().countOccurence(arr, n, k));
        }
    }
}

// } Driver Code Ends


class Solution 
{
    //Function to find all elements in array that appear more than n/k times.
    public int countOccurence(int[] a, int n, int k) 
    {
        
         double x=n/k;
        Arrays.sort(a);
        double count=0;
        int l=0;
        for(int i=0;i<n-1;i++){
            if(a[i]==a[i+1]){
                count++;
            }else{
                if(count+1>x){
                    l++;
                }
                count=0;
            }
            
        }
        
         if(count+1>x){
                    l++;
                }
        
        return l;
        // your code here,return the answer
    }
}
