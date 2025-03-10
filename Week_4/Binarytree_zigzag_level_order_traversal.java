class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list = new LinkedList<>();
        if(root == null) return list;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean zigzag = false;
        while(!q.isEmpty()){
            int size = q.size();
            ArrayList<Integer> l = new ArrayList<>();
            while(size-- > 0){
                TreeNode temp = q.poll();
                if(temp.left!=null)
                    q.add(temp.left);
                if(temp.right!=null)
                    q.add(temp.right);
                if(zigzag){
                    l.add(0, temp.val);
                }else{
                    l.add(temp.val);
                }
            }
            zigzag = !zigzag;
            list.add(l);
        }
        return list;
    }
}