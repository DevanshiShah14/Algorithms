package array;

public class UniqueLongestSubstring {
	//leetcode - Datastructure
	/**
	 * Given a string, find the length of the longest substring without repeating characters.
	 * Examples:
	 * Given "abcabcbb", the answer is "abc", which the length is 3.
	 * Given "bbbbb", the answer is "b", with the length of 1.
	 * Given "pwwkew", the answer is "wke", with the length of 3. 
	 * Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
	 */
	
	public static void main(String args[]) {
		String input = "pwwkew";
		String substring = "";
		String inputCurrent = "";
		String LastLongestSubstring = "";
		for(int i=0; i<=input.length(); i++) {
			if(i == input.length()) {
				inputCurrent = input.substring(input.length()-1);
			}
			else {
				inputCurrent = input.substring(i, i+1);
			}
			if(substring.contains(inputCurrent)) {
						if(LastLongestSubstring.length() <  substring.length()) {
							LastLongestSubstring = substring;
						}
						substring= substring.substring(substring.indexOf(inputCurrent)+1, substring.length());
						substring +=inputCurrent;
			}
			else {
				substring +=inputCurrent;
			}
		}
		
		System.out.print("The length of Longest Substring is:" + LastLongestSubstring.length());
		System.out.print(" which is:" + LastLongestSubstring.toString());
	}
}
