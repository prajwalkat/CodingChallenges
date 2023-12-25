//{ Driver Code Starts
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
            int n = sc.nextInt();
            int matrix[][] = new int[n][n];
            
            for(int i = 0; i < n; i++)
            {
                for(int j = 0; j < n; j++)
                  matrix[i][j] =sc.nextInt();
            }
            Solution ob = new Solution();
            System.out.println(ob.determinantOfMatrix(matrix, n));
        }
    }
}
// } Driver Code Ends




class Solution
{
    //Function for finding determinant of matrix.
    static int determinantOfMatrix(int m[][], int n)
    {
        // code here
        if(n==1){
            return m[0][0];
            
        }
        if(n==2){
            return m[0][0] * m[1][1] - m[0][1] *m[1][0];
        }
        int d=0;
        for(int i=0;i<n;i++){
            int cof=(int)Math.pow(-1,i) * m[0][i] *  determinantOfMatrix(newm(m,0,i),n-1);
            d=d+cof;
            
        }
        
        
        
        
        return d;
    }
    
    static int[][] newm(int[][] m,int r,int c){
        int n=m.length;
        int a[][]=new int[n-1][n-1];
        int row=0,col=0;
        
        for(int i=0;i<n;i++){
            if(i!=r){
                for(int j=0;j<n;j++){
                    if(j!=c){
                        a[row][col]=m[i][j];
                        col++;
                    }
                }
                col=0;
                row++;
            }
        }
        
        
        return a;    
    }
    
}

