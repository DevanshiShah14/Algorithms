package hashing;
/** 82. Given a sorted linked list, delete all nodes that have duplicate numbers,
 * leaving only distinct numbers from the original list.

Example 1:

Input: 1->2->3->3->4->4->5
Output: 1->2->5
**/

public class RemoveDuplicatesFromSortedListII {

	public class ListNode{
		int val;
		ListNode next
		
		ListNode(int x) {
			next = null;
			val = x;
		}
	}
		
	public ListNode deleteDuplicates(ListNode head) {
		if(head==null|| head.next==null)
			return head;
		ListNode current = head;
		ListNode previous = new ListNode(-1);
		previous.next=head;
		ListNode next = head;
		while(current!=null) {
			
		}
		return head;
        
    }
}
