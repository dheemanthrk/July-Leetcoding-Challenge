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
    
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        ArrayList<List<Integer>> result = new ArrayList<List<Integer>>();
        if(root == null) return result;
        Queue<TreeNode> Q = new LinkedList<>();
        Q.add(root);
        while(!Q.isEmpty()){
            int n = Q.size();
            List<Integer> nodes = new ArrayList();
            for(int i = 0; i < n; ++i){
                TreeNode node = Q.poll();
                nodes.add(node.val);
                if(node.left != null) Q.add(node.left);
                if(node.right != null) Q.add(node.right);
            }
            result.add(0, nodes);
        }
        return result;
    }
}