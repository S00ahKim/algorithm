import java.util.Scanner; 
public class bj2293 { 
    static int N,K; 
    static int coinValue[], numberOfCases[]; 
    public static void main(String args[]) { 
        Scanner sc = new Scanner(System.in); 
        N = sc.nextInt(); 
        K = sc.nextInt(); 
        coinValue = new int[N+1]; 
        numberOfCases = new int[K+1]; 
        for (int i=1; i<=N; i++) { 
            coinValue[i] = sc.nextInt(); 
        } 
        numberOfCases[0] = 1; 
        for (int i=1; i<=N; i++) { 
            for (int j=0; j<=K; j++) { 
                if(j-coinValue[i] >= 0) { 
                    numberOfCases[j] = numberOfCases[j] + numberOfCases[j - coinValue[i]]; 
                } 
            } 
        } 
        System.out.println(numberOfCases[K]); 
    } 
}
