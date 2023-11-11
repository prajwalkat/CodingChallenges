//{ Driver Code Starts
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.*;


public class Driver {
    
    public static void main(String[] args)throws IOException {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while(tc-->0)
        {
            String s1 = br.readLine();
            String s2 = br.readLine();
            
            Solution obj = new Solution();
            
            boolean a = obj.areIsomorphic(s1,s2);
            if(a)
            System.out.println(1);
            else
            System.out.println(0);
        }
    }
    
}

// } Driver Code Ends


class Solution
{
    //Function to check if two strings are isomorphic.
    public static boolean areIsomorphic(String str1,String str2)
    {
        
        
        
        if(str1.length()!=str2.length())
        {
            return false;
        }
        
        HashMap<Character,Character> hm=new HashMap<>();
        
      
        
        for(int i=0;i<str1.length();i++){
            
            
            
             char a=str1.charAt(i);
             char b=str2.charAt(i);
            
             if(hm.containsKey(a)){
             
                
                 if(hm.get(a)!=b)
                {
                return false;
                }
                        
            }else if(hm.containsValue(b)){
                return false;
            }
            
            
            else{
                hm.put(a,b);
                
               // s=s+Character.toString(b);
                //str2=str2.replaceAll(Character.toString(b),Character.toString(a));
                //str2.replaceAll("w","y");
                
                
             //System.out.println(str2   + " " + str1 +"       " +  s);
                
    
               
            }
            
        }
        
        // if(str2.equals(s)){
        //     return true;
        // }else{
        //     return false;
        // }
        
        return true;
        
        
        
        
        
        
        
        
        
        // Your code here
        
        // HashMap<Character,Character> hm=new HashMap<>();
       
        
        // if(str1.length()!=str2.length()){
        //     return false;
        // }
        
        // String f="";
        
        // for(int i=0;i<str1.length();i++){
        //     char a=str1.charAt(i);
        //     char b=str2.charAt(i);
        //     if(hm.containsKey(b)){
        //       char c=hm.get(b);
        //         f=f+Character.toString(c);
                        
        //     }else{
        //         hm.put(b,a);
                
                
                
        //          f=f+Character.toString(b);
                
    
               
        //     }
        // }
        
        // //hm.forEach((a,e)-> System.out.println(a+"" +e));
        // //  String f="";
        
        // // for(int i=0;i<str1.length();i++){
        
        // //     char a= str1.charAt(i);
        // //     char c=hm.get(a);
            
        // //     f=f+Character.toString(c);
        // //      System.out.println(f);   
            
            
        // //  }
         
         
        //  if(str2.equals(f)){
             
        //      return true;
             
        //  }else{
        //      return false;
        //  }
        
       
      
        
        
    }
}