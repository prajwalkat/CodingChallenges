/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    
    HashMap<Integer,Integer> hm=new HashMap<>();
    int max=-1;
    public int[] findMode(TreeNode root) {
        
       
        printInorder(root);
        ArrayList<Integer> z=new ArrayList<>();
       
       
        for (Integer key : hm.keySet()) {
    Integer value = hm.get(key);
    if(value==max){
        z.add(key);
    }
    
    }

 
        


        int[] l=new int[z.size()];
    for(int i=0;i<l.length;i++){
        l[i]=z.remove(0);
    }
        int max=0;

        



        
        hm.clear();
        return l;
    }

     public void printInorder(TreeNode node)
    {
        if (node == null)
            return;
 
       
        printInorder(node.left);
       
        if(hm.get(node.val)==null){
            int j=1;
             if(j>max){
            max=j;
        }
            hm.put(node.val,1);
        }else{
        int x=hm.get(node.val)+1;
        if(x>max){
            max=x;
        }

         hm.put(node.val,x);
        }
        printInorder(node.right);
    }



}