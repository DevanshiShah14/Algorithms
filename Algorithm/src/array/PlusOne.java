package array;

/**
 * Given a non-empty array of digits representing a non-negative integer, plus
 * one to the integer.
 * 
 * The digits are stored such that the most significant digit is at the head of
 * the list, and each element in the array contain a single digit.
 * 
 * You may assume the integer does not contain any leading zero, except the
 * number 0 itself.
 */

public class PlusOne {
	static int carry = 0;

	public static void main(String args[]) {
		int digits[] = {1,2,3};
		int temp[] = plusOne(digits);
		for (int j = 0; j < temp.length; j++) {
			System.out.print(temp[j] + ",");
		}
	}

	public static int[] plusOne(int[] digits) {
		for (int i = digits.length - 1; i >= 0; i--) {
			if (digits[i] == 9) {
				digits[i] = 0;
				carry = 1;
			} else {
				digits[i] = digits[i] + 1;
				carry = 0;
				break;
			}
		}
		if (carry == 1) {
			int[] digits1 = new int[digits.length + 1];

			for (int k = 0; k < digits1.length; k++) {
				if (k == 0)
					digits1[k] = 1;
				else
					digits1[k] = digits[k - 1];
			}
			return digits1;
		}
		return digits;
	}
}
