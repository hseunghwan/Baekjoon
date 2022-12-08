import java.io.*;
import java.util.*;

//2447 별찍기 10
public class Main {
    public static void dot(String[][] n, int k) {
        if (k > n.length) {
            return;
        } else {
            int x, y;
            for (int i = 0; i < n.length; i += k) {
                for (int j = 0; j < n.length; j += k) {
                    x = i + (k / 3);
                    y = j + (k / 3);
                    for (int fi = 0; fi < k / 3; fi++) {
                        for (int fj = 0; fj < k / 3; fj++) {
                            n[x+fi][y+fj] = " ";
                        }
                    }

                }
            }
            dot(n, k * 3);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 할당된 버퍼에 값 넣어주기

        int N = Integer.parseInt(br.readLine());
        String[][] n = new String[N][N];
        for (String[] i : n) {
            Arrays.fill(i, "*");
        }

        dot(n, 3);
        for (String[] i : n) {
            for (String j : i) {
                bw.write(j);
            }
            bw.write("\n");;
        }

        bw.flush(); // 남아있는 데이터를 모두 출력시킴
        bw.close(); // 스트림을 닫음
    }
}