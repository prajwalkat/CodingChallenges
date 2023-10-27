class Solution {
    public String longestPalindrome(String s) {






    
        String max="";
        if(s.length()==1){
            return s;
        }
        int maxl=0;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                String p1=s.substring(i,j+1);
                if(isPalindrome(p1)){
                    if(p1.length()>maxl){
                        maxl=p1.length();
                        max=p1;
                    }
                }
            }
        }

        return max;
    }
   public  boolean isPalindrome(String s)
 {
    int index1 = 0;
    int index2 = s.length() -1;

    while (index1 < index2)
    {
        if(s.charAt(index1) != s.charAt(index2))
        {
            return false;
        }
        index1 ++;
        index2 --;
    }
    return true;
 }
}


/*int index1 = 0;
    int index2 = s.length() -1;

    while (index1 < index2)
    {
        if(s.charAt(index1) != s.charAt(index2))
        {
            return false;
        }
        index1 ++;
        index2 --;
    }
    return true; */