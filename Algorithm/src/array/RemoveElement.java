package array;

public class RemoveElement {
/**
 Given an array nums and a value val, 
 remove all instances of that value in-place and return the new length.
 Do not allocate extra space for another array, 
 you must do this by modifying the input array in-place with O(1) extra memory
 */
	public static void main(String args[]) {
		int nums[] = {0,1,2,2,3,0,4,2};
		int val = 2;
		int count = removeElement(nums, val);
		System.out.println("Lenght is:" + count);;
		
		for(int j=0; j<count; j++) {
			System.out.println(nums[j]);
		}
	}
	
	public static int removeElement(int[] nums, int val) {
		
		int count = 0;
		for(int i= 0; i<nums.length; i++) {
			if(nums[i]!= val) {
				nums[count] = nums[i];
				count++;
			}
		}
		return count;
        
    }
}
