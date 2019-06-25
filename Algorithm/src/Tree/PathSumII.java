package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*13. Path Sum II
Given a binary tree and a sum, find all root-to-leaf paths where each path's sum equals the given sum.

Note: A leaf is a node with no children.

Example:

Given the below binary tree and sum = 22,

      5
     / \
    4   8
   /   / \
  11  13  4
 /  \    / \
7    2  5   1
Return:

[
   [5,4,11,2],
   [5,8,4,5]
]*/
public class PathSumII {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	List<List<Integer>> Result = new LinkedList<>();
	public List<List<Integer>> pathSum(TreeNode root, int sum) {
		List<Integer> temp = new LinkedList<>();
		getPath(root, sum,0, temp);
		return Result;
	}
	public void getPath(TreeNode root, int sum, int total, List<Integer> temp) {
		if(root==null)
			return;
		temp.add(root.val);
		total += root.val;
		if (total== sum && root.left==null && root.right==null) {
			Result.add(new ArrayList<Integer>(temp));
		} else {
        	getPath(root.left, sum, total, temp);
           
    		getPath(root.right, sum, total, temp);
    	     
        }
        temp.remove(temp.size()-1);
       		
	}
}
