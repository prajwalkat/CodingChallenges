class Solution {
    public int getWinner(int[] a, int k) {
       int cmax=-1;
       int cwin=a[0];
       int wcnt=0;
       int j=0;
       int[] b=new int[a.length];
       for(int i=0;i<a.length-1;i++){
           if(cwin>a[i+1]){
               wcnt++;
                System.out.println(cwin+" wins "+wcnt +" times");
           }else if(cwin<a[i+1]){
               cwin=a[i+1];
               wcnt=1;
               System.out.println(cwin+" wins "+wcnt +" times");


       }

       if(wcnt==k){
           return cwin;
       } 


    }


    if(cwin>a[a.length-1]){
               wcnt++;
                System.out.println(cwin+" wins "+wcnt +" times");
           }else if(cwin<a[a.length-1]){
               cwin=a[a.length-1];
               wcnt=1;
               System.out.println(cwin+" wins "+wcnt +" times");


       }

       return cwin;



    
}


}

