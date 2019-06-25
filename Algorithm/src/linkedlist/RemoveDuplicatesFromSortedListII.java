package linkedlist;
/** 82. Given a sorted linked list, delete all nodes that have duplicate numbers,
 * leaving only distinct numbers from the original list.

Example 1:

Input: 1->2->3->3->4->4->5
Output: 1->2->5
**/

public class RemoveDuplicatesFromSortedListII {

	public class ListNode{
		int val;
		ListNode next;
		
		ListNode(int x) {
			next = null;
			val = x;
		}
	}
		
	public ListNode deleteDuplicates(ListNode head) {
		if(head==null)
			return head;
		ListNode curr = head;
		ListNode prev = new ListNode(-1);
		ListNode next = head.next;
		prev.next=head;
		
		while(next!=null) {
			if(curr.val==next.val) {
				while(next!=null && curr.val==next.val) {
					next= next.next;
				}
				if(curr==head) {
					head=next;
					if(head==null)
						return head;
					else {
						curr = head;
						prev.next = head;
					}
				}
				else
					prev.next= next;
			}
			else {
				prev = curr;
			}

			curr = next;
			if(next.next!=null)
				next= next.next;
		}
		return head;
        
    }
}
