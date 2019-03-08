import java.util.Scanner;

// selection sort

public class bj2750_s {
	public static void selectionSort(int[] list){
		for (int j=0; j<list.length-1;j++) { 
			int min=j; //
			for (int k=j+1; k<list.length;k++) {
				if (list[min]>list[k]) {
					min = k; //
				}
			}
			int tmp = list[j]; //
			list[j] = list[min];
			list[min] = tmp;
		}
		for (int i=0; i<list.length; i++) {
			System.out.println(list[i]);
		}
    }

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		if (num<1 || num>1000){
			System.out.println("Error!");
			System.exit(0);
		}
		
		int array[] = new int[num];
		for (int i=0; i<num; i++) {
			int element = scan.nextInt();
			array[i] = element;
		}
		
		selectionSort(array);
	}
}
