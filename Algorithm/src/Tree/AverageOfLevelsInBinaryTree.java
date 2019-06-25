package Tree;
/*637. Average of Levels in Binary Tree
Given a non-empty binary tree, return the average value of the nodes on each level in the form of an array.
Example 1:
Input:
    3
   / \
  9  20
    /  \
   15   7
Output: [3, 14.5, 11]
Explanation:
The average value of nodes on level 0 is 3,  on level 1 is 14.5, and on level 2 is 11. Hence return [3, 14.5, 11].*/

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageOfLevelsInBinaryTree {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}
	
	public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> qlist = new LinkedList<>();
        List<Double> result = new ArrayList<>();
		qlist.add(root);
		while (!qlist.isEmpty()) {
			long sum = 0;
            long count = 0;
			Queue<TreeNode> temp = new LinkedList<>();
			while (!qlist.isEmpty()) {
				TreeNode curr = qlist.remove();
				sum += curr.val;
				count++;
				if (curr.left != null)
					temp.add(curr.left);
				if (curr.right != null)
					temp.add(curr.right);
			}
			qlist = temp;
			result.add(sum*1.0 / count);
		}
		return result; 
    }
}
