package linkedlist;

import java.util.ArrayList;

/* 2. Add Two Numbers You are given two non-empty linked lists representing two
	 * non-negative integers. The digits are stored in reverse order and each of
	 * their nodes contain a single digit. Add the two numbers and return it as a
	 * linked list. You may assume the two numbers do not contain any leading zero,
	 * except the number 0 itself. Example:
	 * 
	 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4) Output: 7 -> 0 -> 8 Explanation: 342 +
	 * 465 = 807.
	 */

public class AddTwoNumbers {

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode head = new ListNode(0);
		ListNode curr = head, list1 = l1, list2 = l2;
		int sum = 0, carryBit = 0;
		while (list1 != null || list2 != null) {
			int x = (list1!=null)? list1.val : 0;
			int y = (list2!=null)? list2.val : 0;
			sum = x+ y+ carryBit;
			carryBit = sum / 10;
			curr.next = new ListNode(sum % 10);
			curr = curr.next;
			if(list1!=null) list1=list1.next;
			if(list2!=null) list2=list2.next;
		}
		if(carryBit>0)
			curr.next = new ListNode(carryBit);
		return head.next;
	}

	public static void main(String args[]) {
		/*
		 * ArrayList<Integer> List1 = new ArrayList<>(); List1.add(2); List1.add(4);
		 * List1.add(3);
		 * 
		 * ArrayList<Integer> List2 = new ArrayList<>(); List2.add(5); List2.add(6);
		 * List2.add(4); List2.add(1);
		 * 
		 * Collections.reverse(List1); Collections.reverse(List2);
		 * Addition(List1,List2); }
		 * 
		 * private static void Addition(List<Integer> list1, List<Integer> list2) { int
		 * i = 0; int j = 0; int Int1 =0; int Int2 = 0; while (i < list1.size()) { Int1
		 * = Integer.valueOf(String.valueOf(Int1) + String.valueOf(list1.get(i))); i++;
		 * } while (j < list2.size()) { Int2 = Integer.valueOf(String.valueOf(Int2) +
		 * String.valueOf(list2.get(j))); j++; } int sum = Int1 + Int2;
		 * ArrayList<Integer> output = new ArrayList<>();
		 * 
		 * while(sum> 0) { output.add(sum%10); sum = sum/10; }
		 * System.out.println(output.toString()); }
		 */}
}