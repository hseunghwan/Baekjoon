
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c;
        int[] arr = new int[26];
        for(int i = 0; i < str.length(); i++){
            c = str.charAt(i);
            arr[c-'a']++;
        }

        for(int i = 0; i < 26; i++){ 
            System.out.print(arr[i]);
            System.out.print(' ');
        }
    }
}