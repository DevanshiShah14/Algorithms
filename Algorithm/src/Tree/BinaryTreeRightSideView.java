package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/*199. Binary Tree Right Side View

Given a binary tree, imagine yourself standing on the right side of it, return the values of the nodes you can see ordered from top to bottom.

Example:

Input: [1,2,3,null,5,null,4]
Output: [1, 3, 4]
Explanation:

   1            <---
 /   \
2     3         <---
 \     \
  5     4       <---*/

public class BinaryTreeRightSideView {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public List<Integer> rightSideView(TreeNode root) {
		Queue<TreeNode> Qmain = new LinkedList<>();
		List<Integer> result = new ArrayList<>();
		Qmain.add(root);
		if (root != null)
			result.add(root.val);
		while (!Qmain.isEmpty()) {
			Queue<TreeNode> Qtemp = new LinkedList<>();
			Stack<Integer> stack = new Stack<>();
			while (!Qmain.isEmpty()) {
				TreeNode curr = Qmain.remove();
				if (curr != null) {
					if (curr.left != null) {
						Qtemp.add(curr.left);
						stack.add(curr.left.val);
					}	
					if (curr.right != null) {
						Qtemp.add(curr.right);
						stack.add(curr.right.val);
					}	
				}
			}
			Qmain = Qtemp;
			if(!stack.isEmpty())
				result.add(stack.pop());
			
		}
		return result;
	}
}
