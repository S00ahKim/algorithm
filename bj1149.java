import java.util.Scanner;

public class bj1149 {
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in); 
		int x = sc.nextInt(); 
		int[][] dp = new int[x+1][3]; 

		for(int i=1; i<=x; i++) { 
			dp[i][0] = sc.nextInt(); // red 
			dp[i][1] = sc.nextInt(); // green 
			dp[i][2] = sc.nextInt(); // blue 
		} 
		for(int i=2; i<=x; i++) { 
			dp[i][0] += Math.min(dp[i-1][1], dp[i-1][2]); 
			dp[i][1] += Math.min(dp[i-1][0], dp[i-1][2]); 
			dp[i][2] += Math.min(dp[i-1][0], dp[i-1][1]); 
		} 
		System.out.println(Math.min(dp[x][0], Math.min(dp[x][1], dp[x][2]))); 
	}

}
