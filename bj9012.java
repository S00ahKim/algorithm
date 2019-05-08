import java.util.ArrayList;
import java.util.Scanner;

public class Main {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			ArrayList<String> list = new ArrayList<>();
			int testCase = scanner.nextInt();
			scanner.nextLine();
			for(int i = 0; i < testCase; i++) {
				list.add(scanner.nextLine());
			}
			scanner.close();

			for (String str : list) {
				if(checkVPS(str) == true)
					System.out.println("YES");
				else
					System.out.println("NO");
			}
		}

		public static boolean checkVPS(String str) {
			char[] charArr = str.toCharArray();
			int cnt = 0;
			for (Character character : charArr) {
				if(character == '(')
					cnt = cnt + 1;
				else {
					if(cnt == 0)
						return false;
					else
						cnt = cnt - 1;
				}
			}
			if(cnt == 0)
				return true;
			else
				return false;
		}
}