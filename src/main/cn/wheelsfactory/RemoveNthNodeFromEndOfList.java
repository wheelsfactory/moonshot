package cn.wheelsfactory;

import cn.wheelsfactory.common.ListNode;

public class RemoveNthNodeFromEndOfList {
    public static ListNode removeNthNode(ListNode head, int n) {
	    ListNode fast = head;
	    ListNode slow = head;
	    ListNode result = new ListNode(0);
	    ListNode pre = result;
	    pre.next = slow;
	    for(int i=0;i<n;i++){
	        fast = fast.next;
        }
        while(fast.next!=null){
	        fast = fast.next;
	        slow = slow.next;
	        pre = pre.next;
        }
        pre.next = slow.next;

        return result.next;
	}
}


