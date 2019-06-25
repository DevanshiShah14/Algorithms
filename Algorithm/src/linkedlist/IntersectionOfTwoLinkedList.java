package linkedlist;

/*160 Write a program to find the node at which the intersection of two singly linked lists begins.


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

	 public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		 if(headA== null || headB == null) {
			 return null;
		 }
		 int lengthA=0;
		 int lengthB=0;
		 
		 ListNode list1 = headA;
		 ListNode list2 = headB;
		 
		 while(list1!=null) {
			 lengthA++;
			 list1= list1.next;
		 }
		 while(list2!=null) {
			 lengthB++;
			 list2= list2.next;
		 }
		 if(lengthA>lengthB) {
			 int diff = lengthA - lengthB;
			 for(int i=0; i<diff; i++) {
				 if(headA!=null)
					 headA = headA.next;
			 }
		 }
		 else if(lengthB>lengthA) {
			 int diff = lengthB - lengthA;
			 for(int i=0; i<diff; i++) {
				 if(headB!=null)
					 headB = headB.next;
			 }
		 }
			 
		 while(headA!=null && headB!=null) {
			 if(headA==headB)
				 return headA;
			 headA = headA.next;
			 headB = headB.next;
		 }
		return null;   
	    }
}
