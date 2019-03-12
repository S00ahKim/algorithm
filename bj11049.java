import java.util.Scanner;
	
	public class bj11049 {
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
		    
	        int N =scan.nextInt();
	        int d[] = new int[501];
	        int[][] dp = new int[501][501];
	        
	        d[0] = scan.nextInt();
	        d[1] = scan.nextInt();
	        
	        for(int n = 1; n<N-1;n++){
	            d[n]=scan.nextInt();
	            d[n+1] = scan.nextInt();
	        }
	        d[N-1]=scan.nextInt();
	        d[N]= scan.nextInt();
	        
	        for(int dia = 0; dia<N;dia++)
	        {
	            for(int n=1;n<=N-dia;n++){
	                int m = n+dia;
	                
	                if(n==m){
	                    dp[n][m]=0;
	                    continue;
	                }
	                
	                dp[n][m]=999999999;
	                for(int k=n;k<m;k++){
	                    dp[n][m] = Math.min(dp[n][m], dp[n][k]+dp[k+1][m]+d[n-1]*d[k]*d[m]);
	                }
	            }
	        }
	        System.out.println(dp[1][N]);
	    }
	}
