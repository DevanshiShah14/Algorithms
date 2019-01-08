package Tree;
/**
 * 101. Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).

For example, this binary tree [1,2,2,3,4,4,3] is symmetric:

    1
   / \
  2   2
 / \ / \
3  4 4  3
 */

public class SymmetricTree {
	
	public class TreeNode {
		     int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
	
	 public boolean isSymmetric(TreeNode root) {
		 if(root==null)
			 return true;
		 return compare(root.left,root.right);
	    }
	 
	 public boolean compare(TreeNode p1, TreeNode p2) {
		 if((p1==null && p2!=null) || (p1!=null && p2==null))
			 return false;
		 else if(p1==null && p2==null)
			 return true;
		 else if(p1.val!=p2.val)
			 return false;
		 else
			 return compare(p1.left,p2.right) && compare(p1.right, p2.left);
		 
	 }
}
