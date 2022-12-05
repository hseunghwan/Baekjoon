import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//1931 회의실 배정
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] temp = br.readLine().split(" ");
        int[] input = new int[N];
        for (int i = 0; i < N; i++) {
            input[i] = Integer.parseInt(temp[i]);
        }
        Arrays.sort(input);
        int sum = 0, tot = 0;
        for (int i = 0; i < N; i++) {
            tot += (sum + input[i]);
            sum+=input[i];
        }
        System.out.println(tot);
    }
}