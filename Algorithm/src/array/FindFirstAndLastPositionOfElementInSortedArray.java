package array;

public class FindFirstAndLastPositionOfElementInSortedArray {
	
	public static void main(String args[]) {
		int[] nums = {1};
		int target = 1;
		FindFirstAndLastPositionOfElementInSortedArray obj = new FindFirstAndLastPositionOfElementInSortedArray();
		obj.searchRange(nums, target);
	}
	public int[] searchRange(int[] nums, int target) {
		int[] result = new int[2];
		int start = -1; int end = -1;
		
		for(int i=0; i< nums.length; i++) {
			if(nums[i]==target) {
				start = i;
				
				while(i< nums.length && nums[i]==target) {
					end = i;
					i++;
				}
				break;				
			}
		}
		result[0] = start;
		result[1] = end;
		return result;
	}
}
