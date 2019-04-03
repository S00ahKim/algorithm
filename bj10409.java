import java.io.FileInputStream;
import java.util.*;
 
public class bj10409 {
 
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int number2 = sc.nextInt();
        Queue<Integer> queue = new LinkedList<Integer>();   
        int count = 0;
        for (int i = 0; i < number; i++) {
            q.add(sc.nextInt());    
        }
        
        while(!queue.isEmpty()&&number2-queue.peek()>=0){    
            number2 -= q.poll();
            count++;
        }
        System.out.println(count);
    }
}
 
