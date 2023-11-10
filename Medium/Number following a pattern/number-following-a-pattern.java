//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S = read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.printMinNumberForPattern(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

// class Solution{
//     static String printMinNumberForPattern(String s){
//         // code here
//         char c=s.charAt(0);
//         int x=0;
//         int a=1;
//         if(c=='I'){
//             x=12;
//         }
//         if(c=='D'){
//             x=21;
//         }
        
        
        
        
        
        
        
        
        
        
//         return Integer.toString(x);
        
        
        
//     }
    
    
//     //IDIDI=132546
    
//     //IDDIDI=1432657
// }




//User function Template for Java
class Solution{
    private boolean flag = true;
    String printMinNumberForPattern(String S){
        // code here
        int n = S.length();
        char[] digits = new char[n+1];
        Set<Character> set = new HashSet();
        
        char D = '2';
        char I = '1';
        while (flag) {
            digits[0] = (S.charAt(0) == 'D') ? D : I;
            set.add(digits[0]);
            helper(S, n, digits, set, 0);
            D++;
            // I--;
            set.clear();
        }
        
        
        String shubh = "";
        for (char digit : digits) {
            shubh += digit;
        }
        
        return shubh;
    }
    
    private void helper 
    (
        String s,
        int n,
        char[] digits,
        Set<Character> set,
        int itr
        
    ) {
        if (itr >= n) {
            flag = false;   // If complete the traversal part you done the flag
            return;
        }
        
        if (s.charAt(itr) == 'D') {
            char temp = digits[itr];
            while(flag) {
                temp--;
                if (temp == '0') {
                    return;
                }
                if (!set.contains(temp)) {
                    digits[itr+1] = temp;
                    set.add(temp);
                    helper(s, n, digits, set, itr+1);
                    set.remove(temp);     // This is Backtracking Part
                }
            }
            
        } else {
            char temp = digits[itr];
            while(flag) {
                temp++;
                // if (("10").equals(temp+"")) {
                //     return;
                // }
                if (!set.contains(temp)) {
                    digits[itr+1] = temp;
                    set.add(temp);
                    helper(s, n, digits, set, itr+1);
                    set.remove(temp);    // This is Backtracking Part
                }
            } 
        }
        
    }
}