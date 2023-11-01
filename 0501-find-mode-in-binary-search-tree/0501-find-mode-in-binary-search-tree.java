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
    public ArrayList<Integer> a=new ArrayList<>();
    HashMap<Integer,Integer> hm=new HashMap<>();
    int max=-1;
    public int[] findMode(TreeNode root) {
        
        TreeNode q=root;
        printInorder(q);
        Object[] c=a.toArray();
        System.out.println(Arrays.toString(c));
        Object[] d=hm.values().toArray();
        System.out.println(Arrays.toString(d) +max);
        int[] a1=new int[]{1,2};
        ArrayList<Integer> z=new ArrayList<>();
       
       
        for (Integer key : hm.keySet()) {
    Integer value = hm.get(key);
    if(value==max){
        z.add(key);
           System.out.println("Key: " + key + ", Value: " + value);
    }
    
    }

 
        


        int[] l=new int[z.size()];
    for(int i=0;i<l.length;i++){
        l[i]=z.remove(0);
    }
        int max=0;

        



        a.clear();
        hm.clear();
        return l;
    }

     public void printInorder(TreeNode node)
    {
        if (node == null)
            return;
 
       
        printInorder(node.left);
        a.add(node.val);
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