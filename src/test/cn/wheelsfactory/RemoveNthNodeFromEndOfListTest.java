package cn.wheelsfactory;

import cn.wheelsfactory.common.LinkedListHelper;
import cn.wheelsfactory.common.ListNode;
import org.junit.Test;

public class RemoveNthNodeFromEndOfListTest {

    @Test
    public void testRemoveNthNodeFromEndOfList() {
        int[] array = {1, 2, 3, 4, 5};
        ListNode ll = LinkedListHelper.buildLinkedList(array);
        int pos = 2;
        LinkedListHelper.printLinkedList(RemoveNthNodeFromEndOfList.removeNthNode(ll, pos));
    }
}