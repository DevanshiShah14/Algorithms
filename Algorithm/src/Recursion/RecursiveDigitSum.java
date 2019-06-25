package Recursion;

/*you are given two numbers n and k. The number p  is created by concatenating the string n k times. 
Example where n =9875 , assume your value k= 4.
superDigit(p) = superDigit(9875987598759875)
5+7+8+9+5+7+8+9+5+7+8+9+5+7+8+9 = 116
superDigit(p) = superDigit(116)
1+1+6 = 8
superDigit(p) = superDigit(8)
All of the digits of p sum to 116. The digits of 116 sum to 8. 8 is only one digit, so it's the super digit
*/
public class RecursiveDigitSum {
	public static void main(String args[]) {
		String n = "148";
		int k = 3;
		System.out.println(superDigit(n, k));
	}

	static int superDigit(String n, int k) {
		double value = Double.valueOf(resultSuperDigit(n));
		String temp = Double.toString(value*k);
		while(temp.length()>1) {
			temp = resultSuperDigit(temp.indexOf('.') != -1 ? temp.substring(0, temp.indexOf('.')) : temp );
			
		}
		return Integer.valueOf(temp);
	}

	static String resultSuperDigit(String result) {
		double sum = 0;
		int i = 0;
		while (i < result.length()) {
			if (result.length()>1 && result.charAt(i) >='0' && result.charAt(i)<='9') {
				sum+= result.charAt(i)-'0';
			}
			i++;
		}
		String temp = String.valueOf(sum);
		return temp.substring(0, temp.indexOf('.'));
	}
}
