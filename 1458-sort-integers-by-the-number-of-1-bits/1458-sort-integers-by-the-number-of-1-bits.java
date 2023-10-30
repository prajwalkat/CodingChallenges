class cc implements Comparator<Integer>{
     @Override
    public int compare(Integer o1, Integer o2) {
       if(Integer.bitCount(o1)<Integer.bitCount(o2)){

           return -1;
       }
       
       if(Integer.bitCount(o1)>Integer.bitCount(o2)){
           return 1;
       }
       if(Integer.bitCount(o1)==Integer.bitCount(o2)){
           if(o1<o2){return -1;}
           if(o1>o2){return 1;}
           if(o1==o2){return 0;}
       }
       
       return 0;
       
    }
}


class Solution {
    public int[] sortByBits(int[] a) {
        // Arrays.sort(a);
        // int[] cb=new int[a.length];
        // ArrayList<Integer> b=new ArrayList<Integer>();
        //         for(int i=0;i<a.length;i++){
        //             cb[i]=Integer.bitCount(a[i]);
        //         }

        //  for(int i=0;i<18;i++){
        //      for(int j=0;j<a.length;j++){
        //          if(cb[j]==i){
        //              b.add(a[j]);
        //          }
        //      }

        //  }   
        //  int f[]=new int[a.length];
        //  Object x[]=b.toArray();
        // //  System.out.println(Arrays.toString(x));
        // for(int i=0;i<a.length;i++){
        //     f[i]=((Integer)x[i]).intValue();
        // }
        //  b.clear();
        //  return f;

        cc is=new cc();

        
        Integer[] b = Arrays.stream(a).boxed().toArray( Integer[]::new );
        Arrays.parallelSort(b,is);
       // System.out.println(Arrays.toString(b));

        for(int i=0;i<b.length;i++){
            a[i]=b[i];
        }
        return a;


    }
}