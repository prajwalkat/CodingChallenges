class Solution {
    public int fib(int n) {
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        if(n==2){
            return 1;
        }
        int a1=1;
        int a2=1;
        int a3=0;
        for(int i=2;i<=n;i++){
            a3=a1+a2;
            a1=a2;
            a2=a3;
            //System.out.println(a3);
        }
        return a1;
    }
}