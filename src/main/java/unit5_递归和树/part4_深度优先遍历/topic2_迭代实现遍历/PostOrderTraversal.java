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
     * @param root
     * @return
     */
    public static List<Integer> postOrderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            res.add(node.val);
            if (node.left != null) {
                stack.push(node.left);
            }
            if (node.right != null) {
                stack.push(node.right);
            }
        }
        Collections.reverse(res);
        return res;
    }

}
