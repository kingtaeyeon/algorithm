package homework.task2_linklist;

/**
 * 第二题
 * 讲义3.5.1我们使用栈实现了链表相加功能， 如果使用链表反转该怎么呢？现在请你实现这个功能
 *
 * 要求：
 * 1.链表反转必须是一个独立的方法，在plusOne里只可以处理数据，然后交给reverse()方法来实现反转功能，
 * 这么做是为了要求你必须熟记链表反转方法，面试遇到时几秒就能完成。
 * 2.请保证提交的代码能执行，不能执行或者执行结果不对，视为0分
 *
 */
public class PlusOne {
    public static void main(String[] args) {
        int[] a = {9,9,9};
//        int[] a = {1, 2, 3};
        ListNode nodeA = initLinkedList(a);

        ListNode node = plusOne(nodeA);

        System.out.println(toString(node));

    }

    /**
     * 这里实现你的功能
     * @param head
     * @return
     */
    public static ListNode plusOne(ListNode head) {
//        参数可以修改
        reverse();
        //这里仅仅为了编译能过，你可以修改返回值
        return null;
    }

    /**
     * 实现链表反转功能
     * @return
     */
    public static ListNode reverse() {

        return null;
    }

    /**
     * 初始化链表
     *
     * @param array
     * @return
     */
    private static ListNode initLinkedList(int[] array) {
        ListNode head = null, cur = null;

        for (int i = 0; i < array.length; i++) {
            ListNode newNode = new ListNode(array[i]);
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


    /**
     * 输出链表
     *
     * @param head 头节点
     */
    public static String toString(ListNode head) {
        ListNode current = head;
        StringBuilder sb = new StringBuilder();
        while (current != null) {
            sb.append(current.val).append("\t");
            current = current.next;
        }
        return sb.toString();
    }

    static class ListNode {
        public int val;
        public ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
