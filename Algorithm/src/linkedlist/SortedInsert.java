package linkedlist;

public class SortedInsert {
/**
 * Write a function to insert a new value in a sorted Circular Linked List (CLL)
 *
 */
	static class Node {
		int data;
		Node next;
		public Node(int d) {
			next = null;
			data = d;
		}
	}
	
	class LinkedList {
		Node Head;
		public LinkedList() {
			Head = null;
		}
		
		void insertElement(Node newNode) {
			Node current = Head;
			Node previous = null;
			LinkedList List1 = new LinkedList();
			if(current== null) {
				List1.Head = newNode;
				newNode.next = newNode;
			}
			else {
				while(current.next!= null) {
					if(current.data < newNode.data) {
						previous = current;
						current = current.next;
					}
					else if(current.data > newNode.data) {
						if(current == List1.Head) {
							while(current.next!= List1.Head) {
								previous= current;
								current = current.next;
							}
							List1.Head = newNode;
						}
						previous.next = newNode;
						newNode.next = current;
						break;
					}
				}
			}
		}
	}
		
	public static void main(String args[]) {
		
	}
}
