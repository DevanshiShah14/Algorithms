package linkedlist;

import java.util.HashSet;

/*83. Remove Duplicates from Sorted List
Given a sorted linked list, delete all duplicates such that each element appear only once.

Example 1:

Input: 1->1->2
Output: 1->2
Example 2:

Input: 1->1->2->3->3
Output: 1->2->3*/

public class RemoveDuplicatesFromSortedList {

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public ListNode deleteDuplicates(ListNode head) {
		if(head==null)
			return head;
		HashSet<Integer> hash = new HashSet<>();
		ListNode curr = head;
		ListNode prev = head;
		while(curr!=null) {
			if(hash.contains(curr.val)) {
				prev.next = curr.next;
			}
            else{
                hash.add(curr.val);
			    prev= curr;
            }
			curr=curr.next;
			
		}
		return head;
	}
}
