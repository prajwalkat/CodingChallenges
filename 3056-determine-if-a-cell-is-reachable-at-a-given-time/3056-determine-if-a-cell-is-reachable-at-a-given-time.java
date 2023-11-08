class Solution {
    public boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {

        int x=Math.abs(sx-fx);
        int y=Math.abs(sy-fy);
        int max=Math.max(x,y);
        if(sy==fy &&sx==fx && t==1 ){
            return false;
        }
        //System.out.println(" "+x+" "+y+" "+max+" "+t);
        if(max>t){
            return false;
        }
        
        return true;
        

    }
}


/* 




*/