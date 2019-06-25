package linkedlist;

import java.util.ArrayList;
/* 141. Linked List Cycle
Given a linked list, determine if it has a cycle in it.
To represent a cycle in the given linked list, we use an integer pos which represents 
the position (0-indexed) in the linked list where tail connects to. If pos is -1, 
then there is no cycle in the linked list.

Example 1:

Input: head = [3,2,0,-4], pos = 1
Output: true
Explanation: There is a cycle in the linked list, where tail connects to the second node.
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