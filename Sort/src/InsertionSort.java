import java.util.Scanner;

public class InsertionSort {
	public static void insertionSort(int[] list){
		int tmp = 0;
        int j = 0;
         
        for(int i=1; i<list.length; i++){
            tmp = list[i]; 
            j = i;
            while(j > 0 && tmp < list[j-1]){ 
                list[j] = list[j-1];
                j--; 
            }
            list[j] = tmp; 
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
		
		insertionSort(array);
	}
}
