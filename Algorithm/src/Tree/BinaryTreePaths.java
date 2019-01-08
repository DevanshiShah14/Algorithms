package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BinaryTreePaths {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	 
	public List<String> binaryTreePaths(TreeNode root) {
		List<String> list = new LinkedList<String>();
		if(root==null)
			return list;
		Path(root, "", list);
		return list;
	}
	
	public static void Path(TreeNode root, String current, List<String> list) {
		if (!current.equals(""))
			current += "->" + root.val;
		else
			current+= root.val;
		if (root.left == null && root.right == null) {
			list.add(current);
		}
		if(root.left!=null)
			Path(root.left,current,list);
		if(root.right!=null)
			Path(root.right,current,list);
	}
}
