import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;

public class VocabSort {
	
	public static void vocaSort(String[] arr) {
		/* (먼저) 사전 순으로 정렬 ---> compareTo 사용하여 음수인 걸 앞에 둔다.
		 * (나중) 길이가 짧은 것부터 정렬 ---> 길이 배열을 만들어서 소트하고, 단어 배열도 함께 정렬 */
		
		// 삽입 정렬하기 (답은 맞게 나오지만, 백준에서 런타임 에러)
		
//		for (int j=0; j<arr.length-1;j++) { 
//			int bfr=j; 
//			for (int k=j+1; k<arr.length;k++) {
//				if ((arr[bfr].compareTo(arr[k])>0)) {
//					bfr = k; 
//				}
//			}
//			String tmp = arr[j]; 
//			arr[j] = arr[bfr];
//			arr[bfr] = tmp;
//		}
//		
//		for (int j=0; j<arr.length;j++) {
//			int bfr=j; 
//			for (int k=j+1; k<arr.length;k++) {
//				if (arr[bfr].length()>arr[k].length()) {
//					bfr = k; 
//				}
//			}
//			String tmp = arr[j]; 
//			arr[j] = arr[bfr];
//			arr[bfr] = tmp;
//		}
		
		// 자바 내의 퀵소트로 정렬하기
		Arrays.sort(arr); //사전 순
		//Arrays.sort(arr, (s1,s2) -> Integer.compare(s1.length(), s2.length())); //길이순, 람다식
		
		// 길이순2, 컴퍼레이터 사용
		Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
	}

	public static void main(String[] args) {
		// 백준 단어 정렬
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		if (num<1 || num>20000) {
			System.exit(0);
		}
		
		HashSet<String> set = new HashSet<>(); //중복제거용
		scan.nextLine(); //scan 줄바꿈 인식 오류 방지용
		for (int i=0; i<num;i++) {
			String vocab = scan.nextLine();
			if (vocab.length()>50) {
				System.out.println("Error!");
				break;
			}else {
				set.add(vocab);
			}
		}
		String[] vocabs = new String[set.size()];
		set.toArray(vocabs);
		
		vocaSort(vocabs);
		
		for (int i=0; i<vocabs.length; i++) {
			System.out.println(vocabs[i]);
		}

	}//main

}//class
