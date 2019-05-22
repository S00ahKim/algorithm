import java.util.LinkedList; 
import java.util.Queue; 
import java.util.Scanner; 

public class bj11179 { 
    public static int answer; 
    static Queue<Integer> st = new LinkedList<Integer>(); 
    
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);	
        int N = sc.nextInt(); 
        int num = 0; 
        int result = 0; 
        while(N>=1) { 
            num++; st.add(N%2); 
            N /= 2;	
        } 
        while(!st.isEmpty()) { 
            num--; 
            if (st.poll() == 1) { 
                result += Math.pow(2, num); 
            } 
        } 
        System.out.println(result); 
    } 
}
