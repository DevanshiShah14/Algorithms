package string;
/**
 * 2. Given two strings, write a method to decide if one is a permutationof the other.
 * Cracking code interview
 */
import java.util.Arrays;
import java.util.Collections;

public class CheckPermutation {
	public static void main(String args[]) {
		String A = "abaa";
		String B = "aaba";
		System.out.println(checkPermutation(A,B));
	}

	private static boolean checkPermutation(final String A, final String B) {
		if (A.length() != B.length()) return false;
		
		char[] a = A.toCharArray();
		Arrays.sort(a);
		char[] b = B.toCharArray();
		Arrays.sort(b);
		//return new String(a).equals(new String (b));
		return Arrays.equals(a, b);
	}
}
