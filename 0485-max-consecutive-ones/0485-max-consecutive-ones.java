class Solution {
    public int findMaxConsecutiveOnes(int[] n) {
        int j=n.length;
        int count=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<j;i++){
            if(n[i]==1){
                count++;
            }else{
                if(count>max){
                    max=count;
                    
                }
                count=0;
            }
        }

        if(count>max){
            max=count;
            count=0;
                }

        return max;
    }
}