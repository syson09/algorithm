import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int[] a = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            a[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(a); // 오름차순으로 정렬
        int start = 0, end = N-1, cnt = 0;
        while(start < end){
            if(a[start] + a[end] == M){
                cnt++;
                start ++;
                end --;
            }else if(a[start] + a[end] < M ){
                start++;
            }else{
                end --;
            }
        }
        System.out.println(cnt);

    }
}