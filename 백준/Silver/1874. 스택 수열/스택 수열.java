import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] agrs) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(br.readLine());
        }
        StringBuffer sb = new StringBuffer();
        int cnt = 0;
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < N; i++) {
            if (cnt < array[i]) {
                for (int j = cnt; j < array[i]; j++) {
                    cnt++;
                    s.push(cnt);
                    sb.append("+\n");
                }
                s.pop();
                sb.append("-\n");
            }else{
                if (s.peek() != array[i]) {
                    System.out.println("NO");
                    return;
                } else {
                    s.pop();
                    sb.append("-\n");
                }
            }
        }
        System.out.println(sb);
        br.close();
    }
}