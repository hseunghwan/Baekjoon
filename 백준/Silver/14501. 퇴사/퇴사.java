import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    // 1. 뒤에서 부터 For문을 돌기
    // 2. 해당 배열 순서 + 경과 기간 >= N 이면 넘기기
    // 3. 합의 최댓값 으로 갱신 해두기
    static class Consult {
        int time;
        int profit;

        Consult(int time, int profit) {
            this.time = time;
            this.profit = profit;
        }

    }
    private static int dp[], N;
    private static Consult[] input;
    public static void main(String[] args) throws IOException {
//        Scanner br = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        dp= new int[N];

        input = new Consult[N];

        for (int i = 0; i < N; i++) {
            String temp[] = br.readLine().split(" ");
            input[i] = new Consult(Integer.parseInt(temp[0]), Integer.parseInt(temp[1]));
            dp[i] = -1;
        }

        System.out.print(recur(0));
    }

    private static int recur(int date) {
        if(date > N) return Integer.MAX_VALUE;

        if(date == N) return 0;

        if(dp[date] != -1) return dp[date];

        dp[date] = Math.max(recur(date + input[date].time) + input[date].profit, recur(date + 1));

        return dp[date];
    }
}