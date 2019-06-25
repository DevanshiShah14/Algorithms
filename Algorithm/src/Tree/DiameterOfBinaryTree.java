package Tree;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/*543. Diameter of Binary Tree
Given a binary tree, you need to compute the length of the diameter of the tree.
The diameter of a binary tree is the length of the longest path between any two nodes in a tree.
This path may or may not pass through the root.

Example:
Given a binary tree 
          1
         / \
        2   3
       / \     
      4   5    
Return 3, which is the length of the path [4,2,1,3] or [5,2,1,3].

Note: The length of path between two nodes is represented by the number of edges between them.
*/
public class DiameterOfBinaryTree {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	Set<Integer> result = new HashSet<>();
	public int diameterOfBinaryTree(TreeNode root) {
		if(root==null)
			return 0;
		if(root.left == null && root.right == null)
			return 0;
		
		depth(root,0);
		return Collections.max(result);
		
	}

	public int depth(TreeNode root, int depth) {
		if(root.left ==null && root.right == null) {
			result.add(0);
			return 0;
		}
		else if(root.left != null && root.right == null) {
			int temp = 1 + depth(root.left, depth);
			result.add(temp);
			return temp;
		}
		else if(root.left == null && root.right != null) {
			int temp = 1 + depth(root.right, depth);
			result.add(temp);
			return temp;
		}else {
			int tempL = 1 + depth(root.left, depth);
			int tempR = 1 + depth(root.right, depth);
			result.add(tempL + tempR);
			return tempL + tempR;
		}
		
	}

}

/* Alernate solution with O(1) space.

int ans;
public int diameterOfBinaryTree(TreeNode root) {
    ans = 1;
    depth(root);
    return ans - 1;
}
public int depth(TreeNode node) {
    if (node == null) return 0;
    int L = depth(node.left);
    int R = depth(node.right);
    ans = Math.max(ans, L+R+1);
    return Math.max(L, R) + 1;
}*/