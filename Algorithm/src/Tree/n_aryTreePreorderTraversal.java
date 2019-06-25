package Tree;

import java.util.LinkedList;
import java.util.List;

public class n_aryTreePreorderTraversal {
	
	class Node {
	    public int val;
	    public List<Node> children;

	    public Node() {}

	    public Node(int _val,List<Node> _children) {
	        val = _val;
	        children = _children;
	    }
	};
	
	List<Integer> result;
	 public List<Integer> preorder(Node root) {
	        result = new LinkedList<>();
	        if(root!=null)
	        	doPreorder(root, result);
	        return result;
	    }
	public void doPreorder(Node root, List<Integer> result) {
		if(root==null)
			return;
		result.add(root.val);
		for(Node childnode: root.children) {
			doPreorder(childnode, result);
		}
		
	}
}
