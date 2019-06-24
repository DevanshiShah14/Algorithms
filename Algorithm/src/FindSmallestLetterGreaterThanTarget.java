package array;
/* Topic: Binary Search
 * 744. Given a list of sorted characters letters containing only lowercase letters,
 * and given a target letter target, find the smallest element in the list that is larger than the given target.

Letters also wrap around. For example, if the target is target = 'z' and letters = ['a', 'b'], the answer is 'a'.
*/

public class FindSmallestLetterGreaterThanTarget {

	public static void main(String args[]) {
		char[] letters = { 'c', 'f', 'j' };
		char target = 'h';
		System.out.println(nextGreatestLetter(letters, target));
	}

	public static char nextGreatestLetter(char[] letters, char target) {
		int left = 0;
		int right = letters.length;
        
		while (left < right) {
			int mid = left + (right - left) / 2;

			if (letters[mid] <= target)
					 left = mid + 1;
			else 
				right = mid;
			}
		return letters[left % letters.length];
	}
}
