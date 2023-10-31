class Solution {
    public int[] findArray(int[] p) {
        int[] a = new int[p.length];
        a[0]=p[0];
        for(int i=1;i<p.length;i++){
            a[i]=p[i-1]^p[i];
        }
        return a;
    }
}