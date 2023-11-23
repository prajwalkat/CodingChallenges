class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
      
        List<Boolean> li =new ArrayList<>();
        
        
        for(int i=0;i<l.length;i++){
            int[] j=Arrays.copyOfRange(nums, l[i], r[i]+1);
            System.out.println(Arrays.toString(j));
            li.add(check(j));
        }
        
        
        return li;
        
    }
    
   
    
    
    
    
    public boolean check(int [] a){
        Arrays.sort(a);
        
        
        
        for(int i=0;i<a.length-2;i++){
            if(!(a[i]-a[i+1]==a[i+1]-a[i+2])){
                return false;
            }
        }
        
        
        
        
        return true;
        
    }
}