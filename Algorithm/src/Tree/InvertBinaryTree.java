package Tree;
/**
 * 226. Invert a binary tree.

Example:

Input:

     4
   /   \
  2     7
 / \   / \
1   3 6   9
Output:

     4
   /   \
  7     2
 / \   / \
9   6 3   1
 */

public class InvertBinaryTree {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	 public TreeNode invertTree(TreeNode root) {
			if(root != null)
	            reverse(root);
			
			return root;
			}

		private void reverse(TreeNode node) {
			TreeNode temp = node.left;
			node.left = node.right;
			node.right = temp;
			if(node.left != null) {
				reverse(node.left);
			}
			if(node.right != null) {
				reverse(node.right);
			}
		}
	}


		/*if(root==null)
			return null;
		invert(root.left,root.right);
		return root;
	}
	
	public void invert(TreeNode t1, TreeNode t2) {
		TreeNode temp = new TreeNode(-1);
		if(t1== null && t2!=null) {
			temp.val= t2.val;
			t1=temp;
		}
		else if(t2== null && t1!=null) {
			temp.val= t1.val;
			t2=temp;
		}
		else if(t1!=null && t2!=null){
			temp.val = t1.val;
			t1.val = t2.val;
			t2.val = temp.val;
		}
		invert(t1 == null ? null:t1.left,t2 ==null? null:t2.right);
		invert(t1 == null ? null:t1.right,t2 ==null ? null:t2.left);
	}
}*/
