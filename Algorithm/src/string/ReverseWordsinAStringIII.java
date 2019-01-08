package string;
/**
 * 557. Given a string, you need to reverse the order of characters in each word within a
 * sentence while still preserving whitespace and initial word order.
 * Example 1:
	Input: "Let's take LeetCode contest"
	Output: "s'teL ekat edoCteeL tsetnoc"
 *
 */
public class ReverseWordsinAStringIII {
	public static void main(String args[]) {
		String Str= "Let's take LeetCode contest";
		System.out.println(reverseWords(Str));
	}
	
	public static String reverseWords(String s) {
		String arr[] = s.split(" ");
		int current = 0, end = 0;
		s = "";
		for(int i=0; i<arr.length; i++) {
			String curr = arr[i];
			String reverse = new StringBuffer(curr).reverse().toString();
			s = s + reverse+ " ";
		}
		return s.trim();
	}
}

/** efficient solution
 *  public String reverseWords(String s) {
        StringBuilder temp = new StringBuilder(s);
        String[] words = temp.reverse().toString().split(" ");
        StringBuilder resultSB = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            resultSB.append(words[i]);
            resultSB.append(" ");
        }
        return resultSB.toString().trim();
    }
**/
