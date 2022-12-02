import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static boolean caninsert(boolean table[], int date, int length) {
        if (!table[date] && (table.length - date >= length)) {
            for (int i = 0; i < length; i++) {
                table[date++] = true;
            }
            return true;
        } else {
            return false;
        }
    }

    public static int cal(int[][] input, boolean[] table, int date, boolean tf, int val) {
        if (date >= table.length) {
            return val;
        }
        if (tf && caninsert(table, date, input[date][0])) {
            val += input[date][1];
            int a = cal(input, table.clone(), date + 1, true, val);
            int b = cal(input, table.clone(), date + 1, false, val);
            return a > b ? a : b;
        } else {
            int a = cal(input, table.clone(), date + 1, true, val);
            int b = cal(input, table.clone(), date + 1, false, val);
            return a > b ? a : b;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
        // String s = br.readLine(); //문자열로 받기
        int N = Integer.parseInt(br.readLine()); // 정수로 받기
        String[][] temp = new String[N][2];
        int[][] input = new int[N][2];
        for (int i = 0; i < N; i++) {
            temp[i] = (br.readLine()).split(" ");
            input[i][0] = Integer.parseInt(temp[i][0]);
            input[i][1] = Integer.parseInt(temp[i][1]);
        }

        boolean[] table = new boolean[N];
        int a = cal(input, table.clone(), 0, true, 0);
        int b = cal(input, table.clone(), 0, false, 0);
        int val = a > b ? a : b;

        bw.write(val + "");
        bw.flush();
        bw.close();
    }
}
