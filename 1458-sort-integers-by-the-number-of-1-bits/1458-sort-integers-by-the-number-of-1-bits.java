class Solution {
    public int[] sortByBits(int[] a) {
        Arrays.sort(a);
        int[] cb=new int[a.length];
        ArrayList<Integer> b=new ArrayList<Integer>();
                for(int i=0;i<a.length;i++){
                    cb[i]=Integer.bitCount(a[i]);
                }

         for(int i=0;i<18;i++){
             for(int j=0;j<a.length;j++){
                 if(cb[j]==i){
                     b.add(a[j]);
                 }
             }

         }   
         int f[]=new int[a.length];
         Object x[]=b.toArray();
        //  System.out.println(Arrays.toString(x));
        for(int i=0;i<a.length;i++){
            f[i]=((Integer)x[i]).intValue();
        }
         b.clear();
         return f;
    }
}