package array;

import javax.print.attribute.standard.PrinterLocation;

public class LongestCommonPrefix {
	/**
	 * 14. Write a function to find the longest common prefix string amongst an
	 * array of strings.
	 * 
	 * If there is no common prefix, return an empty string "".
	 */

	public static void main(String args[]) {

		String[] input = { "aca", "cba"};
		System.out.println("Longest Prefix is: " + longestCommonPrefix(input));
	}

	public static String longestCommonPrefix(String[] strs) {
		String prefix = "";
		if(strs.length==0)
			return prefix;
		if(strs.length==1)
			return strs[0];
		String output = strs[0];
		for (int i = 1; i < strs.length; i++) {
			if (strs[i].startsWith(output)) {
				prefix = output;
			} else {
				// compare characters to find common prefix
				prefix = "";
				for (int j = 0; j < strs[i].length() && j < output.length(); j++) {
					if (strs[i].charAt(j) == output.charAt(j)) {
						prefix += strs[i].charAt(j);
					}
					else
						break;
				}
				output = prefix;
			}
		}
		return prefix;
	}
}
