import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b;
        String str;
        int n = in.nextInt();
        in.nextLine();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            str = in.nextLine();
            a = str.charAt(0);
            b = str.charAt(2);      
            arr[i] = a + b - 2 * '0';
        }
        for(int i = 0; i < n; i++){
            System.out.println(arr[i]);
        }
        in.close();

    }
}
