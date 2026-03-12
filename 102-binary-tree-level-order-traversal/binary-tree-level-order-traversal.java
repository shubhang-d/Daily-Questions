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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        List<List<Integer>> lsa = new ArrayList<>();
        if(root == null) return lsa;
        while(!q.isEmpty()){
            List<Integer> ls = new ArrayList<>();
            int n = q.size();
            for(int i =0 ;i<n;i++){
                TreeNode node = q.poll();
                ls.add(node.val);
                if(node.left != null) q.offer(node.left);
                if(node.right != null) q.offer(node.right);
            }
            lsa.add(ls);
            
        }
        return lsa;
    }
}