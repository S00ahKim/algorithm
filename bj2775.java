import java.util.ArrayList;
import java.util.Scanner;

public class bj2775 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int testcase = scan.nextInt();
		
		for(int i=0; i<testcase;i++) {
			int k = scan.nextInt();
			int n = scan.nextInt();
			
		
		int[] Floor = {1,2,3,4,5,6,7,8,9,10,11,12,13,14}; //0���� �ο�
		
		for (int j=0; j<k; j++) {
			int people=0; 
			for(int jj=0; jj<n;jj++) {
				people+=Floor[jj];  // ���� ���� jjȣ�Ǳ��� ������� ����
				Floor[jj] = people; // ���� ���� ���� jjȣ�Ǳ��� ������� �ջ��ؼ� ���� jjȣ���� ��� ���� ����
			}
			
		}
		System.out.println(Floor[n-1]);
		}
	}

}
