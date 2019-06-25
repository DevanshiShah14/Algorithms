package Tree;

import java.util.Stack;

/*173. Binary Search Tree Iterator
Implement an iterator over a binary search tree (BST). 
Your iterator will be initialized with the root node of a BST.

Calling next() will return the next smallest number in the BST.
Example:

BSTIterator iterator = new BSTIterator(root);
iterator.next();    // return 3
iterator.next();    // return 7
iterator.hasNext(); // return true
iterator.next();    // return 9
iterator.hasNext(); // return true
iterator.next();    // return 15
iterator.hasNext(); // return true
iterator.next();    // return 20
iterator.hasNext(); // return false*/
public class BSTIterator {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}
	 Stack<Integer> stack = new Stack<Integer>();
	 public void bstIterator(TreeNode root) {
	        if(root==null)
	        	return;
	        bstIterator(root.left);
	        stack.push(root.val);
	        bstIterator(root.right);
	    }
	    
	    /** @return the next smallest number */
	    public int next() {
	    	 if(stack.peek()==null)
	    		 return -1;
	    	 else
	    		 return stack.pop();
	    }
	    
	    /** @return whether we have a next smallest number */
	    public boolean hasNext() {
	        return !stack.isEmpty();
	    }
}
