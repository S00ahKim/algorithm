import java.util.Scanner;

public class bj1026 {
	public static int functionS(int[] A, int[] B) {
		int minS=0;
		// A�� ��迭 �� �����ϰ�, B�� ���� ��迭�ϵ� B ��ü�� �ٲ��� �ʰ� B2�� ����.
		for (int j=0; j<A.length-1;j++) { 
			int min=j; 
			for (int k=j+1; k<A.length;k++) {
				if (A[min]>A[k]) {
					min = k; 
				}
			}
			int tmp = A[j]; 
			A[j] = A[min];
			A[min] = tmp;
		}
		int[] B2 = B;
		for (int j=0; j<B2.length-1;j++) { 
			int max=j; 
			for (int k=j+1; k<B2.length;k++) {
				if (B2[max]<B2[k]) {
					max = k; 
				}
			}
			int tmp = B2[j]; 
			B2[j] = B2[max];
			B2[max] = tmp;
		}
		for(int j=0; j<A.length;j++) {
			int add = A[j]*B2[j];
			minS += add;
		}
		return minS;
	}

	public static void main(String[] args) {
		// ����: ����
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		if (num>50 || num<0) {
			System.exit(0);
		}
		int[] A = new int[num];
		int[] B = new int[num];
		
		for (int i=0; i<num; i++) {
			int j = scan.nextInt();
			if(j<0 && j>100) {
				break;
			}else {
				A[i] = j;
			}
		}
		
		for (int i=0; i<num; i++) {
			int j = scan.nextInt();
			if(j<0 && j>100) {
				break;
			}else {
				B[i] = j;
			}
		}
		
		System.out.println(functionS(A,B));
	}//main

}//class
