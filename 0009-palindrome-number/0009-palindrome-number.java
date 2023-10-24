class Solution {
    public boolean isPalindrome(int x) {
      if(x<0 || x%10==0 && x!=0){
          return false;
      }   
      int y=x;
        int f=0;
        int j=1;
      while(x!=0){
          int p=x%10;
          f=f*10+p;
          x=x/10;
          //System.out.println(f);
      }
      return f==y;
    }
}