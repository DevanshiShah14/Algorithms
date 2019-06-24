package array;

/** HackerRank
 * John works at a clothing store. 
 * He has a large pile of socks that he must pair by color for sale. 
 * Given an array of integers representing the color of each sock,
 * determine how many pairs of socks with matching colors there are.

For example, there are n = 7 socks with colors ar = [1, 2, 1, 2, 1, 3, 2]. 
There is one pair of color 1 and one of color 2. 
There are three odd socks left, one of each color.
The number of pairs is 2.
 */
import java.util.Arrays;

public class SockMerchant {

	public static int sockMerchant(int n, int[] ar) {
		if (ar.length < 2)
			return 0;
		Arrays.sort(ar);
		int pairs = 0;
		for (int i = 0; i < n; i++) {
			if (i + 1 < n && ar[i] == ar[i + 1]) {
				pairs++;
				i += 1;
			}
		}
		return pairs;
	}

	public static void main(String[] args) {
		int n = 9;
		int ar[] = { 10, 20, 20, 10, 10, 30, 50, 10, 20 };
		System.out.println(sockMerchant(n, ar));
	}
}
