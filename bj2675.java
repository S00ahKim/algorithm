import java.util.ArrayList;
import java.util.Scanner;

public class bj2675 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> time = new ArrayList<Integer>();
		ArrayList<String> word = new ArrayList<String>();
		
		int testcase = scan.nextInt();
		
		for (int x=0; x<testcase; x++) {
			int tn = scan.nextInt();
			time.add(tn);
			String wd = scan.next(); //nextLine���� ������ ���鵵 ���� �ν���. next�� �ؾ� �װ� �����ϰ� ���� �� �ν�.
			word.add(wd);
		}
		
		for (int y=0; y<testcase; y++) {
			String a = word.get(y);
			int aln = a.length();
			for(int z=0; z<aln; z++) {
				for(int i=0; i<time.get(y);i++) {
					System.out.print(a.charAt(z));
				}
			} System.out.println();
		}

	}

}
