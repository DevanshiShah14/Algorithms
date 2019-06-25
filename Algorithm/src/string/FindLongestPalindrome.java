package string;
/*Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.

Example 1:

Input: "babad"
Output: "bab"
Note: "aba" is also a valid answer.
Example 2:

Input: "cbbd"
Output: "bb"*/
public class FindLongestPalindrome {
	public static void main(String args[]) {
		String s = "dadad";
		FindLongestPalindrome obj = new FindLongestPalindrome();
		System.out.println(obj.longestPalin(s));
	}

	public String longestPalin(String s) {
		char[] C = s.toCharArray();
		String palin = "";
		int len = 0;
		for(int i=0; i< C.length; i++) {
			if(i!= C.length) {
				outerloop: for(int j = i+1; j< C.length; j++) {
					if(C[j]== C[i]) {
						if(j-i>1) {
							int start = i+1;
							int end = j-1;
							while(start<end) {
								if(C[start]!= C[end])
									break outerloop;
							}
						}
						len = ((j-i)>1? (j-i)+1:2); 
					}
				}
			}
		}
		System.out.println(len);
		return s;
	}
}
