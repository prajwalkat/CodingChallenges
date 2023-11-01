class Cus implements Comparator<Integer> {
public int compare(Integer s1, Integer s2) {
String c1=s1.toString()+s2.toString();
String c2=s2.toString()+s1.toString();
int diff=-(c1.compareTo(c2));




return diff;
}
}


class Solution {


 


    public String largestNumber(int[] n) {
        Integer[] a =new Integer[n.length];
        for(int i=0;i<n.length;i++){
            a[i]=n[i];
        }
        Cus na=new Cus();
        Arrays.sort(a,na);
        System.out.println(Arrays.toString(a));
        String res="";
        for(int i=0;i<a.length;i++){
            String s=a[i].toString();
            res=res+s;
        }
        
        char c=res.charAt(0);
        if(c=='0'){
            return "0";
        }

        return res;
    }



}