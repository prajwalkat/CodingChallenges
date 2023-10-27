class Solution {
    public boolean isPalindrome(String s) {
            s=s.toLowerCase();
        for(int i=0;i<s.length();i++){
			  char a=s.charAt(i);
			  if( (a<=122 && a>=97) || (a<=57&&a>=48) ){}
              else{
                  
				  s=s.replace(Character.toString(a),"");
                //System.out.println(1);
        
			  }
		  }

           for(int i=0;i<s.length();i++){
			  char a=s.charAt(i);
			  if( (a<=122 && a>=97) || (a<=57&&a>=48) ){}
              else{
                  
				  s=s.replace(Character.toString(a),"");
                //System.out.println(1);
        
			  }
		  }

        StringBuffer s1=new StringBuffer(s);
        s1=s1.reverse();
        String s2=s1.toString();
       System.out.println(s2);
       System.out.println(s);
       
       

        return s.equals(s2);

       

    }
}