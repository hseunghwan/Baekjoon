import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String n = scan.nextLine();
        for(int i=0;i<=n.length()/10;i++){
            if(i==n.length()/10) {
                System.out.print(n.substring(i*10)); 
                break;
            }
            System.out.println(n.substring(i*10,(i+1)*10));
        }
	}
}