package unit5_递归和树.part4_深度优先遍历.topic4_双指针;

import unit5_递归和树.BinaryTree;
import unit5_递归和树.TreeNode;

/**
 * leetcode104 对称问题
 */
public class Symmetry {
    public static void main(String[] args) {
        BinaryTree bTree = new BinaryTree();

        bTree.root = bTree.buildBinaryTree3();
//        bTree.root = bTree.buildBinaryTreeComplex();

        boolean result;
        //LeetCode101 对称二叉树
        result = isSymmetric(bTree.root);
        System.out.println(result);
    }

    /**
     * LeetCode101 对称二叉树
     *
     * @param root
     * @return
     */
    public static boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }

        return check(root.left, root.right);
    }

    public static boolean check(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        if (p.val != q.val) {
            return false;
        }
        return check(p.left, q.right) && check(p.right, q.left);
    }

}
