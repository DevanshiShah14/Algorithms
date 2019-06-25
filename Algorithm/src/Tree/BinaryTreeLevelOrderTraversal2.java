package Tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*107. Binary Tree Level Order Traversal II
Given a binary tree, return the bottom-up level order traversal of its nodes' values. 
(ie, from left to right, level by level from leaf to root).

For example:
Given binary tree [3,9,20,null,null,15,7],
    3
   / \
  9  20
    /  \
   15   7
return its bottom-up level order traversal as:
[
  [15,7],
  [9,20],
  [3]
]*/
public class BinaryTreeLevelOrderTraversal2 {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	List<List<Integer>> result = new ArrayList<>();

	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		if (root == null)
			return null;
		Collections.reverse(OrderBottom(root));
		return result;
	}

	public List<List<Integer>> OrderBottom(TreeNode root) {
		if (root == null)
			return null;
		Queue<TreeNode> QList = new LinkedList<>();
		QList.add(root);
		while (!QList.isEmpty()) {
			Queue<TreeNode> temp = new LinkedList<>();
			List<Integer> tempList = new ArrayList<>();
			while (!QList.isEmpty()) {
				TreeNode curr = QList.remove();
				tempList.add(curr.val);
				if (curr.left != null)
					temp.add(curr.left);
				if (curr.right != null)
					temp.add(curr.right);
			}
			QList = temp;
			result.add(tempList);
		}
		return result;
	}
}
