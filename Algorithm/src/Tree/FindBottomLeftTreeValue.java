package Tree;

import java.util.LinkedList;
import java.util.Queue;

import javax.management.Query;

/*513. Find Bottom Left Tree Value

Given a binary tree, find the leftmost value in the last row of the tree.

Example 1:
Input:

    2
   / \
  1   3

Output:
1
Example 2: 
Input:

        1
       / \
      2   3
     /   / \
    4   5   6
       /
      7

Output:
7*/

public class FindBottomLeftTreeValue {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public int findBottomLeftValue(TreeNode root) {
		if(root==null)
			return 0;
		Queue<TreeNode> Qmain = new LinkedList<>();
		int leftmost = root.val;
		Qmain.add(root);
		while(!Qmain.isEmpty()) {
			Queue<TreeNode> Qtemp = new LinkedList<>();
			while(!Qmain.isEmpty()) {
				TreeNode curr = Qmain.remove();
				if(curr!=null) {
					if(curr.left!=null) Qtemp.add(curr.left);
					if(curr.right!=null) Qtemp.add(curr.right);
				}
			}
			if(!Qtemp.isEmpty())
				leftmost = Qtemp.peek().val;
			Qmain = Qtemp;
		}
		
		return leftmost;
	}
}
