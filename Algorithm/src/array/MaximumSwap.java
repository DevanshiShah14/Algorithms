package array;

import java.util.Arrays;
import java.util.Collections;

public class MaximumSwap {

	public static void main(String args[]) {
		int num = 1789;
		MaximumSwap obj = new MaximumSwap();
		System.out.println(obj.maximumSwap(num));
	}

	public int maximumSwap(int num) {
		char[] sortArr = Integer.toString(num).toCharArray();
		char[] input = Integer.toString(num).toCharArray();
		
		Arrays.sort(sortArr);

		int i = 0;
		int j = input.length - 1;
		int swap = -1;
		while (i<input.length && j>=0) {
			if (input[i] != sortArr[j]) {
				for (int k = i; k < input.length; k++) {
					if (input[k] == sortArr[j]) {
						swap = k;
					}
				}
				break;
			}
			i++;
			j--;
		}
		if(swap>-1) {
		char temp = input[i];
		input[i] = sortArr[j];
		input[swap] = temp;
		}

		return Integer.valueOf(new String(input));
	}
}
