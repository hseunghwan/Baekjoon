import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int max, min, n = scan.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;arr[i++]=scan.nextInt());
		max=min=arr[0];
		for(int i=1; i<n; i++) {
			if(max<arr[i]) {max = arr[i]; continue;}
			if(min>arr[i]) min = arr[i];
		}
		System.out.println(min+" "+max);
	}
}
