package Tree;

import java.util.ArrayList;
import java.util.List;

/*94. Binary Tree Inorder Traversal

Given a binary tree, return the inorder traversal of its nodes' values.

Example:

Input: [1,null,2,3]
   1
    \
     2
    /
   3

Output: [1,3,2]*/

public class BinaryTreeInorderTraversal {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	List<Integer> result = new ArrayList<>();
	public List<Integer> inorderTraversal(TreeNode root) {
		if(root==null)
			return result;
		inorderTraversal(root.left);
		result.add(root.val);
		inorderTraversal(root.right);
		return result;
	}

}
