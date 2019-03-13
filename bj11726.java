import java.io.BufferedReader;
import java.io.InputStreamReader;

public class bj11726 {
 public static void main(String[] args) throws Exception{
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  int n = Integer.parseInt(br.readLine());
  int c[] = new int[1001];
  
  c[1] = 1;
  c[2] = 2;
  for(int i=3; i<=n; i++){
   c[i] = (c[i-1] + c[i-2]) % 10007;
  }
  
  System.out.println(c[n]);
 }
}