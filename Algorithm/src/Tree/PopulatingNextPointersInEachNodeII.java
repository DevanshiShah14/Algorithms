package Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Node {
	public int val;
	public Node left;
	public Node right;
	public Node next;

	public Node() {
	}

	public Node(int _val, Node _left, Node _right, Node _next) {
		val = _val;
		left = _left;
		right = _right;
		next = _next;
	}
};

public class PopulatingNextPointersInEachNodeII {

	public Node connect(Node root) {
		if (root == null)
			return root;
		root.next = null;
		if (root.left == null && root.right == null) {
			return root;
		}
		Queue<Node> Qmain = new LinkedList<>();
		Qmain.add(root);
		while (!Qmain.isEmpty()) {
			System.out.println("enters");
			Queue<Node> Qtemp = new LinkedList<>();
			while (!Qmain.isEmpty()) {
				Node curr = Qmain.remove();
				if (curr != null) {
					if (curr.left != null)
						Qtemp.add(curr.left);
					if (curr.right != null)
						Qtemp.add(curr.right);
				}
			}
			Qmain = Qtemp;
			for(Node cur: Qtemp) {
				Qmain.add(cur);
			}
			if (!Qtemp.isEmpty()) {
				Node prev = Qtemp.remove();
				while (!Qtemp.isEmpty()) {
					Node curr = Qtemp.remove();
					prev.next = curr;
					prev = curr;
				}
				prev.next=null;
			}
		}
		return root;
	}
}
