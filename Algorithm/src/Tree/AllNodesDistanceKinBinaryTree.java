package Tree;

import java.util.ArrayList;
import java.util.List;

/*863. All Nodes Distance K in Binary Tree
We are given a binary tree (with root node root), a target node, and an integer value K.

Return a list of the values of all nodes that have a distance K from the target node. 
The answer can be returned in any order.
 
Example 1:

Input: root = [3,5,1,6,2,0,8,null,null,7,4], target = 5, K = 2

Output: [7,4,1]

Explanation: 
The nodes that are a distance 2 from the target node (with value 5)
have values 7, 4, and 1.

Note that the inputs "root" and "target" are actually TreeNodes.
The descriptions of the inputs above are just serializations of these objects.*/

public class AllNodesDistanceKinBinaryTree {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	List<Integer> result = new ArrayList<>();
	public List<Integer> distanceK(TreeNode root, TreeNode target, int K) {
		if(root==null)
			return null;
		int distance = findTarget(root,target, 0);
		System.out.println("Distance is: " + distance);
		if(root==target) findnodes(target,K,0);
		else {
			int count=-1;
			while(root!=target) { // know which side is this
				findnodes(root.left,count+1,0);
			}
			findnodes(root.left,K,0);
			findnodes(root,K-distance,0); // the opp side of target
		}
		return result;
	}
	
	public static int findTarget(TreeNode root, TreeNode target, int dist) {
		if(root==null)
			return 0;
		if(root==target)
			return dist;
			
		int left = findTarget(root.left, target, dist+1);
		if(left != 0) {
			return left;
		}
		int right = findTarget(root.right, target, dist+1);
		return right;
	}
	
	private void findnodes(TreeNode root, int K, int depth) {
		if(root==null)
			return;
		if(depth==K)
			result.add(root.val);
		else {
			findnodes(root.left,K, depth+1);
			findnodes(root.right,K,depth+1);
		}
	}
}
