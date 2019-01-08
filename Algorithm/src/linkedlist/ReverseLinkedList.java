package linkedlist;
/**
 * 206. Reverse a singly linked list.

Example:

Input: 1->2->3->4->5->NULL
Output: 5->4->3->2->1->NULL
 */

public class ReverseLinkedList {
	public ListNode reverseList(ListNode head) {
	       if(head==null)
	           return head;
	        ListNode prev = null;
	        ListNode next = null;
	        ListNode current = head;
	        while(current!=null){
	            next = current.next;
	            current.next = prev;
	            prev = current;
	            current = next;
	        }
	        head = prev;
	        return head;
	    }
}
