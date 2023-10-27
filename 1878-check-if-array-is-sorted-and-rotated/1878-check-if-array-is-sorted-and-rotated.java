class Solution {
    public boolean check(int[] n) {
        int[] b=Arrays.copyOf(n,n.length);
    boolean flag=false;
    Arrays.sort(n);
    int[] y =n;
        
    for(int x=0;x<n.length;x++){
        int[] a=new int[n.length];
        for(int i=0;i<n.length;i++){
            a[i]=b[(i+x)%n.length];
        }
        if(Arrays.equals(n,a)){
            return true;
        }
        
        
           
    
    }
    return flag;
    }
}