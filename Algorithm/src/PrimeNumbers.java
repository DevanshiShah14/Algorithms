package array;

/**
 * 204. Count the number of prime numbers less than a non-negative number, n.
 *
 */
public class PrimeNumbers {

	private static boolean isPrime = true;

	public static void main(String args[]) {
		System.out.println(countPrimes(5));

	}

	public static int countPrimes(int n) {
		if (n == 0 || n == 1 || n == 2)
			return 0;
		if (n == 3)
			return 1;

		int count = 0;
		int num = 2;
		while (num < n) {
			isPrime = true;
			loop: for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0 && num != i) {
					isPrime = false;
					break loop;
				}
			}
			if (isPrime == true)
				count++;

			num++;
		}
		return count;
	}
}
