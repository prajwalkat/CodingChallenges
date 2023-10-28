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
            int ans = ob.is_bleak(n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int is_bleak(int n)
    {
        int i=0;
        int j;
        if(n>20){
            j=n-20;
        }else{
            j=0;
        }
        for(;j<=n;j++){
            
            if(j+numberOfSetBits(j)==n){
                return 0;
                
            }
        }
        
        return 1;
        // Code here
    }
    
    public static int CountBits(int value)
{
    int count = 0;
    while (value != 0)
    {
        count++;
        value &= value - 1;
    }
    return count;
}

public static int numberOfSetBits(int i)
{
     // Java: use int, and use >>> instead of >>. Or use Integer.bitCount()
     // C or C++: use uint32_t
     i = i - ((i >>> 1) & 0x55555555);        // add pairs of bits
     i = (i & 0x33333333) + ((i >>> 2) & 0x33333333);  // quads
     i = (i + (i >>> 4)) & 0x0F0F0F0F;        // groups of 8
     i *= 0x01010101;                        // horizontal sum of bytes
     return  i >>> 24;               // return just that top byte (after truncating to 32-bit even when int is wider than uint32_t)
}

}