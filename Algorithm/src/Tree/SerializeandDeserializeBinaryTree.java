package Tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SerializeandDeserializeBinaryTree {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	ArrayList<Integer> list = new ArrayList<Integer>();
	String data = "";
	
	
	public String serialize(TreeNode root) {
		if(root==null)
			data +="null"+ ", ";
		else
			data+=root.val+", ";
		serialize(root.left);
		serialize(root.right);
		return data;
	}

	public TreeNode deserialize(String data) {
		ArrayList<String> DeList = new ArrayList<String>(Arrays.asList(data.split(",")));
		return doDeserialize(DeList);
		
	}
	
	public TreeNode doDeserialize(ArrayList<String> DeList) {
		if(DeList.size() > 0) {
			String value = DeList.get(0);
			int val;
			DeList.remove(0);
			
			if(value.equals("null")) {
				return null;
			} else {
				val = Integer.parseInt(value);
				TreeNode temp = new TreeNode(0);
				temp.val = val;
				temp.left = doDeserialize(DeList);
				temp.right = doDeserialize(DeList);
				return temp;
			}
			
			/*
			
			if(DeList.get(count)!= null && count == 0) {
				root.val = Integer.parseInt(DeList.get(count));
			}
			else if(DeList.get(count)!= null && count>0) {
				TreeNode temp = new TreeNode(0);
				temp.val = Integer.parseInt(DeList.get(count));
			}
			count++;
			doDeserialize(DeList, root.left);
			doDeserialize(DeList, root.right);
			*/
		}
		return null;
		.getClass()
	}
}
