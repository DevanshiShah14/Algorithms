package linkedlist;

/**160 Write a program to find the node at which the intersection of two singly linked lists begins.


For example, the following two linked lists:

A:          a1 - a2
                   \
                     c1 - c2 - c3
                   /
B:     b1 -b2 - b3
begin to intersect at node c1.
Your code should preferably run in O(n) time and use only O(1) memory.
 */
public class IntersectionOfTwoLinkedList {

	 public class ListNode {
		     int val;
		      ListNode next;
		     
		      public ListNode(int x) {
		          val = x;
		          next = null;
		      }
		  }
	 
	 static ListNode HeadA;
	 static ListNode HeadB;
	 static int length = 0;
	 
	 public static void main(String args[]) {
		 ListNode List1 = HeadA;
		 ListNode List2 = HeadB;
		 
		 ListNode lengthA = HeadA;
		 ListNode lengthB = HeadB;
		 
		 while(lengthA!= null) {
			 lengthA = lengthA.next;
			 length++;
		 }
		 
		 while(lengthB!= null) {
			 lengthB = lengthB.next;
			 length++;
		 }
		 
		 System.out.println(getIntersectionNode(List1, List2));
		 
	 }
	 

	 public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		 if(headA== null || headB == null) {
			 return null;
		 }
		 ListNode list1 = headA;
		 ListNode list2 = headB;
		 
		 while(list1 != list2 && length!=0) {
			 if(list1==null) {
				 list1 = headB;
			 }
			 else if (list2== null) {
				 list2= headA;
			 }
			 list2 = list2.next;
			 list1 = list1.next;
			 length--;
		 }
		 
		return list1;    
	    }
}
