//{ Driver Code Starts
//Initial Template for Java

//Initial Template for Java

//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


class Array {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		// looping through all testcases
		while(testcases-- > 0){
		    String line = br.readLine();
		    String[] element = line.trim().split("\\s+");
		    int sizeOfArray = Integer.parseInt(element[0]);
		    
		    int arr [] = new int[sizeOfArray];
		    
		    line = br.readLine();
		    String[] elements = line.trim().split("\\s+");
		    for(int i = 0;i<sizeOfArray;i++){
		        arr[i] = Integer.parseInt(elements[i]);
		    }
		    
		    
		    Solution obj = new Solution();
		    long res = obj.sumXOR(arr, sizeOfArray);
		    System.out.println(res);
		}
	}
}



// } Driver Code Ends


//User function Template for Java

class Solution{
   
    // Function for finding maximum and value pair
    public long sumXOR (int a[], int n) {
        //Complete the function
        
        long sum=0;
        // for(int i=0;i<a.length;i++){
        //     for(int j=i;j<a.length;j++){
        //       if(i<j){ 
        //         sum=sum+(a[i]^a[j]);
        //       }
                
        //     }
        // }
        
        long sumXOR = 0;
        for (int i = 0; i < 31; i++) {
            int countZero = 0;
            int countOne = 0;

            for (int j = 0; j < n; j++) {
                if ((a[j] & (1 << i)) == 0) {
                    countZero++;
                } else {
                    countOne++;
                }
            }

            // For each bit position, add the contribution of XOR for 0s and 1s.
            sumXOR += (long) countZero * countOne * (1 << i);
        }

        return sumXOR;

        
        
        
        
    }
    
    
}


