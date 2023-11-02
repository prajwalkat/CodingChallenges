class Solution {
    public boolean isHappy(int n) {
        int[] sq=new int[]{0,1,4,9,16,25,36,49,64,81};
        int x=0;
        HashSet<Integer> s=new HashSet<>();
         while(x!=n){
            int z=n;
            int sum=0;
            
            while(z!=0){
                int y=z%10;
                sum=sum+sq[y];
                z=z/10;
                
            }
            if(s.contains(sum)){
                return false;
            }
            else{
                s.add(sum);
            }


            if(sum==1){
                return true;
            }else{
                n=sum;
            }


        }
    return false;

    }
}