package Tree;

/*993. Cousins in Binary Tree

In a binary tree, the root node is at depth 0, and children of each depth k node are at depth k+1.

Two nodes of a binary tree are cousins if they have the same depth, but have different parents.

We are given the root of a binary tree with unique values, and the values x and y of two different 
nodes in the tree.

Return true if and only if the nodes corresponding to the values x and y are cousins.*/

public class CousinsInBinaryTree {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	int parent = -1;
	int P;
	public boolean isCousins(TreeNode root, int x, int y) {
		if (root == null)
			return true;
		P=root.val;
		int lenX = depth(root, x, 0);
		int Xparent = parent;
		int lenY = depth(root, y, 0);
		int Yparent = parent;
		if (lenX == lenY && Xparent != Yparent)
			return true;
		else
			return false;
	}

	private int depth(TreeNode root, int val, int len) {
		if (root == null)
			return -1;
		
		if (root.val == val) {
			return len;
		}
		if(root.left!=null && root.left.val==val)
			parent = root.val;
		else if(root.right!=null && root.right.val==val)
			parent = root.val;
		int leftLen = depth(root.left, val, len+1);
		int rightLen = depth(root.right, val, len+1);

		return leftLen > rightLen ? leftLen: rightLen;
	}
}
