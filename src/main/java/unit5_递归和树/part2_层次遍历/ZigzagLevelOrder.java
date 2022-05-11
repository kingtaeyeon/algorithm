package unit5_递归和树.part2_层次遍历;

import unit5_递归和树.BinaryTree;
import unit5_递归和树.TreeNode;

import java.util.*;

/**
 * LeetCode103 题，
 * 给定一个二叉树，返回其节点值的锯齿形层序遍历。
 * （即先从左往右，再从右往左进行下一层遍历，以此类推，层与层之间交替进行）
 */
public class ZigzagLevelOrder {

    public static void main(String[] args) {
        BinaryTree bTree = new BinaryTree();
        bTree.root = bTree.buildBinaryTree();
        List<List<Integer>> level = test(bTree.root);
        System.out.println(level.toString());
    }

    public static List<List<Integer>> test(TreeNode root) {
        LinkedList<List<Integer>> result = new LinkedList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean isOrderLeft = true;
        while (!queue.isEmpty()) {
            LinkedList<Integer> lines = new LinkedList<>();
            int size = queue.size();
            for (int i = 0; i < size; ++i) {
                TreeNode node = queue.poll();
                if (isOrderLeft) {
                    lines.addLast(node.val);
                } else {
                    lines.addFirst(node.val);
                }
                TreeNode left = node.getLeft();
                if (Objects.nonNull(left)) {
                    queue.add(left);
                }
                TreeNode right = node.getRight();
                if (Objects.nonNull(right)) {
                    queue.add(right);
                }
            }
//          result.add(new LinkedList<Integer>(lines));
            result.add(lines);
            isOrderLeft = !isOrderLeft;
        }
        return result;
    }




    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new LinkedList<List<Integer>>();
        if (root == null) {
            return ans;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        boolean isOrderLeft = true;
        while (!queue.isEmpty()) {
            Deque<Integer> levelList = new LinkedList<Integer>();
            int size = queue.size();
            for (int i = 0; i < size; ++i) {
                TreeNode curNode = queue.poll();
                if (isOrderLeft) {
                    levelList.offerLast(curNode.val);
                } else {
                    levelList.offerFirst(curNode.val);
                }
                if (curNode.left != null) {
                    queue.offer(curNode.left);
                }
                if (curNode.right != null) {
                    queue.offer(curNode.right);
                }
            }
            ans.add(new LinkedList<Integer>(levelList));
            isOrderLeft = !isOrderLeft;
        }
        return ans;
    }

}
















//    public static void main(String[] args) {
//        BinaryTree bTree = new BinaryTree();
//        bTree.root = bTree.buildBinaryTree();
//        List<List<Integer>> level = zigzagLevelOrder(bTree.root);
//        System.out.println(level.toString());
//    }

























