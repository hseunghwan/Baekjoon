import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int a = 1;
        int b = 0;
        int temp = 0;

        for(int i = 0; i < n; i++){
            temp = a;
            a = b;
            b += temp;
        }

        System.out.println(a + " " + b);
        in.close();
    }
}
