package Tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*515. Find Largest Value in Each Tree Row
You need to find the largest value in each row of a binary tree.

Example:
Input: 

          1
         / \
        3   2
       / \   \  
      5   3   9 

Output: [1, 3, 9]*/

public class FindLargestValueinEachTreeRow {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public List<Integer> largestValues(TreeNode root) {
		List<Integer> result = new ArrayList<>();
		if(root==null)
			return null;
		Queue<TreeNode> Qmain = new LinkedList<>();
		Qmain.add(root);
		result.add(root.val);
		while(!Qmain.isEmpty()) {
			Queue<TreeNode> Qtemp = new LinkedList<>();
			List<Integer> tempList = new ArrayList<>();
			while(!Qmain.isEmpty()) {
				TreeNode curr = Qmain.remove();
				if(curr!=null) {
					if(curr.left!=null) {
						Qtemp.add(curr.left);
						tempList.add(curr.left.val);
					}
					if(curr.right!=null) {
						Qtemp.add(curr.right);
						tempList.add(curr.right.val);
					}
				}
			}
			if(tempList!=null && tempList.size()>0)
				result.add(Collections.max(tempList));
			Qmain = Qtemp;
		}
		return result;
	}

}
