import java.util.*;

class SeatManager {
    public int n;
    public int min=1;
    //public HashSet<Integer> hs;
     private PriorityQueue<Integer> queue;
   // public int[] un;
    public SeatManager(int n) {
          queue = new PriorityQueue<>();
        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }
       
       
        // this.n=n;
        // this.hs=new HashSet<Integer>();
        // // Arrays.fill(this.un,0);
    }
    
    public int reserve() {
      
       return (!queue.isEmpty())? queue.poll() : -1;
        // for(int i=min;i<=this.n;i++){
        //     if(!(this.hs.contains(i))){
        //         this.hs.add(i);
        //         this.min=i;
        //         return i;
        //     }
            
        // }
      

        // for(int i=0;i<this.un.length;i++){
        //     if(this.un[i]==0){
        //      this.un[i]=1;
        //      return i+1;   
        //     }
        // }
    //return 0;

    }
    
    public void unreserve(int s) {
    //    this.hs.remove(s);
    //    this.min=Integer.min(this.min,s);
        
      queue.offer(s);
    }
}

/**
 * Your SeatManager object will be instantiated and called as such:
 * SeatManager obj = new SeatManager(n);
 * int param_1 = obj.reserve();
 * obj.unreserve(seatNumber);
 */