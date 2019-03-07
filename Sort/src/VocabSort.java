import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;

public class VocabSort {
	
	public static void vocaSort(String[] arr) {
		/* (����) ���� ������ ���� ---> compareTo ����Ͽ� ������ �� �տ� �д�.
		 * (����) ���̰� ª�� �ͺ��� ���� ---> ���� �迭�� ���� ��Ʈ�ϰ�, �ܾ� �迭�� �Բ� ���� */
		
		// ���� �����ϱ� (���� �°� ��������, ���ؿ��� ��Ÿ�� ����)
		
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
		
		// �ڹ� ���� ����Ʈ�� �����ϱ�
		Arrays.sort(arr); //���� ��
		//Arrays.sort(arr, (s1,s2) -> Integer.compare(s1.length(), s2.length())); //���̼�, ���ٽ�
		
		// ���̼�2, ���۷����� ���
		Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
	}

	public static void main(String[] args) {
		// ���� �ܾ� ����
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		if (num<1 || num>20000) {
			System.exit(0);
		}
		
		HashSet<String> set = new HashSet<>(); //�ߺ����ſ�
		scan.nextLine(); //scan �ٹٲ� �ν� ���� ������
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
