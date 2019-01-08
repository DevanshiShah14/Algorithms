package Tree;

import java.util.HashSet;
import java.util.Iterator;

/**
 * 653. Given a Binary Search Tree and a target number,
 * return true if there exist two elements in the BST such that their
 * sum is equal to the given target
 */

public class TwoSumBST {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public boolean findTarget(TreeNode root, int k) {
		HashSet<Integer> treeElement = new HashSet<Integer>();
		return(addElement(treeElement,root, k));
	}

	private boolean addElement(HashSet<Integer> treeElement, TreeNode root, int k) {
		if(root==null)
			return false;
		
		if(treeElement.contains(k - root.val)) {
			return true;
		}
		else {
		treeElement.add(root.val);
		}
		
		return addElement(treeElement, root.left,k)|| addElement(treeElement, root.right,k);
		
	}
}
