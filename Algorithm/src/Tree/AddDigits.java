package Tree;
/*258. Add Digits
Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.

Example:

Input: 38
Output: 2 
Explanation: The process is like: 3 + 8 = 11, 1 + 1 = 2. 
             Since 2 has only one digit, return it.*/
public class AddDigits {

	public int addDigits(int num) {
		
		return  num==0?0:(num%9==0?9:(num%9));    
	    }
}
