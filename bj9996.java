import java.util.Scanner;

public class bj9996 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.nextLine();
		String pattern = scanner.nextLine();
		String[] strs = new String[n];

		for(int i = 0; i< n; i++) {
			strs[i] = scanner.nextLine();
		}
		scanner.close();

		String[] pattern_splited = pattern.split("\\*");
		for (String str : strs) {
			if(str.startsWith(pattern_splited[0])){
				str = str.substring(pattern_splited[0].length(), str.length());
			} else {
				System.out.println("NE");
				continue;
			}
			if(str.endsWith(pattern_splited[1])) {
				System.out.println("DA");
			} else {
				System.out.println("NE");
			}
		}
    }
}