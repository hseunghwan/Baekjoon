import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int a,b;
         a = scan.nextInt();
         b = scan.nextInt();
        while(a!=0||b!=0){
            System.out.println(a+b);
            a = scan.nextInt();
            b = scan.nextInt();
        }
    }
}