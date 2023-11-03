class Solution {
    public List<String> buildArray(int[] t, int n) {
        List<String> s1=new ArrayList<>();
        HashSet<Integer> hm=new HashSet<>();
        HashSet<Integer> h1=new HashSet<>();

        for(int i=0;i<t.length;i++){
            hm.add(t[i]);
        }


        for(int i=1;i<=n;i++){
            if(hm.contains(i)){
                s1.add("Push");
                h1.add(i);
            }else{
                s1.add("Push");
                s1.add("Pop");
                
            }
            
            System.out.println(h1+" "+hm);
            String S1=Arrays.toString(h1.toArray());

            String S2=Arrays.toString(hm.toArray());

            if(S1.compareTo(S2)==0){
                break;
            }

        }
                    



        return s1;


















        // List<String> s1=new ArrayList<>();
        // List<Integer> i1=new ArrayList<>();
        
        // int j=0;
        // for(int i=1;i<=n;i++){
            
            
        //         if(j<=t.length-1 && i==t[j]){
        //             s1.add("Push");
        //             i1.add(i);
        //         j++;
        //         }else{
        //         s1.add("Push");
        //         s1.add("Pop");
        //         }
            
        //     String s2= Arrays.toString(s1.toArray());
        //      String s4= Arrays.toString(i1.toArray());
        //     String s3= Arrays.toString(t);

        //     System.out.println(s4+" "+s3+" "+s4.compareTo(s2));
        //     if(s4.compareTo(s2)==0 || n==t.length){
                
        //         break;
        //     }



        // }


        // return s1;
    }
}