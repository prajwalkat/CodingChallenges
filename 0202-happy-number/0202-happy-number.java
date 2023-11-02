class Solution {
    public boolean isHappy(int n) {
        
        int x=0;
        HashSet<Integer> s=new HashSet<>();
         while(x!=n){
            int z=n;
            int sum=0;
            
            while(z!=0){
                int y=z%10;
                sum=sum+y*y;
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