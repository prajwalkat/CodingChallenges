//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            int ans = ob.nthPoint(n);
            System.out.println(ans);            
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int nthPoint(int n)
    {
        // Code here
        int mod=1000000007;
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        int a=1;
        int b=2;
        int c=a+b;
        
        for(int i=2;i<n;i++){
            c=(a+b)%mod;
            a=b%mod;
            b=c%mod;
        }
        
        return c%mod;
    }
}

/*
1= 1
2= 2 
3= 3
4= 5
5= 8
6= 13

*/