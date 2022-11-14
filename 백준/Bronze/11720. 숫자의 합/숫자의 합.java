import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String s = scan.next();
        String[] str = s.split("");
        int temp = 0;
        for(int i = 0;i<n;i++) {
            temp+=Integer.parseInt(str[i]);
        }
        System.out.print(temp);       
    }
}