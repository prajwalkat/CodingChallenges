//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcases = Integer.parseInt(br.readLine());
        while (testcases-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String line1 = br.readLine();
            String[] a1 = line1.trim().split("\\s+");
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(a1[i]);
            }
            Solution ob = new Solution();
            int ans=ob.minNumber(a,n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java


class Solution
{
    public int minNumber(int arr[], int N)
    {   int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        int j=sum;
        
        if(j==1){
            return 1;
        }
        if(j==2){
            return 1;
        }
        if(j==3){
            return 2;
        }
        
        if(isPrime(sum)){
            return sum-j;
        }
        while(true){
            sum=sum+1;
            if(isPrime(sum)){
                return sum-j;
            }
            
        }    
        
        
      
    }
    public boolean isPrime(int n){
        int k=(int)Math.pow(n,0.5);
        for(int i=2;i<=k;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
