package homework.task2_linklist;

/**
 * 第四题：通过三次反转实现链表旋转
 * 参考链表讲义2.4.3，实现旋转有一种是将整个链表反转变成{5,4,3,2,1}，
 * 然后再将前K和N-K两个部分分别反转，也就是分别变成了{4,5}和{1,2,3},之后合并再一起就是需要的链表{4,5,1,2,3}了
 * 请你编程实现该功能
 * 考察内容:链表反转
 * <p>
 * 要求：
 * 1.必须同时实现rotateRight()和reverse()两个方法来完成功能，后者只完成链表反转，前者可以灵活实现，但是必须调用三次后者
 * 2.可以将原始链表拆分成两个子链表，但是不得创建新链表
 * 3.rotateRight()和reverse()的入参和返回值你可以根据自己的需要设置，
 */
public class RotateRight {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        Node head = initLinkedList(a);
        int k = 2;
        Node newHead = rotateRight(head,k);
//        这里应该输出 4 5 1 2 3
        printList(newHead);

    }

    /**
     * 通过rotateRight()方法和reverse()两个方法实现功能
     *
     * @param head
     * @return
     */
    private static Node rotateRight(Node head,int k) {

        reverse();
        reverse();
        reverse();
//这里只是为了编译器不报错而让返回null，你可以根据情况修改
        return null;
    }

    /**
     * 链表反转
     */
    private static void reverse() {

    }

    /**
     * 输出链表
     *
     * @param head 头节点
     */
    public static String printList(Node head) {
        Node current = head;
        StringBuilder sb = new StringBuilder();
        while (current != null) {
            sb.append(current.val).append("\t");
            current = current.next;
        }
        return sb.toString();
    }

    /**
     * 初始化链表
     *
     * @param array
     * @return
     */
    private static Node initLinkedList(int[] array) {
        Node head = null, cur = null;
        for (int i = 0; i < array.length; i++) {
            Node newNode = new Node(array[i]);
            newNode.next = null;
            if (i == 0) {
                head = newNode;
                cur = head;
            } else {
                cur.next = newNode;
                cur = newNode;
            }
        }
        return head;
    }

    static class Node {
        public int val;
        public Node next;

        Node(int x) {
            val = x;
            next = null;
        }
    }
}
