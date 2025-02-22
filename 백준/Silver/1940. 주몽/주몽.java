import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] array = new int[N];
        for(int i = 0; i<N; i++){
            array[i] = Integer.parseInt(st.nextToken());
        }
        int cnt = 0;
        for(int i = 0; i < N; i++){
            for(int j = i + 1; j < N; j++){
                if(array[i] + array[j] == M) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);

    }
}