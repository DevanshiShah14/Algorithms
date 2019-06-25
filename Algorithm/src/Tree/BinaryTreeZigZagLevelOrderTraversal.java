package Tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/*103. Binary Tree Zigzag Level Order Traversal

Given a binary tree, return the zigzag level order traversal of its nodes' values. (ie, from left to right, then right to left for the next level and alternate between).

For example:
Given binary tree [3,9,20,null,null,15,7],
    3
   / \
  9  20
    /  \
   15   7
return its zigzag level order traversal as:
[
  [3],
  [20,9],
  [15,7]
]*/

public class BinaryTreeZigZagLevelOrderTraversal {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	List<List<Integer>> result = new LinkedList<>();
	int count = 0;
	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		if (root == null)
			return result;
		Queue<TreeNode> Qmain = new LinkedList<>();
		Qmain.add(root);
		count++;
		
		while (!Qmain.isEmpty()) {
			Queue<TreeNode> tempQueue = new LinkedList<>();
			List<Integer> tempList = new LinkedList<>();
			Stack<Integer> stack = new Stack<>();
			while (!Qmain.isEmpty()) {
				TreeNode curr = Qmain.remove();
				if(curr!=null) {
					if (count % 2 == 0) 
						stack.push(curr.val);
					else
						tempList.add(curr.val);
					tempQueue.add(curr.left);
					tempQueue.add(curr.right);
				}
				
			}
			if (count % 2 == 0) {
				while (!stack.isEmpty()) {
					tempList.add(stack.pop());
				}
			}				
			Qmain = tempQueue;
			if(!tempList.isEmpty())
				result.add(tempList);
			count++;
		}
		return result;
	}
}
