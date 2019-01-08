package array;

public class ArrayLeftRotation {
	 public static int[] rotLeft(int[] a, int d) {
	        if(a.length==0) return a;
	        int arr[] = new int[a.length];
	        for(int i=0; i<a.length; i++){
	            arr[(i+ (a.length-d))% a.length] = a[i];
	        }
	        return arr;
	    }
	 
	 public static void main(String args[]) {
		 int a[] = {1,2,3,4,5};
		 int d = 4;
		 
		int result[] = rotLeft(a, d);
		for(int j=0; j<result.length; j++) {
			System.out.println(result[j]);
		}
	 }
}
