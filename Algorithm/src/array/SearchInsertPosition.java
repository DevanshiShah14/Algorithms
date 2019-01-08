package array;

public class SearchInsertPosition {
	/**
	 Given a sorted array and a target value, return the index if the target is found. 
	 If not, return the index where it would be if it were inserted in order.
	 You may assume no duplicates in the array.
	 */
	
	public static void main(String args[]) {
		int nums[] = {1,3,5,6};
		int target = 0;
		
		System.out.println(searchInsert(nums, target));
	}
	
	public static int searchInsert(int[] nums, int target) {
		for(int i= 0; i<nums.length; i++) {
			
			if(nums[i]== target) {
				return i;
			}
			else if(nums[i]> target) {
				return i;
			}
		}
		
		return nums.length;
    }
}
