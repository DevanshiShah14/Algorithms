package linkedlist;

import java.util.LinkedList;

/**
 * Given a linked list, remove the n-th node from the end of list and return its
 * head.
 * 
 * Example:
 * 
 * Given linked list: 1->2->3->4->5, and n = 2.
 * 
 * After removing the second node from the end, the linked list becomes
 * 1->2->3->5. Could you do this in one pass?
 *
 */
public class RemoventhNodefromEnd {

	
	static ListNode head;

	public static void main(String args[]) {
		int n = 2;
		RemoventhNodefromEnd List = new RemoventhNodefromEnd();
		List.push(1);
		List.push(2);
		List.push(3);
		List.push(4);
		List.push(5);
		List.push(6);
		List.printList();
		List.removeNthFromEnd(head, n);
		List.printList();
	}

	public static void push(int data) {
		ListNode temp = new ListNode(data);
		temp.next = head;
		head = temp;
	}

	public static ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		ListNode first = dummy;
		ListNode second = dummy;

		for (int i = 1; i <= n + 1; i++) {
			first = first.next;
		}

		while (first != null) {
			first = first.next;
			second = second.next;
		}
		second.next = second.next.next;
		return dummy.next;
	}

	public static void printList() {
		ListNode tempp = head;
		while (tempp != null) {
			System.out.println(tempp.val);
			tempp = tempp.next;
		}
	}

	
}

class ListNode {
	int val;

	ListNode next;

	public ListNode(int x) {
		val = x;
		next = null;
	}
}
