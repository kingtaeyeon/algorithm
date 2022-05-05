package unit6_查找.topic3_堆;

import unit3_链表就这些题.part1_basicLinkList.ListNode;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Leetcode23.给你一个链表数组，每个链表都已经按升序排列。
 * 请你将所有链表合并到一个升序链表中，返回合并后的链表。
 */
public class topic3_2_3MergeKLists {
    public static void main(String[] args) {


    }

    public static ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;

        PriorityQueue<ListNode> q = new PriorityQueue<>(Comparator.comparing(node -> node.val));
        for (int i = 0; i < lists.length; i++) {
            if (lists[i] != null) {
                q.add(lists[i]);
            }
        }

        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        while (!q.isEmpty()) {
            tail.next = q.poll();
            tail = tail.next;
            if (tail.next != null) {
                q.add(tail.next);
            }
        }
        return dummy.next;
    }
}
