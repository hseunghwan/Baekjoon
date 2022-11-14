import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int i=0; i<n; i++) {
			for(int j=n; 0<j-i ; j--) System.out.print((j-i != 1) ? " ":"*");
			for(int k=0; k<i*2; k++) System.out.print((i != n-1)? ((k != 2*i-1) ? " ":"*"):"*");
			System.out.println();
		}
	}
}
