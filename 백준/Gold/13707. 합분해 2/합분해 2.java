import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);
        long[][] dp = new long[N+1][K+1]; // int[21][3]
        
        for (int y = 0; y < N+1; y++) dp[y][1] = 1;
        for (int x = 1; x < K+1; x++) dp[0][x] = 1;
        
        for (int y = 1; y < N+1; y++) {
            for(int x = 2; x < K+1; x++) {
                dp[y][x] = dp[y-1][x] + dp[y][x-1];
                dp[y][x]%=1000000000;
            }
        }

        System.out.println(dp[N][K]);
    }
}