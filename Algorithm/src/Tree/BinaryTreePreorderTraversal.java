package Tree;

import java.util.ArrayList;
import java.util.List;

/*144. Binary Tree Preorder Traversal
Given a binary tree, return the preorder traversal of its nodes' values.

Example:

Input: [1,null,2,3]
   1
    \
     2
    /
   3

Output: [1,2,3]*/

public class BinaryTreePreorderTraversal {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	List<Integer> result = new ArrayList<>();
	public List<Integer> preorderTraversal(TreeNode root) {
		if(root==null)
			return result;
		preorderTraversal(root.left);
		preorderTraversal(root.right);
		result.add(root.val);
		
		return result;
	}
}
