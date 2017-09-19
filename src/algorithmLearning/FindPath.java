package algorithmLearning;

import java.util.ArrayList;

/**
 * 输入一颗二叉树和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
 * 应用带记忆的深度优先遍历 遍历完一遍后要回退父节点
 */
public class FindPath {
    private ArrayList<ArrayList<Integer>> listAll = new ArrayList<ArrayList<Integer>>();
    private ArrayList<Integer>list = new ArrayList<Integer>();

    public ArrayList<ArrayList<Integer>> findPath(TreeNode root, int target) {
        if(root==null)
            return listAll;
        list.add(root.val);
        target -= root.val;
        if(target == 0&&root.left==null&&root.right==null)
            listAll.add(new ArrayList<Integer>(list));
        findPath(root.left,target);
        findPath(root.right,target);
        //深度遍历完一条路径后要回退父节点
        list.remove(list.size()-1);
        return listAll;
    }




    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }
}
