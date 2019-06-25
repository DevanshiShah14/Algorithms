package Tree;

public class CountCompleteTreeNodes {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	int nodes = 0;	
	public int countNodes(TreeNode root) {
		if(root==null)
			return nodes;
		if(root!=null)
			nodes++;
		countNodes(root.left);
		countNodes(root.right);
		
		return nodes;
	}
}
