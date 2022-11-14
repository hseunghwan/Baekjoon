import java.util.Scanner;
import java.lang.Math;
public class Main{
    public static void main(String[] args){
        long a,b,c,d;
        
        
        Scanner sc = new Scanner(System.in);
        a = sc.nextLong();
        b = sc.nextLong();
        c = sc.nextLong();
        d = sc.nextLong();
        for(int i=0;i<Math.log10(b);i++) a*=10;
        for(int i=0;i<Math.log10(d);i++) c*=10;
        System.out.println(a+b+c+d);            
    }
}