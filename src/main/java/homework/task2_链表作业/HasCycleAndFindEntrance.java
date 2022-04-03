package homework.task2_链表作业;

public class HasCycleAndFindEntrance {
    /**
     * 第一题：
     * 在讲义2.4.4.1 三次双指针法部分，我们介绍了三次使用双指针，来确定是否环的入口的方法
     * 现在请你实现这个功能
     * 要求：
     * 1.你只需要定义两个指针slow和fast就可以了，第二次第三次使用时可以复用
     * 2.代码必须能运行，否则视为0分
     */
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};
        ListNode nodeA = initLinkedListHasCycle(a);

        ListNode result = detectCycleByTwoPoint(nodeA);

        System.out.println(result.val);

    }


    /**
     * 方法2 三次使用双指针找到环的入口
     *
     * @param head
     * @return
     */

    public static ListNode detectCycleByTwoPoint(ListNode head) {
        //可以修改返回值
        return null;
    }


    /**
     * 构造存在环的链表
     *
     * @param array
     * @return
     */
    private static ListNode initLinkedListHasCycle(int[] array) {
        ListNode head = null, cur = null;
        ListNode cross = null;
        for (int i = 0; i < array.length; i++) {
            ListNode newNode = new ListNode(array[i]);
            newNode.next = null;
            if (i == 0) {
                head = newNode;
                cur = head;
            } else {
                cur.next = newNode;
                cur = newNode;
                //找到中间位置结点
                if (i == array.length / 2) {
                    cross = cur;
                }
            }
        }
        //制造环
        cur.next = cross;
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
