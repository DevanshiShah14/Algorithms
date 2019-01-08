package linkedlist;

import java.sql.Struct;

/**
 * 876. Given a non-empty, singly linked list with head node head, return a
 * middle node of linked list.
 * 
 * If there are two middle nodes, return the second middle node.
 *
 */
public class MiddleLinkedList {

	static class ListNode {
		int val;
		ListNode next;

		public ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public ListNode middleNode(ListNode head) {
		int length = 1;
		ListNode mid = new ListNode(0);
		ListNode temp = new ListNode(0);
		temp = head;
		while (temp.next != null) {
			temp = temp.next;
			length++;
		}

		length = length / 2;

		temp = head;
		for (int count = 0; count <= length; count++) {

			if (count == length) {
				return temp;
			}
			temp = temp.next;
		}
		return null;
	}
}
