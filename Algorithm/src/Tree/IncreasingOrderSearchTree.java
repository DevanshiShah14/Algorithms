package Tree;

import sort.IncreasingOrderTree.TreeNode;

/** 897. Increasing Order Search Tree
 * Given a tree, rearrange the tree in in-order so that the leftmost node in the
 * tree is now the root of the tree, and every node has no left child and only 1
 * right child.
 *Example 1:
Input: [5,3,6,2,4,null,8,1,null,null,null,7,9]

       5
      / \
    3    6
   / \    \
  2   4    8
 /        / \ 
1        7   9

Output: [1,null,2,null,3,null,4,null,5,null,6,null,7,null,8,null,9]

 1
  \
   2
    \
     3
      \
       4
        \
         5
          \
           6
            \
             7
              \
               8
                \
                 9  
 */

public class IncreasingOrderSearchTree {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	TreeNode temp =new TreeNode(-1);
    TreeNode head = new TreeNode(-1);
    public TreeNode increasingBST(TreeNode root) {
        if (root == null)
			return null;
		
		increasingBST(root.left);
		
		if(head.val!=-1){
         temp.right= new TreeNode(root.val);
         temp.left = null;
		 temp = temp.right;   
        }
			
		else {
			head = new TreeNode(root.val);
            temp = head;
		}
			
		increasingBST(root.right);
		
		return head;
	}

}

/*TreeNode head = null;
public TreeNode increasingBST(TreeNode root) {
	if(root==null)
		return root;

	increasingBST(root.left);
	if(head == null)
		head = root;
	else 
		head.right = root;
	head.left= null;
	increasingBST(root.right);
	
	return head;
}*/
