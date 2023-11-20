//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}

class GFG
{
    static Node buildTree(String str)
    {
        // Corner Case
        if(str.length() == 0 || str.equals('N'))
            return null;
        String[] s = str.split(" ");
        
        Node root = new Node(Integer.parseInt(s[0]));
        Queue <Node> q = new LinkedList<Node>();
        q.add(root);
        
        // Starting from the second element
        int i = 1;
        while(!q.isEmpty() && i < s.length)
        {
              // Get and remove the front of the queue
              Node currNode = q.remove();
        
              // Get the current node's value from the string
              String currVal = s[i];
        
              // If the left child is not null
              if(!currVal.equals("N")) 
              {
        
                  // Create the left child for the current node
                  currNode.left = new Node(Integer.parseInt(currVal));
        
                  // Push it to the queue
                  q.add(currNode.left);
              }
        
              // For the right child
              i++;
              if(i >= s.length)
                  break;
              currVal = s[i];
        
              // If the right child is not null
              if(!currVal.equals("N")) 
              {
        
                  // Create the right child for the current node
                  currNode.right = new Node(Integer.parseInt(currVal));
        
                  // Push it to the queue
                  q.add(currNode.right);
              }
              
              i++;
        }
    
        return root;
    }
    
    public static void main(String args[]) throws IOException {
    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t>0)
        {
            String s = br.readLine();
            Node root = buildTree(s);
            int k = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            
            System.out.println(ob.sumK(root,k));
            t--;
        }
    }
}

// } Driver Code Ends


class Solution
{
    
    int k1 =0;
    int total=0;
    public int sumK(Node root,int k)
    {
        k1 = k;
        getnum(root,0);
                    // System.out.println("k ="+k1);

        return total;
        
    }
    // int rightStore=0;
    
    // public int deepleft(root){
    //     int sum=0;
    //     while (root!=null){
    //         sum = sum+ root.data;
    //         root = root.left;
    //     }
    //     return sum;
    // }
    // public int deepright(root){
    //     int sum=0;
    //     while (root!=null){
    //         sum = sum+ root.data;
    //         root = root.right;
    //     }
    //     return sum;
    // }
    ArrayList<Integer> st = new ArrayList<Integer>();
    public void count(){
        int temp=0;
        for(int i=st.size()-1; i>=0; i--){
            temp = temp+st.get(i);
            if(temp==k1){
                total++;
            }
            //             System.out.println("curr = "+st.get(i));
            // System.out.println("temp ="+temp);
            //             System.out.println("total ="+total);

        }
    }
    
    
    public void getnum(Node root, int i){
        if(root.left==null && root.right ==null){
            st.add(root.data);
            count();
            st.remove(i);
            return;
        }
        // if(root.data == k1){
        //     total++;
        // }
        st.add(i,root.data);
        if(root.left!= null){
            getnum(root.left,i+1);
        }
        if(root.right!=null){
            getnum(root.right,i+1);
        }
        count();
        st.remove(i);
        
        
        
    }
}


