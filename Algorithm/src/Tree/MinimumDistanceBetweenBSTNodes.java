package Tree;

/*783. Minimum Distance Between BST Nodes
Given a Binary Search Tree (BST) with the root node root,
return the minimum difference between the values of any two different nodes in the tree.
Example :

Input: root = [4,2,6,1,3,null,null]
Output: 1
Explanation:
Note that root is a TreeNode object, not an array.

The given tree [4,2,6,1,3,null,null] is represented by the following diagram:

          4
        /   \
      2      6
     / \    
    1   3  

while the minimum difference in this tree is 1, it occurs between node 1 and node 2, also between node 3 and node 2.*/
public class MinimumDistanceBetweenBSTNodes {
	public class TreeNode {
		     int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		 }
	
	int diff = Integer.MAX_VALUE;
	int prev = -1;
	public int minDiffInBST(TreeNode root) {
		if(root==null)
			return diff;
		
		minDiffInBST(root.left);
		if(prev!=-1) {
			diff = Math.min(diff, root.val-prev);
		}
		prev = root.val;
		minDiffInBST(root.right);
		
		return diff;
	}
}
