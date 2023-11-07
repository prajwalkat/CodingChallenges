class Solution {
    public int eliminateMaximum(int[] dist, int[] speed) {
        int count=2;
        int n=dist.length;

        int[] x=new int[n];

        for(int i=0;i<n;i++){
            
            x[i]=dist[i]/speed[i];
            if(dist[i]%speed[i]==0){
                
            }else{
                x[i]=x[i]+1;
            }

        }   

        Arrays.sort(x);      
        System.out.println(Arrays.toString(x));

        int cm=0;

        for(int i=0;i<n;i++){
            if(x[i]>i){
                cm++;
            }else{
                return cm;
            }

        }




        // for(int i=0;i<n-1;i++){
        //     if(x[i]==x[i+1]){
        //         if(x[i]!=1){
        //         continue;
        //         }
        //         return count;
        //     }else{
        //         count++;
        //     }
        // }

       

        

        return cm;



    }
}