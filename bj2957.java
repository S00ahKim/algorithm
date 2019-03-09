import java.io.IOException;
import java.util.Scanner;
import java.util.TreeMap;

public class bj2957 {
	static long c = 0;

	public static void main(String[] args) throws IOException {
	      Scanner sc = new Scanner(System.in);
	      long N = sc.nextInt();
	      TreeMap<Integer, Integer> bst = new TreeMap<>();
	      
	      int root = sc.nextInt();
	      Integer height = 0;
	      bst.put(root, height);
	      System.out.println(c);
	      
	      for (int i=1; i<N; i++) {
	         int num = sc.nextInt();
	         Integer fkey = bst.floorKey(num);
	         Integer ckey = bst.ceilingKey(num);
	         if (fkey == null) {
	        	 height = bst.get(ckey)+1;
	         }else if (ckey == null) {
	        	 height = bst.get(fkey)+1;
	         }else {
	        	 height = Math.max(bst.get(fkey), bst.get(ckey))+1; 
	         }
	         
	         c+=height;
	         bst.put(num, height);
	         System.out.println(c);
	      }
	      sc.close();
	   }
}
//	 시간초과가 발생한 코드 (이유: skewd tree)
//    static int[] arr = new int[300001];
//    static int c = 0;
// 
//    static void insert(int x, int n) {
//        c++;
//        if (x < arr[n]) {
//            if (arr[n * 2] == 0) { 
//                arr[n * 2] = x;
//            } else {
//            	insert(x, n * 2);
//            }
//        } else if (x > arr[n]) { 
//            if (arr[n * 2 + 1] == 0) { 
//                arr[n * 2 + 1] = x;
//            } else { 
//                insert(x, n * 2 + 1);
//            }
//        }
//    }
// 
//    public static void main(String[] args) throws IOException {
//        //Scanner sc = new Scanner(System.in);
//        //int N = sc.nextInt(); 
//        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
//    	int N = sc.read();
//        for (int i = 1; i <= N; i++) {
//            int num = sc.read();
//            if (i == 1) {
//                arr[1] = num;
//            } else {
//                insert(num, 1);
//            }
//            System.out.println(c);
//        }
//    }
//