package Tree;

/**
 * Given a tree, rearrange the tree in in-order so that the leftmost node in the
 * tree is now the root of the tree, and every node has no left child and only 1
 * right child.
 *
 */

public class IncreasingOrderSearchTree {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	TreeNode prev = null, head = null;

	public TreeNode increasingBST(TreeNode root) {
		if (root == null) {
			return null;
		}

		increasingBST(root.left);

		if (prev != null) { //set new tree value
			root.left = null;
			prev.right = root;
		}

		if (head == null)
			head = root;
		prev = root;

		if (root.right != null) {
			return (increasingBST(root.right));
		}
		return head;
	}
}
