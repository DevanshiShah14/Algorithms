package linkedlist;

import java.util.Iterator;
import java.util.Stack;

/**
 * 234. Given a singly linked list, determine if it is a palindrome. 
 * Could you do it in O(n) time and O(1) space?
 */

public class PalindromeLinkedList {

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public boolean isPalindrome(ListNode head) {
		
		if (head == null || head.next == null)
			return true;
		
		ListNode slow = head, fast = head;
		Stack<Integer> stack = new Stack<>();
		stack.push(slow.val);
		
		while(fast.next!=null && fast.next.next!=null) {
			slow= slow.next;
			fast=fast.next.next;
			stack.push(slow.val);
		}
		if(fast.next==null)
			stack.pop();
		
		slow = slow.next;
		
		while(slow!=null) {
			if(slow.val!=stack.pop()) {
				return false;
			}
			slow=slow.next;
		}
		return true;
	}
}
