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

    public int sum=0;
    public int count=0;
    public int fc=0;
    public int averageOfSubtree(TreeNode root) {
        
        printInorder(root);

        return fc;

    }

     public void printInorder(TreeNode node)
    {
        if (node == null)
            return;
        TreeNode y=node;
       
        printInorder(node.left);
        
        //
        printInorder(node.right);

        
        sum(y);
        int x=-1;
        if(count==0){}else{

        x=(int)(sum/count);
        sum=0;
        count=0;
        }
        if(node.val==x){
            fc++;
             
        }
       
    }

    
     public void sum(TreeNode node)
    {
        if (node == null)
            return;

        sum(node.right);    
        sum=sum+node.val;

        count++;

       

        
        sum(node.left);
        
        //
        
        
        
        
    }

    







}