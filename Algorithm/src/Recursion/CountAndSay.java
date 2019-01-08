package Recursion;

public class CountAndSay {
	/**
	 * The count-and-say sequence is the sequence of integers with the first five terms as following:

	1.     1
	2.     11
	3.     21
	4.     1211
	5.     111221
	1 is read off as "one 1" or 11.
	11 is read off as "two 1s" or 21.
	21 is read off as "one 2, then one 1" or 1211.
	Given an integer n, generate the nth term of the count-and-say sequence.
	
	Note: Each term of the sequence of integers will be represented as a string.
	 */
	
	public static void main(String args[]) {
		int n = 5;
		System.out.println(countAndSay(n));
	}
	
	public static String countAndSay(int n) {
		if(n==1) return "1";
		String result = countAndSay(n-1);
		StringBuilder str = new StringBuilder();
			for(int i= 0; i<result.length(); i++) {
				int count = 1;
				while(i+1< result.length() && result.charAt(i+1)== result.charAt(i) ){
					count++;
					i++;
				}
				str.append(Integer.toString(count)).append(result.charAt(i));
			}
		return str.toString();
    }
}


/** my solution but with ++runtime
if(n==1) return "1";
String result = "1";
for(int i=1; i<n; i++) {
	StringBuilder output = new StringBuilder("");
	int count = 1;
	for(int j= 0; j<result.length(); j++) {
		while(j+1< result.length() && result.charAt(j+1)== result.charAt(j) ){
			count++;
			j++;
		}
			output.append((count)).append(result.charAt(j));
			count = 1;
	}
	result = output;
}
return output;

}

}
**/