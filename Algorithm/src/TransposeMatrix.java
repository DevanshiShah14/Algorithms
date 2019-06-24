package array;

/*867. Transpose Matrix
Given a matrix A, return the transpose of A.
The transpose of a matrix is the matrix flipped over it's main diagonal,
switching the row and column indices of the matrix.

Example 1:

Input: [[1,2,3],[4,5,6],[7,8,9]]
Output: [[1,4,7],[2,5,8],[3,6,9]]
Example 2:

Input: [[1,2,3],[4,5,6]]
Output: [[1,4],[2,5],[3,6]]*/

public class TransposeMatrix {
	public static void main(String args[]) {
		int[][] A = new int[3][3];
		int temp = 1;
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[0].length; j++) {
				A[i][j] = temp;
				temp++;
			}
		}
		TransposeMatrix TranObj = new TransposeMatrix();
		int[][] result = TranObj.MXN_transpose(A);
		for (int i = 0; i < result.length; i++)
			for (int j = 0; j < result[0].length; j++)
				System.out.println(result[i][j]);
	}

	public int[][] MXN_transpose(int[][] A) {
		// for M X N matrix & N X N
		int[][] result = new int[A[0].length][A.length];
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[0].length; j++) {
				if (i != j)
					result[j][i] = A[i][j];
				else
					result[i][j] = A[i][j];
			}
		}
		return result;
	}

	public int[][] NXN_transpose(int[][] A) {
		// only for N X N matrix
		for (int i = 0; i < A.length; i++) {
			for (int j = i; j < A[0].length; j++) {
				if (i != j) {
					int temp = A[j][i];
					A[j][i] = A[i][j];
					A[i][j] = temp;
				}
			}
		}
		return A;
	}
}
