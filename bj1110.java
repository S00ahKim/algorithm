import java.util.Scanner;

public class bj1110 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int given = scan.nextInt();
		int cycle = 0;
		int ans = given;
		boolean button = true;
		
		while (button) {
			int right = ans%10;  //**�� �κ��� �򰥷ȴ�. ans�� �ƴ϶� given ���� �صΰ� �ۿ� ������ ������ �� ����.
			int left = ans/10;
			int cal = (right+left)%10;
			ans = cal + right *10;
			cycle++;
			if (ans == given) {
				button = false;
				break;
			}
		}
		System.out.println(cycle);
	}
}
