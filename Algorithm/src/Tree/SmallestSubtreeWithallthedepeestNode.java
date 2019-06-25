package Tree;

/*865. Smallest Subtree with all the Deepest Nodes
Given a binary tree rooted at root, the depth of each node is the shortest distance to the root.

A node is deepest if it has the largest depth possible among any node in the entire tree.

The subtree of a node is that node, plus the set of all descendants of that node.

Return the node with the largest depth such that it contains all the deepest nodes in its subtree.

 

Example 1:

Input: [3,5,1,6,2,0,8,null,null,7,4]
Output: [2,7,4]
Explanation:



We return the node with value 2, colored in yellow in the diagram.
The nodes colored in blue are the deepest nodes of the tree.
The input "[3, 5, 1, 6, 2, 0, 8, null, null, 7, 4]" is a serialization of the given tree.
The output "[2, 7, 4]" is a serialization of the subtree rooted at the node with value 2.
Both the input and output have TreeNode type.*/
public class SmallestSubtreeWithallthedepeestNode {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	TreeNode root;
	TreeNode result = null;
	int height = Integer.MIN_VALUE;

	public TreeNode subtreeWithAllDeepest(TreeNode root) {
		checkDepth(root, 0);
		return result;
	}
	private int checkDepth(TreeNode root, int depth) {
		if (root == null) {
			return depth;
		}
		final int left = checkDepth(root.left, depth + 1);
		final int right = checkDepth(root.right, depth + 1);
		if (left > right) {
			if (left > height) {
				height = left;
				result = root.left;
			}
		} else if (right > left) {

			if (right > height) {
				height = right;
				result = root.right;
			}

		} else if ((right == left) && (left >= height)) {
			height = left;
			result = root;
		}
		return (left > right ? left : right);
	}
}
