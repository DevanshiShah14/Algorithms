package Tree;
/*
 *687. Longest Univalue Path
Given a binary tree, find the length of the longest path where each node in the path has the same value.
This path may or may not pass through the root.
Note: The length of path between two nodes is represented by the number of edges between them.
Example 1:
Input:

              5
             / \
            4   5
           / \   \
          1   1   5
Output:
2
 */
public class LongestUnivaluePath {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	static int sum = 0;
	public int longestUnivaluePath(TreeNode root) {
		valuePath(root);
		return sum;
	}
	
	public static int valuePath(TreeNode root) {
		if(root==null)
			return 0;
		
		int left = valuePath(root.left);
		int right = valuePath(root.right);
		int leftpath = 0, rightpath = 0; 
		
		if(root.left!=null && root.val==root.left.val)
			leftpath += left + 1;
		if(root.right!=null && root.val==root.right.val)
			rightpath += right + 1;
		sum = Math.max(sum, leftpath+rightpath);
		return (leftpath> rightpath? leftpath : rightpath);
	}
}
