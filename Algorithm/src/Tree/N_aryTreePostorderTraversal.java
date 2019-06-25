package Tree;
import java.util.LinkedList;
import java.util.List;

/*590. N-ary Tree Postorder Traversal
Given an n-ary tree, return the postorder traversal of its nodes' values.

For example, given a 3-ary tree:
Return its postorder traversal as: [5,6,3,2,4,1]*/

public class N_aryTreePostorderTraversal {

	class Node {
		public int val;
		public List<Node> children;

		public Node() {
		}

		public Node(int _val, List<Node> _children) {
			val = _val;
			children = _children;
		}
	};

	public List<Integer> postorder(Node root) {
		List<Integer> result =new LinkedList<>();
		if(root!=null) {
			doPostorder(root, result);
			result.add(root.val);
		}
			
		return result;
	}

	private void doPostorder(Node root, List<Integer> result) {
		if(root==null)
			return;
		for(Node childnodes: root.children) {
			doPostorder(childnodes, result);
			result.add(childnodes.val);
		}
		
	}
}
