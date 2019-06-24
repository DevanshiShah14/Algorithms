package array;

/*Algo exam Question:  Given an array of n nonzero real numbers a[0]…a[n-1], 
 * write a function to partition the array (not sort) so that all its negative elements 
 * come before all its positive elements. Your algorithm should have O(n) time complexity. 
 * The function prototype is void negpospartition(float a[], int n) */
public class minNumLeft {
	public static void main(String args[]) {
		float[] arr = {-1,2,0,-6,7,4,-7,8,-2,9};
		MinNumberLeft(arr, arr.length);
		for(float i: arr) {
			System.out.println(i);
		}
	}

	public static float[] MinNumberLeft(float arr[], int n) {
		int i= 0, j= arr.length-1;
		while(i<j) {
			if(arr[i]>=0 && arr[j]<0) {
				float temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
			else {
				if(arr[i]< 0)
					i++;
				if(arr[j]>=0)
					j--;
			}	
		}
		return arr;
	}
}
