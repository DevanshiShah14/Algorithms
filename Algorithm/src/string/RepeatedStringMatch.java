package string;

/**
 * 686. Given two strings A and B, find the minimum number of times A has to be
 * repeated such that B is a substring of it. If no such solution, return -1.
 * For example, with A = "abcd" and B = "cdabcdab". Return 3, because by
 * repeating A three times (“abcdabcdabcd”), B is a substring of it; and B is
 * not a substring of A repeated two times ("abcdabcd")
 */
public class RepeatedStringMatch {
	public static void main(String args[]) {
		String A = "abc";
		String B= "cabcabca";
		System.out.println(repeatedStringMatch(A, B));
	}
	
	public static int repeatedStringMatch(String A, String B) {
		int count = 1;
		String result = A;
		while(B.length()>result.length())
		{
			result+=A;
			count++;
		}
		
		if(result.contains(B))
			return count;
		
		result+=A;
		count++;
		 return result.contains(B)? count : -1;
	}
}
