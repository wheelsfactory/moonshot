package cn.wheelsfactory;


import cn.wheelsfactory.common.ListNode;

public class FindLaterHalfList {
    public static ListNode FindLaterHalfList(ListNode head) {
 ListNode fast = head;
	    ListNode slow = head;
	    while(fast.next!=null && fast.next.next!=null){
	        fast = fast.next.next;
	        slow = slow.next;
        }
        if(fast.next==null){
	        return slow;
        } else {
	        return slow.next;
        }
	}
}


