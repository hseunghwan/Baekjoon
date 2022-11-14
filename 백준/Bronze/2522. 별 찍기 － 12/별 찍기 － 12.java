import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int i=1; i<=2*n-1; i++) {
			for(int j=0; j<Math.abs(n-i); j++) System.out.print(" ");
			for(int k=0; k<n-Math.abs(n-i); k++) System.out.print("*");
			System.out.println();
		}
			
	}
}
