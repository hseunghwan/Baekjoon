import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//1931 회의실 배정
public class Main {
   
    public static int cal(int[][] input){
        int count = 1;
        int endtime = input[0][1];
        for (int i = 1; i < input.length; i++) {
            if(endtime <= input[i][0]){
                endtime = input[i][1];
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] temp = br.readLine().split(" ");
        int N = Integer.parseInt(temp[0]);
        int M = Integer.parseInt(temp[1]);
        String[] input = new String[N+M];
        for (int i = 0; i < N+M; i++) {
            input[i] = br.readLine();
        }

        Arrays.sort(input);

        String[] result = new String[N+M]; 
        int j = 0;
        for (int i = 0; i < N+M-1; i++) {
            if(input[i].equals(input[i+1])) 
                result[j++] = input[i++];
        }

        System.out.println(j);
        for (int i = 0; i < j; i++) {
            System.out.println(result[i]);
        }
    }
}