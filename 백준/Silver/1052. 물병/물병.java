import java.util.Scanner;

public class Main {
    public static double log2(int x) {
        return Math.log(x) / Math.log(2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int temp = N;
        int pretemp = 0;
        for (int i = 0; i < K; i++) {
            pretemp = temp;
            temp -= Math.pow(2, (int) log2(temp));

        }
        if(temp == 0){
            System.out.println(temp);
        }else{
            System.out.println(pretemp - 2*temp);
        }

    }

}
