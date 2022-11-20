import java.util.Scanner;

public class Main {
    public static int find(int N, int r, int c) {
        int result = 0;
        int pow = (int) Math.pow(2, N - 1);
        if (r < 2 && c < 2) {
            result += r * 2 + c;
        } else {
            if (r < pow) {
                if (c < pow) {
                    result += find(N - 1, r, c);
                } else {
                    result += pow*pow;
                    result += find(N - 1, r, c - pow);
                }
            } else {
                if (c < pow) {
                    result += 2 * pow*pow;
                    result += find(N - 1, r - pow, c);
                } else {
                    result += 3 * pow*pow; 
                    result += find(N - 1, r - pow, c - pow);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int r = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(find(N,r,c));
    }
}
