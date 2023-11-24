class Solution {
    public int maxCoins(int[] p) {
        Arrays.sort(p);
        int n=p.length/3;
        int sum=0;
        for(int i=n;i<p.length;i+=2){
            System.out.println(p[i]);
            sum=sum+p[i];
        }
        
        return sum;
    }
}




     