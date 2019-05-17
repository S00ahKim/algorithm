import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 

public class bj2156 { 
    public static void main(String[] args) throws NumberFormatException, IOException { 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        int T = Integer.parseInt(br.readLine()); 
        long[] input = new long[T+1];	
        for(int i=1; i<=T; i++) { 
            input[i] = Integer.parseInt(br.readLine()); 
        } 
        long[] wineAmount = new long[T+1]; 
        wineAmount[1] = input[1]; 
        if(T>1) {
            wineAmount[2] = input[1]+input[2]; 
        } 
        if(T>2) { 
            for(int i=3; i<=T; i++) { 
                wineAmount[i] = Math.max(wineAmount[i-3]+input[i-1]+input[i] // OXO 
                                 ,Math.max(wineAmount[i-2]+input[i] // OOX 
                                          ,wineAmount[i-1])); // XOO 
            } 
        } 
        System.out.println(wineAmount[T]); 
    } 
}

