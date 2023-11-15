//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String str1 = sc.next();
            String str2 = sc.next();

            Solution obj = new Solution();
            String ans = obj.betterString(str1, str2);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public static String betterString(String str1, String str2) {
        // Code here
        
        int[] dp1=new int[str1.length()+1];
        int[] dp2=new int[str1.length()+1];
        dp1[0]=1;
        dp2[0]=1;
        
        HashMap<Character,Integer> hm1 =new HashMap<>();
        HashMap<Character,Integer> hm2 =new HashMap<>();
        
        for(int i=1;i<dp1.length;i++){
            char ch =str1.charAt(i-1);
            dp1[i]=dp1[i-1]*2;
            if(hm1.containsKey(ch)){
             int j=hm1.get(ch);
             dp1[i]=dp1[i]-dp1[j-1];
                
            }
            
            hm1.put(ch,i);
            
            
            
        }
        
        for(int i=1;i<dp2.length;i++){
            char ch =str2.charAt(i-1);
            dp2[i]=dp2[i-1]*2;
            if(hm2.containsKey(ch)){
             int j=hm2.get(ch);
             dp2[i]=dp2[i]-dp2[j-1];
            }
            
            hm2.put(ch,i);
            
            
            
        }
        
        int j=dp1[dp1.length-1];
        int i=dp2[dp2.length-1];
        
        if(j>=i){
            return str1;
        }else{
            return str2;
        }
        
        
        
        
        
        
    }
}

/*

/// abcc   //   acba
a             a c b  ac ab aa cb ca ba  
b
c
ab
ac
bc
cc

abc
bcc
acc
abcc






*/