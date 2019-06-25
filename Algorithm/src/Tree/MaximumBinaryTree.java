package Tree;

/*654. Maximum Binary Tree

Given an integer array with no duplicates. A maximum tree building on this array is defined as follow:

The root is the maximum number in the array.
The left subtree is the maximum tree constructed from left part subarray divided by the maximum number.
The right subtree is the maximum tree constructed from right part subarray divided by the maximum number.
Construct the maximum tree by the given array and output the root node of this tree.
Example 1:
Input: [3,2,1,6,0,5]
Output: return the tree root node representing the following tree:

      6
    /   \
   3     5
    \    / 
     2  0   
       \
        1 */
public class MaximumBinaryTree {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	TreeNode Head = null;

	public TreeNode constructMaximumBinaryTree(int[] nums) {
		makeNode(nums, 0, nums.length);
		return Head;
	}

	private TreeNode makeNode(int[] nums, int start, int end) {
		if (start >= end)
			return null;
        if(start+1 == end)
            return new TreeNode(nums[start]);
		int mark = start;
		for (int k = start; k < end; k++) {
			if (nums[k] > nums[mark])
				mark = k;
		}
        TreeNode Head = new TreeNode(nums[mark]);
        Head.left = makeNode(nums, start, mark);
        Head.right = makeNode(nums, mark + 1, end);
		
		return Head;
	}
}
