class Solution {
    public int getLastMoment(int n, int[] left, int[] right) {
        int maxl=Integer.MIN_VALUE;
        for(int i=0;i<left.length;i++){
            if(left[i]>maxl){
                maxl=left[i];
            }
        }
        int minr=Integer.MAX_VALUE;
        for(int i=0;i<right.length;i++){
            if(right[i]<minr){
                minr=right[i];
            }
        }


        return Math.max(maxl,n-minr);
    }
}