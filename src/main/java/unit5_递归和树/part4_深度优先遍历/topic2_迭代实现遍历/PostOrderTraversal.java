package unit5_递归和树.part4_深度优先遍历.topic2_迭代实现遍历;

import unit5_递归和树.BinaryTree;
import unit5_递归和树.TreeNode;

import java.util.*;

/**
 * 基于迭代实现前序遍历
 */
public class PostOrderTraversal {
    public static void main(String[] args) {
        BinaryTree bTree = new BinaryTree();
        bTree.root = bTree.buildBinaryTree();
//        bTree.root = bTree.buildBinaryTree();

        System.out.println(postOrderTraversal(bTree.root));
    }

    /**
     * 反转法实现
     *
     * @param root
     * @return
     */

    public static List<Integer> postOrderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        while (!stack.isEmpty() || node != null) {
            while (node != null) {
                res.add(node.val);
                stack.push(node);
                node = node.right;
            }
            node = stack.pop();
            node = node.left;
        }
        Collections.reverse(res);
        return res;
    }
}
