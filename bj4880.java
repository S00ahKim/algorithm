import java.util.ArrayList;
import java.util.Scanner;

public class bj4880 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<>();
		outerLoop:
		while(true) {
			for(int i = 0; i < 3; i++) {
				int a = scanner.nextInt();
				int b = scanner.nextInt();
				int c = scanner.nextInt();
				if(a == 0 && b == 0 && c== 0)
					break outerLoop;
				if(a+c == 2*b) {
					int k = c + c - b;
					list.add("AP " + Integer.toString(k));
				}
				if(b*b == a*c) {
					int k = c * c/b;
					list.add("GP " + Integer.toString(k));
				}

			}
		}
		scanner.close();
		
		for (String string : list) {
			System.out.println(string);
		}
		
	}
	
}