import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int[] arr1 = {31,28,31,30,31,30,31,31,30,31,30};
		String[] arr2 = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
		int temp = 0;
		for(int i=0;i<a-1;temp+=arr1[i++]); 
		System.out.println(arr2[(temp+b)%7]);
	}
}
