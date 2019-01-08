package array;
import java.util.ArrayList;

public class ZigZagConversion {

	public static void main(String args[]) {
		String input = "PAYPALISHIRING"; //PAHNAPLSIIGYIR, PHASIYIRPLIGAN
		int numRows = 3;
		convert(input, numRows);
	}

	private static String convert(String input, int numRows) {
		int stringLength = input.length();
		String FinalString = "";
		int j = 0;
		int jumps = 2*(numRows-1);
		if(numRows == 1) {
			return input;
		}
		for(int i=0; i<numRows; i++) {
			j=i;
			while(j < stringLength ) {
				FinalString += input.substring(j, j+1);
				j+= jumps;
				
				if(i!=0 && i!=numRows-1 && j-2*i<stringLength) { 
					FinalString+=input.substring(j-2*i, (j-2*i)+1);
				}
			}
		}
		System.out.println(FinalString);
		return FinalString;
	}
}
