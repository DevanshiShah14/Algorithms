package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
 * 102. Binary Tree Level Order Traversal
Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).

For example:
Given binary tree [3,9,20,null,null,15,7],
    3
   / \
  9  20
    /  \
   15   7
return its level order traversal as:
[
  [3],
  [9,20],
  [15,7]
]
 */
public class BinaryTreeLevelOrderTraversal {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	List<List<Integer>> result = new ArrayList<List<Integer>>();

	public List<List<Integer>> levelOrder(TreeNode root) {
		if (root == null)
			return result;
		Queue<TreeNode> QList = new LinkedList<>();
		QList.add(root);
		while (!QList.isEmpty()) {
			Queue<TreeNode> temp = new LinkedList<>();
			List<Integer> tempList = new ArrayList<Integer>();
			while (!QList.isEmpty()) {
				TreeNode curr = QList.remove();
				if (curr != null) {
					tempList.add(curr.val);
					if (curr.left != null)
						temp.add(curr.left);
					if (curr.right != null)
						temp.add(curr.right);
				}
			}
			QList = temp;
			result.add(tempList);
		}
		return result;
	}
}
