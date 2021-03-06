package string;
/*921. Minimum Add to Make Parentheses Valid
Given a string S of '(' and ')' parentheses, we add the minimum number of parentheses ( '(' or ')', and in any positions ) so that the resulting parentheses string is valid.

Formally, a parentheses string is valid if and only if:

It is the empty string, or
It can be written as AB (A concatenated with B), where A and B are valid strings, or
It can be written as (A), where A is a valid string.
Given a parentheses string, return the minimum number of parentheses we must add to make the resulting string valid.

 

Example 1:

Input: "())"
Output: 1
Example 2:

Input: "((("
Output: 3
Example 3:

Input: "()"
Output: 0*/

import java.util.Stack;

public class MinimumAddToMakeParenthesesValid {
	public static void main(String args[]) {
		String S = "()))((";
		MinimumAddToMakeParenthesesValid obj = new MinimumAddToMakeParenthesesValid();
		System.out.println(obj.minAddToMakeValid(S));
	}
	public int minAddToMakeValid(String S) {
		Stack<Character> st = new Stack<Character>();
		int count = 0;
		for(char input: S.toCharArray()) {
			if(input=='(')
				st.push(input);
			else {
				if(input==')' && !st.empty()){
					if(st.peek()=='(')
						st.pop();
				}
				else if(input==')' && st.empty())
					count++;
			}
		}
		while(!st.empty()) {
			count++;
			st.pop();
		}
		return count;
	}
}
