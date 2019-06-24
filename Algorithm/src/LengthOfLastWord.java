package array;

public class LengthOfLastWord {
	
	public static void main (String args[]) {
		String input = "Hello World"; 
		System.out.println("The length is:"+ lengthOfLastWord(input));
	}
	
	public static int lengthOfLastWord(String s) {
		
		for(int i=0; i< s.length();i++) {
			if(s.charAt(i)== ' ') {				
				return s.length()-i-1;
			}
			else if(i== s.length()-1) {
				return s.length();
			}
		}
		
		return 0;
    }
}
