import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int[] num = new int[10];
        int d = a * b * c; 
        for(;d > 0;d /= 10){
            num[d%10]++; 
        }
        for(int i : num){
            System.out.println(i);
        }
    }
}
