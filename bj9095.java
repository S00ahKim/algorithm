import java.util.Scanner;

public class bj9095 { 
    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
    	int m = scan.nextInt();
        int[] arr = new int[m];
        for(int k = 0; k < m; k ++) {
            int[] dp = new int[100001];
            dp[0] = 0;
            dp[1] = 1;
            dp[2] = 2;
            dp[3] = 4;
            int n = scan.nextInt();
            if(n == 0 ){
                break;
            }else if(n <= 3){
                arr[k] = dp[n];
            }else{
                for(int i = 4; i <= n; i++){
                    dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
                }
                arr[k] = dp[n];
            }
        }
        for(int k = 0; k < m; k++){
            System.out.println(arr[k]);
        }
    }
}
