import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj1890 {
	
	static int gameboard[][];
	static long numberOfMethod[][];
	static int cur, cnt, N;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		gameboard = new int[N+1][N+1];
		numberOfMethod = new long[N+1][N+1];
		
		for(int i=1; i<=N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=1; j<=N; j++) {
				gameboard[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		counting();
	}
	
	public static void counting() {
		numberOfMethod[1][1] = 1; // 시작점
		
		for(int i=1; i<=N; i++) {
			for(int j=1; j<=N; j++) {

				if  (i == N && j == N) { // 종착점
					System.out.println(numberOfMethod[i][j]);
				} else {
					if(numberOfMethod[i][j] > 0) {
						cur = gameboard[i][j];
						
						if(i+cur <= N) { // 아래
							numberOfMethod[i+cur][j] = numberOfMethod[i+cur][j] + numberOfMethod[i][j];
						}
						
						if(j+cur <= N) { // 오른쪽
							numberOfMethod[i][j+cur] = numberOfMethod[i][j+cur] + numberOfMethod[i][j];
						}
					}
				}
			}
		}
	}	
}
