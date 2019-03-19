import java.util.Scanner;

public class bj2839 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int three = 0;
		int five = n/5;
		n%=5; //n을 5로 나눈 후 나머지를 다시 n에 대입
		
		while (five >= 0) {
			if (n%3 ==0) {
				three = n/3;
				n%=3;
				break;
			}
			five --;
			n+=5;
		}
		if (n == 0) {
			System.out.printf("%d", three+five);
		} else if (n != 0) {
			System.out.println("-1");
		}
		scan.close();

	}
 
}
