package Tree;

import java.util.Collections;
import java.util.HashSet;

/**
 * Definition for a binary tree node.*/
public class MinDepthofBinaryTree {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}
    public int minDepth(TreeNode root) {
        if(root==null) {
			return 0;
		}
		int depth = 1;
		return findDepth(depth, root);
	}

	private int findDepth(int depth, TreeNode root) {
		
		if(root.left== null && root.right==null) {
			return depth;
		}
		int rightDepth= Integer.MAX_VALUE;
		int leftDepth= Integer.MAX_VALUE;
		
		if(root.right != null) {
			rightDepth = findDepth(depth+1, root.right);
		}
		if(root.left != null) {
			leftDepth = findDepth( depth+1, root.left);
		}
		return leftDepth < rightDepth ? leftDepth : rightDepth; 
    }
}

/**Alternate solution with more runtime
 * public class MinDepthofBinaryTree {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public int minDepth(TreeNode root) {
		
		if(root==null) {
			return 0;
		}
		int depth = 1;
		HashSet<Integer> hash = new HashSet<>();
		findDepth(hash, depth, root);
		int minDep = Collections.min(hash);
		return minDep;
	}

	private void findDepth(HashSet<Integer> hash, int depth, TreeNode root) {
		if(root == null) {
			return;
		}
		if(root.left== null && root.right==null) {
			hash.add(depth);
		}
		depth++;
		findDepth(hash, depth, root.left);
		findDepth(hash, depth, root.right);
		
	}
}
 */ 
