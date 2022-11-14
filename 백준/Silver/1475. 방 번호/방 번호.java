import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        
        int[] num = new int[10];
        for(;a > 0;a /= 10){
            num[a%10]++; 
        }
        num[6] = Math.round(((float)num[6] + (float)num[9])/2);
        num[9] = 0;
        int temp = 0;
        for(int i : num)
            temp = temp > i ? temp : i;
        System.out.println(temp);
    }
}
