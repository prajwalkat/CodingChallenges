//{ Driver Code Starts
import java.io.*;
import java.util.*;
class Node 
{
    int data;
    Node next;
    
    Node(int a)
        {
            data = a;
            next = null;
        }
}
class GfG
{
    static Scanner sc = new Scanner(System.in);
    public static Node inputList(int size)
    {
        Node head, tail;
        int val;
        
        val = sc.nextInt();
        
        head = tail = new Node(val);
        
        size--;
        
        while(size-->0)
        {
            val = sc.nextInt();
            tail.next = new Node(val);
            tail = tail.next;
        }
        
        return head;
    }
    
    public static void printList(Node n)
    {
        while(n!=null)
        {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }
    
    public static void main(String args[])
        {
            
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n , m;
                    
                    n = sc.nextInt();
                    m = sc.nextInt();
                    
                    Node head1 = inputList(n);
                    Node head2 = inputList(m);
                    
                    Solution obj = new Solution();
                    
                    Node result = obj.findIntersection(head1, head2);
	    
	                printList(result);
	                System.out.println();
                }
        }
}
// } Driver Code Ends


/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class Solution
{
   public static Node findIntersection(Node h1, Node h2)
    {
        // code here.
        HashMap<Integer,Integer> hm=new HashMap<>();
       // hm.add(h1.data);
        while(h1!=null){
            
            
           if(hm.containsKey(h1.data)){
               hm.put(h1.data,hm.get(h1.data)+1);
               
           }else{
               hm.put(h1.data,1);
           }
           
           
           
            h1=h1.next;
        }
        
          //hm.merge(h1.data, 1,(k,v) -> v+1);
           
       // System.out.println(hm.toString());
        
        
        
        Node n=null;
        Node d=null;
        
        while(h2!=null){
            
            
          if(hm.containsKey(h2.data) && hm.get(h2.data)>0 ){
              //hm.merge(h2.data, 1,(k,v) -> v-1);
              int x=hm.get(h2.data)-1;
              hm.put(h2.data,x);
              //System.out.println(hm.toString());
              if(n==null){
                  n= new Node(h2.data);
                  d=n;
              }else{
                 d.next=new Node(h2.data);
                 d=d.next;
              }
              
          }  
          h2=h2.next;
            
            
            
        }
        
    //    System.out.println(hm.toString());
        
        
        
        //  while(h2.next!=null){
            
        //     if(hm.contains(h2.data)){
        //         System.out.println(" "+h2.data);
        //       n.data=h2.data; 
        //       //n=n.next;
              
        //     }
        //     h2=h2.next;
        // }
        
        // n=n.next;
        // if(hm.contains(h2.data)){
        //       n.data=h2.data; 
               
              
        //     }
        // n.next=null;
        
        
        
        return n;
    }
}