package string;

import java.util.Stack;

/*844. Backspace String Compare
Given two strings S and T, return if they are equal when both are typed into empty text editors. # means a backspace character.

Example 1:

Input: S = "ab#c", T = "ad#c"
Output: true
Explanation: Both S and T become "ac".
Example 2:

Input: S = "ab##", T = "c#d#"
Output: true
Explanation: Both S and T become "".
Example 3:

Input: S = "a##c", T = "#a#c"
Output: true
Explanation: Both S and T become "c".
Example 4:

Input: S = "a#c", T = "b"
Output: false
Explanation: S becomes "c" while T becomes "b".*/

public class BackspaceStringCompare {
	public boolean backspaceCompare(String S, String T) {
		Stack<Character> set1 = new Stack<>();
		Stack<Character> set2 = new Stack<>();
		for(char ch : S.toCharArray()) {
			if(ch!='#')
				set1.push(ch);
			else if(!set1.empty())
				set1.pop();
		}
		
		for(char ch : T.toCharArray()) {
			if(ch!='#')
				set2.push(ch);
			else if(!set2.empty())
				set2.pop();
		}
			
		if(String.valueOf(set1).equals(String.valueOf(set2)))
			return true;
		return false;
	}
}
