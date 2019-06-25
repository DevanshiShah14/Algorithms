package Tree;
/*145. Binary Tree Postorder Traversal
Given a binary tree, return the postorder traversal of its nodes' values.

Example:

Input: [1,null,2,3]
   1
    \
     2
    /
   3

Output: [3,2,1]*/

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePostorderTraversal {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	List<Integer> result = new ArrayList<>();

	public List<Integer> postorderTraversal(TreeNode root) {
		if (root == null)
			return result;

		postorderTraversal(root.left);
		postorderTraversal(root.right);
		result.add(root.val);

		return result;
	}
}
