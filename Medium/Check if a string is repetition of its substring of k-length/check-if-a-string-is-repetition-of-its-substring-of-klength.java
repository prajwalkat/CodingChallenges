//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            String s = sc.next();
            int k = sc.nextInt();
            int answer = new Solution().kSubstrConcat(n,s,k);
    		System.out.println(answer);
        }
        
    }
}

// Contributed By: Pranay Bansal

// } Driver Code Ends


//User function Template for Java

class Solution
{
    int kSubstrConcat(int n, String s, int k)
    {
        
        // Your Code Here   
        if(n%k!=0){
            return 0;
        }
        
        String a=s.substring(0,k);
        String b=s.substring(n-k,n);
        int x=1;
        
        // System.out.println(a+" "+b);
        
        for(int i=0;i<n;i=i+k){
            String c=s.substring(i,i+k);
            // System.out.println("First Loop: "+c);
            
            if(c.equals(a)){
                
            }else{
                x--;
            }
        }
        
        
        int y=1;
        
        for(int i=0;i<n;i=i+k){
            String c=s.substring(n-k-i,n-i);
            // System.out.println("Second Loop: "+c);
            if(c.equals(b)){
                
            }else{
                y--;
            }
        }
        
        // System.out.println(x+" "+y);
        if(x==0||y==0||x==1||y==1){
            return 1;
        }
        
        
        
        
        
        return 0;
        
        
        
        
    }
}