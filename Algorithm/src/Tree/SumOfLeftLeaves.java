package Tree;

/*
 * 404. Sum of Left Leaves
Find the sum of all left leaves in a given binary tree.

Example:

    3
   / \
  9  20
    /  \
   15   7

There are two left leaves in the binary tree, with values 9 and 15 respectively. Return 24.
 */
public class SumOfLeftLeaves {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	int sum = 0;

	public int sumOfLeftLeaves(TreeNode root) {
		if (root != null) {
			return totalLeftLeaves(root, 'R');
		}
		return 0;
	}

	public int totalLeftLeaves(TreeNode root, Character function) {
		if (root == null)
			return sum;
		if (root.left == null && root.right == null && function.equals('L')) {
			sumOfLeftLeaves(root.left);
			sum += root.val;
			System.out.println(sum);
		}
		totalLeftLeaves(root.left, 'L');
		totalLeftLeaves(root.right, 'R');
		return sum;
	}
}
