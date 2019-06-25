package Tree;
/*938. Range Sum of BST
Given the root node of a binary search tree, return the sum of values of all nodes with value between L and R (inclusive).

The binary search tree is guaranteed to have unique values.

Example 1:
Input: root = [10,5,15,3,7,null,18], L = 7, R = 15
Output: 32

Example 2:
Input: root = [10,5,15,3,7,13,18,1,null,6], L = 6, R = 10
Output: 23*/

public class RangeSumOfBST {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}
	
	int sum = 0;
	public int rangeSumBST(TreeNode root, int L, int R) {
		if(root==null)
			return sum;
		if(root.val>= L && root.val<= R) {
			sum += root.val;
		}
		if(root.val>L)
		    rangeSumBST(root.left, L, R);
        
        if(root.val<R)
		    rangeSumBST(root.right, L, R);
		
		return sum;
	}
}