import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.nextLine();

        int[][] student = new int[6][2];
        int y, x;
        int count = 0;

        for(int i = 0; i < n; i++){
            x = sc.nextInt();
            y = sc.nextInt();
            sc.nextLine();
            student[y-1][x]++;
        }
        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 2; j++){
                count += Math.ceil(((float)student[i][j]) / k); 
            }
        }
        System.out.println(count);
        sc.close();
    }
}
