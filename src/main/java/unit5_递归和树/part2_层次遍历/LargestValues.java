package unit5_递归和树.part2_层次遍历;

import unit5_递归和树.BinaryTree;
import unit5_递归和树.TreeNode;

import java.util.*;

/**
 * LeetCode 515题目要求：
 * 给定一棵二叉树的根节点 root ，请找出该二叉树中每一层的最大值。
 */
public class LargestValues {
    public static void main(String[] args) {
        BinaryTree bTree = new BinaryTree();
        bTree.root = bTree.buildBinaryTree();
        List<Integer> level = largestValues(bTree.root);
        System.out.println(level.toString());
    }

    public static List<Integer> largestValues(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Deque<TreeNode> deque = new ArrayDeque<>();

        if (root != null) {
            deque.addLast(root);
        }

        while (!deque.isEmpty()) {
            int size = deque.size();
            int levelMaxNum = Integer.MIN_VALUE;
            for (int i = 0; i < size; i++) {
                TreeNode node = deque.poll();
                levelMaxNum = Math.max(node.val, levelMaxNum);
                if (node.left != null) deque.addLast(node.left);
                if (node.right != null) deque.addLast(node.right);
            }
            res.add(levelMaxNum);
        }
        return res;
    }
}

