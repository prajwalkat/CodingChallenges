//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.smithNum(n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int smithNum(int n) {
        // code here
        
        // System.out.println(sumofdig(n));
        // System.out.println(smnum(n));
        // System.out.println(isPrime(n));
        
        if(isPrime(n)){
            return 0;
        }
        
        if(sumofdig(n)==smnum(n)){
            return 1;
        }else{
            return 0;
        }
        
       
        
        
    }
 
    public static boolean isPrime(int n){
        int k=(int)Math.pow(n,0.5);
        for(int i=2;i<=k;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    
    
    
    static int sumofdig(int n){
        int sum=0;
        while(n!=0){
            int j=n%10;
            sum=sum+j;
            n=n/10;
        }
        
        return sum;
        
    }
    static int smnum(int n){
        
        int sum=0;
        while(n!=1){
            for(int i=2;i<=n;i++){
                if(n%i==0){
                    sum=sum+sumofdig(i);
                    n=n/i;
                    //System.out.println(i);
                    break;
                }
            }
        }
        
        return sum;
    }
    
    
};