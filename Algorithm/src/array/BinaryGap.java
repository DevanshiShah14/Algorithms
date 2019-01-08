package array;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class BinaryGap {

	public static void main(String args[]) {
		System.out.println(binaryGap(22));
	}
	
	public static int binaryGap(int N) {
		String str = Integer.toBinaryString(N);
		int seen = 0;
		int count = 0;
		int arr[] = new int[32];
		int k = 0;
		for(int i=0; i<str.length();i++) {
			if(str.charAt(i)=='1' && seen==0) {
				seen= 1;
				//ans = Math.max(ans, i - last);
			}
			else if(seen==1 && str.charAt(i)!='1') {
				count++;
			}
			else if(seen==1 && str.charAt(i)=='1') {
				count++;
				arr[k] = count;
				k++;
				count = 0;
			}
		}
		
		int max = 0;
		for(int x=0; x<arr.length; x++) {
			if(arr[x] > max)
				max=arr[x];
		}
		//int max = (int) Collections.max(Arrays.asList(arr));
		return max;
	}
}
