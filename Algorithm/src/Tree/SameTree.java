package Tree;

/**
 * Given two binary trees, write a function to check if they are the same or
 * not.
 * 
 * Two binary trees are considered the same if they are structurally identical
 * and the nodes have the same value.
 * 
 * Example 1:
 * 
 * Input: 1 1 / \ / \ 2 3 2 3
 * 
 * [1,2,3], [1,2,3]
 * 
 * Output: true
 *
 */
public class SameTree {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		public TreeNode(int x) {
			val = x;
		}
	}

	static class BinaryTree {
		
		TreeNode root1, root2; 

		boolean isSameTree(TreeNode p, TreeNode q) {
			 if (p == null && q == null) {
					return true;
				}

				if (p != null && q != null) {
					return (p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right));
				}
				return false;
		}
	}
}
