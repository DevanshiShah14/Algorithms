package array;

/*917. Reverse Only Letters
Given a string S, return the "reversed" string 
where all characters that are not a letter stay in the same place, and all letters reverse their positions.
Example 1:

Input: "ab-cd"
Output: "dc-ba"
Example 2:

Input: "a-bC-dEf-ghIj"
Output: "j-Ih-gfE-dCba"
Example 3:

Input: "Test1ng-Leet=code-Q!"
Output: "Qedo1ct-eeLg=ntse-T!"*/

public class ReverseOnlyLetters {
	public static void main(String args[]) {
		String S= "a-bC-dEf-ghIj";
		ReverseOnlyLetters obj = new ReverseOnlyLetters();
		System.out.println(obj.reverseOnlyLetters(S));
	}
	public String reverseOnlyLetters(String S) {
		char input[] = S.toCharArray();
		int i = 0, j = input.length-1;
		while(i<j) {
			if(!Character.isLetter(input[i]))
				i++;
			else if(!Character.isLetter(input[j]))
				j--;
			else {
				//swap
				char temp = input[i];
				input[i] = input[j];
				input[j] = temp;
				i++;
				j--;
			}
		}
		return String.valueOf(input);
	}
}
