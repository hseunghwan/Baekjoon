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

        int N = Integer.parseInt(br.readLine());
        String[] temp;
        int[][] input = new int[N][2];
        for (int i = 0; i < N; i++) {
            temp = br.readLine().split(" ");
            input[i][0] = Integer.parseInt(temp[0]);
            input[i][1] = Integer.parseInt(temp[1]);
        }
        Arrays.sort(input, new Comparator<int[]>() {
			
			@Override
			public int compare(int[] o1, int[] o2) {
				
				// 종료시간이 같을 경우 시작시간이 빠른순으로 정렬해야한다.  
				if(o1[1] == o2[1]) {
					return o1[0] - o2[0];
				}
				
				return o1[1] - o2[1];
			}
 
		});
        
        System.out.println(cal(input));
    }
}