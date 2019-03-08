import java.util.HashMap;
import java.util.Scanner;

public class bj1620 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		HashMap<String, Integer> strMaps = new HashMap<>();
		HashMap<Integer, String> intMaps = new HashMap<>();
		
		for (int i=1; i<=N; i++) {
			String s = sc.next();
			strMaps.put(s, i);
			intMaps.put(i, s);
		}
		
		for (int i=0; i<M; i++) {
			if (sc.hasNextInt()) {
				System.out.println(intMaps.get(sc.nextInt()));
			}else {
				System.out.println(strMaps.get(sc.next()));
			}
		}
		sc.close();
		
	}

}
