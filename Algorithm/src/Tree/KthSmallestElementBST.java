package Tree;

import java.util.ArrayList;
import java.util.List;

/*230. Kth Smallest Element in a BST
Given a binary search tree, write a function kthSmallest to find the kth smallest element in it.

Note: 
You may assume k is always valid, 1 ≤ k ≤ BST's total elements.

Example 1:

Input: root = [3,1,4,null,2], k = 1
   3
  / \
 1   4
  \
   2
Output: 1
Example 2:

Input: root = [5,3,6,2,4,null,null,1], k = 3
       5
      / \
     3   6
    / \
   2   4
  /
 1
Output: 3*/

public class KthSmallestElementBST {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	List<Integer> result = new ArrayList<>();
	public int kthSmallest(TreeNode root, int k) {
		if(root==null)
			return 0;
		List<Integer> result = inorder(root);
		if(result.size()< k)
			return 0;
		return result.get(k-1);
	}
	
	public List<Integer> inorder(TreeNode root) {
		if(root==null)
			return result;
		inorder(root.left);
		result.add(root.val);
		inorder(root.right);
		
		return result;	
	}
}
