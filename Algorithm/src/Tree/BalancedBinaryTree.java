package Tree;
/**
 *110 Given a binary tree, determine if it is height-balanced.

For this problem, a height-balanced binary tree is defined as:

a binary tree in which the depth of the two subtrees of every node never differ by more than 1.
 */

public class BalancedBinaryTree {

	private boolean isBalanced = true;
	public class TreeNode {
		     int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		 }
	
	public boolean isBalanced(TreeNode root) {
		int depth = 0;
		findlength(root,depth);
		return isBalanced;
        
    }

	private int findlength(TreeNode root, int depth) {
		if(root == null) {
            return depth;
        }
		if(root.left == null && root.right ==  null) {
            return depth;
        }
		int left = depth;
		int right = depth;
		
		if(root.left!= null && isBalanced== true)
		left = findlength(root.left,depth+1);
		
		if(root.right!= null&& isBalanced== true)
		right = findlength(root.right,depth+1);
		
		if(Math.abs(right-left)>1)
            isBalanced = false;
		
		return Math.max(left,right);
		
	}
}
