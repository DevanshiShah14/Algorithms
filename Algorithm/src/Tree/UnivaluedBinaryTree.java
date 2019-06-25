package Tree;
/*
 * 965. Univalued Binary Tree
A binary tree is univalued if every node in the tree has the same value.

Return true if and only if the given tree is univalued.
Example 1:

Input: [1,1,1,1,1,null,1]
Output: true
 */
public class UnivaluedBinaryTree {
	
	public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		 }
	
	public boolean isUnivalTree(TreeNode root) {
		if(root==null)
			return true;
		int value = root.val;
		return isValue(root, value);
	}
	
	public boolean isValue(TreeNode root,int val) {
		if(root==null)
			return true;
		if(root.val!= val)
			return false;
		return isValue(root.left, val) && isValue(root.right, val);
	}
}
