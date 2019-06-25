package Tree;

import Tree.practice.TreeNode;

public class IsSubtree {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public boolean isSubtree(TreeNode s, TreeNode t) {
		 boolean left = false;
			boolean right= false,root =false;
			if ((s!=null && t!=null) && s.val==t.val) {
				root = checktree(s, t);
			}		
			if(s.left!=null)
	            left = isSubtree(s.left, t);
	        if(s.right!=null)
			    right= isSubtree(s.right, t);
			
			return (left|| right || root );
		}

		public boolean checktree(TreeNode s, TreeNode t) {
			if((s!=null && t!=null) && s.val==t.val) {
				boolean left = checktree(s.left, t.left);
				boolean right = checktree(s.right, t.right);
				return left && right;
			}
			else if (s == null && t == null)
				return true;	
			else
				return false;
	}
}
