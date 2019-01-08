package string;
/** 58. Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.

If the last word does not exist, return 0.

Note: A word is defined as a character sequence consists of non-space characters only
 */

public class LengthOftheLastWord {
	public static void main(String args[]) {
		String s = "  ";
		System.out.println(lengthOfLastWord(s));
	}
	
	public static int lengthOfLastWord(String s) {
		String result="";
		String[] arr= s.trim().split(" ");
		if(arr.length>0)
			result = arr[arr.length-1];	
		return result.length()==0? 0: result.length();
	}
}
