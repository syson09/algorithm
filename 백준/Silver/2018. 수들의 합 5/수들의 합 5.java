import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int start = 1, end = 1, sum = 1, cnt = 0;
        
        while(end <= N){
            if(sum == N){
                cnt ++;
                sum -= start;
                start ++;
            }else if(sum < N){
                end ++;
                sum += end;
            }else if(sum > N){
                sum -= start;
                start++;
            }
        }
        System.out.println(cnt);
    }
}