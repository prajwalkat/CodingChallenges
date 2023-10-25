class Solution {
    public int kthGrammar(int n, int k) {
        int x=(int) Math.pow(2,n-1);
        int curr=0;
        while(n!=1){
            if(k<=x/2){
                x=x/2;
                n--;
            }
            else{
                k=k-x/2;
                if(curr==0){curr=1;}
                else{curr=0;}
                n--;
                x=x/2;

            }
        }
        return curr;
    

    }
}