class Solution {
    public int reverse(int x) {
        int y=x;
        if(x==-2147483648){
            return 0;
        }
        x=Math.abs(x);
       // System.out.println(x);
        String s=Integer.toString(x);
        int len=s.length();
        String s2="";
        for(int i=len;i>0;i--){
         String f=s.substring(i-1,i);
         //System.out.println(f)   ;
         s2=s2.concat(f);
        }
        long lp=Long.parseLong(s2);
        long lmax=2147483647;
        long lmin=-2147483648; 
        if(lp>lmax || lp<lmin){
                return 0;
        }


        int q=Integer.parseInt(s2);
        if(y<0){
            q=q*(-1);
        }
        return q;
    }
}