package Tree;

import java.util.ArrayList;
import java.util.List;

public class ConvertSortedListToBST {

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	
	public TreeNode sortedListToBST(ListNode head) {
		List<Integer> list = new ArrayList<>();
		
		while(head!=null) {
			list.add(head.val);
			head = head.next;
		}
		return binaryTree(list,0, list.size()-1);
	}
	
	public TreeNode binaryTree(List<Integer> list, int start, int end) {
		if(start> end)
			return null;
		int midpoint = start + (end -start)/2;
		TreeNode root = new TreeNode(list.get(midpoint));
		root.left = binaryTree(list, start, midpoint-1);
		root.right = binaryTree(list, midpoint+1,end);
		return root;
	}
}
