package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SumOfRootToLeafBinaryNumbers {
	/*
	 * 1022. Sum of Root To Leaf Binary Numbers Easy
	 * 
	 * 92
	 * 
	 * 52
	 * 
	 * Favorite
	 * 
	 * Share Given a binary tree, each node has value 0 or 1. Each root-to-leaf path
	 * represents a binary number starting with the most significant bit. For
	 * example, if the path is 0 -> 1 -> 1 -> 0 -> 1, then this could represent
	 * 01101 in binary, which is 13.
	 * 
	 * For all leaves in the tree, consider the numbers represented by the path from
	 * the root to that leaf.
	 * 
	 * Return the sum of these numbers.
	 */

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}
	 public int sumRootToLeaf(TreeNode root) {
			String temp="";
	        List<Integer> result = new ArrayList<>();
			getSum(root, result, temp);
	        int sum = 0;
	        for(int value : result) {
	            sum +=value;
	        }
			return sum;
		}

		public void getSum(TreeNode root, List<Integer> result, String temp) {
			    if(root.left==null && root.right==null){
					temp = temp+root.val;
	                //System.out.println(Integer.parseInt(temp,2));
					result.add(Integer.parseInt(temp,2));
				}
	        else{
	            if(root.left!=null) {
					getSum(root.left, result, temp+root.val);
				}
				if(root.right!=null) {
					getSum(root.right,result, temp+root.val);
				}
	         }
	}
}
