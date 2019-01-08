package Tree;
/** 559. Given a n-ary tree, find its maximum depth.
The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
**/

import java.util.List;

public class MaximumDepthofNaryTree {
	class Node {
		public int val;
		public List<Node> children;

		public Node() {
		}

		public Node(int _val, List<Node> _children) {
			val = _val;
			children = _children;
		}
		
		public int maxDepth(Node root) {
			
			return val;
	        
	    }
	}
}
