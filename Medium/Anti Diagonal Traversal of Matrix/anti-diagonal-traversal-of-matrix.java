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
            
            String input_line[] = br.readLine().trim().split("\\s+");
            int[][] matrix = new int[n][n];
            for(int i=0; i<n; i++) {
                for (int j = 0; j < n; ++j) {
                    matrix[i][j] = Integer.parseInt(input_line[i * n + j]); 
                }
            }
            Solution obj = new Solution();
            int[] ans = obj.antiDiagonalPattern(matrix);
            for(int i = 0; i < ans.length; i++)
                System.out.print(ans[i] + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int[] antiDiagonalPattern(int[][] m)
    {
        // Code here
        ArrayList<Integer> al=new ArrayList<>();
        int u=m.length;
        int[] n=new int[m.length*m.length];
        int k=(m.length*2)-1;
        int h=0;
        int x=0;
        int y=0;
        for(int i=0;i<k;i++){
            if(i<(k/2)+1){
                int a=x;
                int b=y;
                
                while(a>-1 && a<u && b>-1 && b<u ){
                    
                  //  System.out.println(a+" " +b+ " " + m[a][b]);
                  al.add(m[a][b]);
                    a++;
                    b--;
                    
                }
                
                
                
                
                y++;
                
            }else{
                int a=x+1;
                int b=y-1;
                
                while(a>-1 && a<u && b>-1 && b<u){
                    
                  //  System.out.println(a+" " +b + " " + m[a][b]);
                    al.add(m[a][b]);
                    a++;
                    b--;
                    
                    
                }
                
               // System.out.println("Col Trav");
                x++;
            }
            
            
        }
        
       // System.out.println(al);
        
        for(int i=0;i<n.length;i++){
            n[i]=al.get(i);
        }
        
        return n;

    }
    
    
    /* 00 01 02  1 2 3      1 2 4 3 5 7 6 8 9 
       10 11 12  4 5 6       
       20 21 22  7 8 9 
    
    
    */
}