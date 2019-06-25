package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*429. N-ary Tree Level Order Traversal
Given an n-ary tree, return the level order traversal of its nodes' values. 
		(ie, from left to right, level by level).

For example, given a 3-ary tree:
	
We should return its level order traversal:

[
     [1],
     [3,2,4],
     [5,6]
]*/

public class N_aryTreeLevelOrderTraversal {
	class Node {
	    public int val;
	    public List<Node> children;

	    public Node() {}

	    public Node(int _val,List<Node> _children) {
	        val = _val;
	        children = _children;
	    }
	};
	
	public List<List<Integer>> levelOrder(Node root) {
		List<List<Integer>> result = new ArrayList<>();
		if(root==null)
			return result;
		Queue<Node> Qmain = new LinkedList<>();
		Qmain.add(root);
		while(!Qmain.isEmpty()) {
			List<Integer> tempList = new ArrayList<>();
			Queue<Node> Qtemp = new LinkedList<>();
			while(!Qmain.isEmpty()) {
				Node curr = Qmain.remove();
				if(curr!=null) {
					tempList.add(curr.val);
					for(Node childnodes: curr.children) {
						Qtemp.add(childnodes);
					}
				}
			}
			Qmain = Qtemp;
			result.add(tempList);
		}
		return result;
	}
}
