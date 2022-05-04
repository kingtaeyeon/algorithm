package unit5_递归和树.part4_深度优先遍历.topic7_翻转;

import unit5_递归和树.BinaryTree;
import unit5_递归和树.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class FindBottomLeftValue {
    public static void main(String[] args) {
        BinaryTree bTree = new BinaryTree();
        bTree.root = bTree.buildBinaryTree();
        System.out.println(findBottomLeftValue(bTree.root));
    }

    public static int findBottomLeftValue(TreeNode root) {
        if (root.left == null && root.right == null) {
            return root.val;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        TreeNode temp = new TreeNode(-100);

        while (!queue.isEmpty()) {
            temp = queue.poll();
            if (temp.right != null) {
                // 先把右节点加入 queue
                queue.offer(temp.right);
            }
            if (temp.left != null) {
                // 再把左节点加入 queue
                queue.offer(temp.left);
            }
        }
        return temp.val;
    }
}
