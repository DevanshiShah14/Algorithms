package array;

/*541. Reverse String II
Given a string and an integer k, you need to reverse the first k characters for every 2k characters counting from the start of the string. If there are less than k characters left, reverse all of them. If there are less than 2k but greater than or equal to k characters, then reverse the first k characters and left the other as original.
Example:
Input: s = "abcdefg", k = 2
Output: "bacdfeg"*/
public class ReverseStringII {
	public String reverseStr(String s, int k) {
		char[] a = s.toCharArray();
        int start=0;
		int end = Math.min(start+k-1, a.length-1);
		while(start< end) {
			char temp = a[start];
			a[start]= a[end];
			a[end]= temp;
			start++;
			end--;
		}
		return new String(a);
	}
}
