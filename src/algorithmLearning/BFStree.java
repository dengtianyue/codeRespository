package algorithmLearning;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 二叉树的广度优先遍历 即从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 * 借用一个辅助队列 先将根节点入列
 * 根节点出列并输出,并先后将其左右子节点加入队列
 */
public class BFStree {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        if (root == null) {
            return list;
            }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode treeNode = queue.poll();
            if (treeNode.left != null) {
                queue.offer(treeNode.left);
                }
            if (treeNode.right != null) {
                queue.offer(treeNode.right);
                }
            list.add(treeNode.val);
            }
        return list;

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
