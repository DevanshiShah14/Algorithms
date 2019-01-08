package string;

import java.util.Stack;

/**
 * 606. You need to construct a string consists of parenthesis and integers from a
 * binary tree with the preorder traversing way.
 * 
 * The null node needs to be represented by empty parenthesis pair "()". And you
 * need to omit all the empty parenthesis pairs that don't affect the one-to-one
 * mapping relationship between the string and the original binary tree.
 */

public class ConstructStringfromBinaryTree {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public String tree2str(TreeNode t) {

		if (t == null)return "";

		String result = t.val + "";
		String left = tree2str(t.left);
        String right = tree2str(t.right);
        
        if (left == "" && right == "") return result;
        if (left == "") return result + "()" + "(" + right + ")";
        if (right == "") return result + "(" + left + ")";
        return result + "(" + left + ")" + "(" + right + ")";
	}
}
