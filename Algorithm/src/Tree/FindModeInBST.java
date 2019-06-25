package Tree;

import java.util.ArrayList;
import java.util.List;

/*501. Find Mode in Binary Search Tree
Given a binary search tree (BST) with duplicates, find all the mode(s) (the most frequently occurred element) in the given BST.

Assume a BST is defined as follows:

The left subtree of a node contains only nodes with keys less than or equal to the node's key.
The right subtree of a node contains only nodes with keys greater than or equal to the node's key.
Both the left and right subtrees must also be binary search trees.
 

For example:
Given BST [1,null,2,2],

   1
    \
     2
    /
   2
 

return [2].*/

public class FindModeInBST {
	
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}
	int count = 0;
	int maxValue = 0;
	int maxCount = 0;
	public int[] findMode(TreeNode root) {
		if(root==null)
			return new int[0];
		List<Integer> result = new ArrayList<Integer>();
		inorder(root, result);
		return result.stream().mapToInt(i->i).toArray();
	}
	
	void inorder(TreeNode root, List<Integer> result) {
		if(root==null)
			return;
		inorder(root.left,result);
		
		if(root.val==maxValue)
			count++;
		else
		{
			maxValue = root.val;
			count=1;
		}
		
		if(count> maxCount) {
			result.clear();
			result.add(root.val);
			maxCount = count;
		}
		else if(count==maxCount) {
			result.add(root.val);
		}
		inorder(root.right, result);
	}

}
