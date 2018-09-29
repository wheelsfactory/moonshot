package cn.wheelsfactory.common;

public class LinkedListHelper {
    public static ListNode buildLinkedList(int[] array) {
        ListNode head = new ListNode(0);
        if (array == null || array.length == 0) return head;
        ListNode node = null;
        ListNode cur = head;
        for (int i = 0; i < array.length; i++) {
            node = new ListNode(array[i]);
            cur.next = node;
            cur = cur.next;
        }
        return head.next;
    }

    public static void printLinkedList(ListNode head) {
        ListNode cur = head;
        StringBuilder sb = new StringBuilder();
        while (cur != null) {
            sb.append(cur.val);
            cur = cur.next;
            if (cur != null) sb.append("->");
        }
        System.out.println(sb.toString());
    }
}
