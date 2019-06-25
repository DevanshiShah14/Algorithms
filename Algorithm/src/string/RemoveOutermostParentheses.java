package string;
/*1021. Remove Outermost Parentheses

A valid parentheses string is either empty (""), "(" + A + ")", or A + B, where A and B are valid parentheses strings, and + represents string concatenation.  For example, "", "()", "(())()", and "(()(()))" are all valid parentheses strings.

A valid parentheses string S is primitive if it is nonempty, and there does not exist a way to split it into S = A+B, with A and B nonempty valid parentheses strings.

Given a valid parentheses string S, consider its primitive decomposition: S = P_1 + P_2 + ... + P_k, where P_i are primitive valid parentheses strings.

Return S after removing the outermost parentheses of every primitive string in the primitive decomposition of S.

Example 1:

Input: "(()())(())"
Output: "()()()"
Explanation: 
The input string is "(()())(())", with primitive decomposition "(()())" + "(())".
After removing outer parentheses of each part, this is "()()" + "()" = "()()()".
Example 2:

Input: "(()())(())(()(()))"
Output: "()()()()(())"
Explanation: 
The input string is "(()())(())(()(()))", with primitive decomposition "(()())" + "(())" + "(()(()))".
After removing outer parentheses of each part, this is "()()" + "()" + "()(())" = "()()()()(())".*/

public class RemoveOutermostParentheses {
	public static void main(String args[]) {
		String S = "(()())(())";
		RemoveOutermostParentheses obj = new RemoveOutermostParentheses();
		System.out.println(obj.removeOuterParentheses(S));
	}
	public String removeOuterParentheses(String S) {
		StringBuilder st = new StringBuilder();
		int opened = 0;
		for(char c: S.toCharArray()){
			if(c=='(' && opened++>0) {
				st.append(c);
			}
			if(c==')' && opened-->1) {
				st.append(c);
			}
		}
		return st.toString();
	}
}
