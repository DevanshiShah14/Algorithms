package string;

/**
 * 777. In a string composed of 'L', 'R', and 'X' characters, like "RXXLRXRXL",
 * a move consists of either replacing one occurrence of "XL" with "LX", or
 * replacing one occurrence of "RX" with "XR". Given the starting string start
 * and the ending string end, return True if and only if there exists a sequence
 * of moves to transform one string to the other.
 * 
 * Example:
 * 
 * Input: start = "RXXLRXRXL", end = "XRLXXRRLX" Output: True
 */

public class SwapAdjacentinLRString {
	
	public static void main(String args[]) {
		String start = "XXXXXLXXXX";
		String end ="LXXXXXXXXX";
		System.out.println(canTransform(start, end));
	}
	
	public static boolean canTransform(String start, String end) {
		 if (start.length() != end.length()) return false;        // Add this one to make sure their length is same.
		    if (!start.replace("X", "").equals(end.replace("X", ""))) return false;
		    int p1 = 0;
		    int p2 = 0;
		    char[] ch1 = start.toCharArray();
		    char[] ch2 = end.toCharArray();
		    while (p1 < start.length()) {           
		        while (p1 < ch1.length && ch1[p1] == 'X') p1++;
		        while (p2 < ch2.length && ch2[p2] == 'X') p2++;
		        if (p1 == ch1.length || p2 == ch2.length) return true;      // if one reach the end, the other one must reach the end too, since we have already check their order first.
		        if (ch1[p1] == 'R' && p1 > p2) return false;
		        if (ch1[p1] == 'L' && p1 < p2) return false;
		        p1++;
		        p2++;
		    }
		    
		    return true;
	}
}

/** 2 loop solution.
 * class Solution {
    public boolean canTransform(String start, String end) {
        if(start.length()!= end.length())
			return false;
		StringBuilder str = new StringBuilder(start);
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)=='R' && end.charAt(i)=='X' && i+1<str.length()) {
				str.setCharAt(i, 'X');
				str.setCharAt(i+1, 'R');
			}			
			else if(start.charAt(i)=='X' && end.charAt(i)=='L' && i+1<str.length()) {
				str.setCharAt(i, 'L');
				str.setCharAt(i+1, 'X');
			}
		}
		return str.toString().equals(end)? true : false;
    }
} **/
