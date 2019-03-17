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
			String wd = scan.next(); //nextLine으로 받으면 공백도 같이 인식함. next로 해야 그걸 무시하고 다음 걸 인식.
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
