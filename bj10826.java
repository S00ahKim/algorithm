import java.math.BigInteger;
import java.util.Scanner;


// ���� �ʹ� Ŭ �� (int, long���� ���� �Ұ�) ���ο� Ŭ���� �����

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		System.out.println(fibonacci(n));
	}

	public static BigInteger fibonacci(int n ) {
		if(n==0)
			return BigInteger.ZERO;
		else if(n==1)
			return BigInteger.ONE;
		else {
			BigInteger a = BigInteger.ZERO;
			BigInteger b = BigInteger.ONE;
			BigInteger c = BigInteger.ONE;
			for(int i = 2; i < n; i++) {
				a = b;
				b = c;
				c = a.add(b);
			}
			return c;
		}
	}	
}