import java.util.Scanner;

public class bj2441 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		if (i>0 && i<101) {
			for (int a = i; a>0; a--) {
				for (int c=0; c<i-a; c++) {
					System.out.print(" ");
				}
				for (int b=a; b>0; b--) {
					System.out.print("*");
				}
				System.out.println();
			}
		}

	}

}
