import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[a];

        for(int i = 0; i < a; i++)
            arr[i] = sc.nextInt();

        int x = sc.nextInt();
        int count = 0;
        boolean[] occ = new boolean[2000001];
        for(int i = 0;i < a ;i++){
            if(x - arr[i] > 0 &&occ[x - arr[i]]) count++;
            occ[arr[i]] = true;
        }
        System.out.println(count);
    }
}
