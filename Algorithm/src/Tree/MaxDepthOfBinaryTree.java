package Tree;

/**
 * 104. Given a binary tree, find its maximum depth.
 * 
 * The maximum depth is the number of nodes along the longest path from the root
 * node down to the farthest leaf node.
 * 
 * Note: A leaf is a node with no children.
 *
 */
public class MaxDepthOfBinaryTree {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public int maxDepth(TreeNode root) {
		return max(root,0);
	}

	public static int max(TreeNode root, int depth) {
		if(root==null)
			return depth;
		int left = max(root.left, depth+1);
		int right= max(root.right, depth+1);
		
		return (left>right? left : right);
	}
}
