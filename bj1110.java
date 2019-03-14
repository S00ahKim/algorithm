import java.util.Scanner;

public class bj1110 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int given = scan.nextInt();
		int cycle = 0;
		int ans = given;
		boolean button = true;
		
		while (button) {
			int right = ans%10;  //**이 부분이 헷갈렸다. ans가 아니라 given 으로 해두고 밖에 뺐더니 루프가 안 멈춤.
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
