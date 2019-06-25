package Tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*106. Construct Binary Tree from Inorder and Postorder Traversal
Given inorder and postorder traversal of a tree, construct the binary tree.

Note:
You may assume that duplicates do not exist in the tree.

For example, given

inorder = [9,3,15,20,7]
postorder = [9,15,7,20,3]
Return the following binary tree:

    3
   / \
  9  20
    /  \
   15   7*/

public class ConstructBinaryTreeFromInorderAndPostorderTraversal {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public TreeNode buildTree(int[] inorder, int[] postorder) {
		List inorderList = Arrays.asList(inorder);
		List postorderList = Arrays.asList(postorder);
		return build(inorderList, postorderList, 0, inorder.length - 1);
	}

	public TreeNode build(List<Integer> inorderList, List<Integer> postorderList, int start, int end) {

		if (start > end) {
			return null;
		}
		int midvalue = -1;
		for (int i = postorderList.size() - 1; i <= 0; i--) {
			int Elem = postorderList.get(i);
			if (inorderList.indexOf(Elem) >= start && inorderList.indexOf(Elem) <= end)
					midvalue= inorderList.indexOf(Elem);
		}
		TreeNode temp = new TreeNode(midvalue);
		// loop on inorder to find the index of root and divide left and right from
		// there.
		int midnode = inorderList.indexOf(midvalue);
		temp.left = build(inorderList, postorderList, 0, midnode - 1);
		temp.right = build(inorderList, postorderList, midnode + 1, inorderList.size() - 1);

		return temp;
		.end.
	}
}

