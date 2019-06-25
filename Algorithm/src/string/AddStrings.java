package string;

import java.util.concurrent.ThreadPoolExecutor.CallerRunsPolicy;

/*415. Add Strings
Given two non-negative integers num1 and num2 represented as string, return the sum of num1 and num2.

Note:

The length of both num1 and num2 is < 5100.
Both num1 and num2 contains only digits 0-9.
Both num1 and num2 does not contain any leading zero.
You must not use any built-in BigInteger library or convert the inputs to integer directly.*/
public class AddStrings {
	public static void main(String args[]) {
		String num1 = "11";
		String num2= "99";
		AddStrings obj = new AddStrings();
		System.out.println(obj.addStrings(num1, num2));
	}

	public String addStrings(String num1, String num2) {
		int num1Len = num1.length() - 1; 
		int num2Len = num2.length() - 1;
		int sum = 0;
		int isCarry = 0;
		String result = "";
		while (num1Len >= 0 || num2Len >= 0) {
			int x = (num1Len >= 0)? num1.charAt(num1Len--)-'0' : 0;
			int y = (num2Len >= 0)? num2.charAt(num2Len--)-'0' : 0;
			sum = x + y + isCarry;
			isCarry = sum / 10;
			result = Integer.toString(sum % 10) + result;
		}
		if(isCarry!=0)
			result = isCarry + result;
		return result;
	}
}
