class Solution {
    public int missingNumber(int[] n) {
        Arrays.sort(n);
        int x=0;
        for(int i=0;i<n.length-1;i++){
            if((n[i+1]-n[i])!=1){
                x=n[i]+1;
                break;
            }
        }
        if(n[0]==1){
            return 0;
        }
        if(x==0){
            x=n[n.length-1]+1;
        }
        return x;
    }
}