//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String inline[] = in.readLine().trim().split("\\s+");
            int n = Integer.parseInt(inline[0]);
            int m = Integer.parseInt(inline[1]);
            String inline1[] = in.readLine().trim().split("\\s+");
            int M[][] = new int[n][m];
            for(int i = 0;i < n*m;i++){
                M[i/m][i%m] = Integer.parseInt(inline1[i]);
            }
            
            Solution ob = new Solution();
            System.out.println(ob.maxGold(n, m, M));
        }
    }
} 
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int maxGold(int n, int m, int M[][])
    {
        
                
            if(n==1){
                int j=0;
                for(int i=0;i<m;i++){
                    j=j+M[0][i];
                    
                }
                return j;
            }
        
        
        
         for(int j=0;j<m;j++){
            for(int i=0;i<n;i++){
                
            //  System.out.print("(" + i + " " + j + ")"+ " " );
             
             
            if(j==0){
                continue;
            }else{
                if(i==0){
                    M[i][j]=M[i][j]+Math.max(M[i][j-1],M[i+1][j-1]);
                    continue;
                }
                if(i==n-1){
                     M[i][j]=M[i][j]+Math.max(M[i][j-1],M[i-1][j-1]);
                    continue;
                }else{
                
                M[i][j]=M[i][j]+Math.max(Math.max(M[i][j-1],M[i-1][j-1]), M[i+1][j-1]);
               continue;
                }
            }  
            
                
                
                
            }
           //  System.out.println();
                
             
             
             
             
         }
        
        
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<m;j++){
        //         System.out.print(M[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        
        
        // code here
        int k=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
                k=Math.max(k,M[i][m-1]);
            
        }
        
        return k;
        
    }
}




/*
1  5   8   16
2  7   11  14
5  5   13  16
0  11  12  15

1 5 8        

2 3 12

0 8 12
*/

//