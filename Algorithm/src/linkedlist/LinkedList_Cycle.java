package linkedlist;

import java.util.ArrayList;
/** Given a linked list, determine if it has a cycle in it.

Follow up:
Can you solve it without using extra space?
*/


public class LinkedList_Cycle {

	static class ListNode {
		int data;
		ListNode next;

		public ListNode(int d) {
			next = null;
			data = d;
		}
		static ListNode Head;
	}

	public static boolean hasCycle(ListNode head) {
		
		if (head == null || head.next == null) {
			return false;
		}
		ListNode pointer1 = head;
		ListNode pointer2 = head;

		while (pointer1 !=null && pointer2!= null && pointer2.next!=null) {
			pointer1 = pointer1.next;
			pointer2 = pointer2.next.next;
            
            if(pointer1==pointer2)
                return true;
		}
		return false;
	}

}