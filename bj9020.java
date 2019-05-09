import java.util.Scanner;

public class bj9020 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		scanner.close();

		for (int i : arr) {
			for(int j = i/2; j <= i; j++) {
				if(isPrimeNumber(j) && isPrimeNumber(i-j)) {
					if(j <= i-j)
						System.out.printf("%d %d", j, i-j);
					else
						System.out.printf("%d %d", i-j, j);
					break;
				}
			}
			System.out.println();
		}
	}

	public static boolean isPrimeNumber(int n) {
		if (n == 1)
			return false;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0)
				return false; 
		}
		return true;
	}
}