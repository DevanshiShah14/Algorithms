package linkedlist;
/* 21. Merge two sorted linked lists and return it as a new list. 
 * The new list should be made by splicing together the nodes of the first two lists.

Example:

Input: 1->2->4, 1->3->4
Output: 1->1->2->3->4->4 */

public class MergeTwoSortedLists {

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if (l1 == null)
			return l2;
		if (l2 == null)
			return l1;
		ListNode newList = new ListNode(0);
		ListNode head = newList;
		ListNode temp = new ListNode(0);
		if (l1.val <= l2.val) {
			temp = l1;
			l1 = l1.next;
		} else {
			temp = l2;
			l2 = l2.next;
		}
		newList.val = temp.val;
		while (l1 != null && l2 != null) {
			ListNode temp1 = new ListNode(0);
			if (l1.val <= l2.val) {
				temp1.val = l1.val;
				l1 = l1.next;
			} else {
				temp1.val = l2.val;
				l2 = l2.next;
			}
			newList.next = temp1;
			newList = newList.next;
		}
		if (l1 == null) {
			while (l2 != null) {
				ListNode temp1 = new ListNode(0);
				temp1.val = l2.val;
				l2 = l2.next;
				newList.next = temp1;
				newList = newList.next;
			}
		}
		if (l2 == null) {
			while (l1 != null) {
				ListNode temp1 = new ListNode(0);
				temp1.val = l1.val;
				l1 = l1.next;
				newList.next = temp1;
				newList = newList.next;
			}
		}
		return head;
	}
}
