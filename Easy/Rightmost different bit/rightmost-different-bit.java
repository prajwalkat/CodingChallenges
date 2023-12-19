//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;

class Main{
    
    
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc=new Scanner(System.in);
		
		//input number of testcases
		int t=sc.nextInt();
		int m,n;
		while(t-->0) {
		    
		    
            Solution obj = new Solution();
            //input m and n
		    m = sc.nextInt();
		    n = sc.nextInt();
		    System.out.println(obj.posOfRightMostDiffBit(m, n));
		}
	}
}




// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to find the first position with different bits.
    public static int posOfRightMostDiffBit(int m, int n)
    {
            
            int j=-1;
            
            String ms= Integer.toBinaryString(m);
            
            String ns=Integer.toBinaryString(n);
                
              //  System.out.println(ms+" "+ns);
            int k=ms.length();
            int l=ns.length();
            
            for(int i=0;i<Math.max(k,l)-1;i++){
                if(k-i-1>=0 &&l-i-1>=0){
                    if(ms.charAt(k-i-1)==ns.charAt(l-i-1)){
                        continue;
                    }else{
                        return i+1;
                    }
                }else{
                    return i+1;
                }
            }
            
            return j;
        // Your code here        
            
    }
}


