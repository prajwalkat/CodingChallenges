//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N=sc.nextInt();
			
            Solution ob = new Solution();
            ob.gfSeries(N);
            
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{
    static void gfSeries(int n){
        // code here
        
        long t1=0;
        long t2=1;
        System.out.print(t1+" ");
        System.out.print(t2+" ");
        for(int i=2;i<n;i++){
            long t3=t1*t1-t2;
            t1=t2;
            t2=t3;
        if(i==n-1){
                System.out.print(t3);
            
        }else{
            System.out.print(t3+" ");
        }
        
        }
        System.out.println();
        
     
      
        
    }
}