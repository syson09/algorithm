import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
public class Main {
    public static void main(String[] agrs) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] array = new int[N];
        for(int i = 0; i< N; i++){
            array[i] = Integer.parseInt(br.readLine());
        }
        StringBuilder sb = new StringBuilder();
        int cnt = 0;
        Stack<Integer> s = new Stack<>();
        for(int i = 0; i<N; i++){
            if(cnt < array[i]) {
                for (int j = cnt; j < array[i]; j++) {
                    cnt++;
                    s.push(cnt);
                    sb.append('+').append("\n");
                    //System.out.println('+');

                }
            }
            if(cnt == array[i]){
                s.pop();
                //System.out.println('-');
                sb.append('-').append("\n");

            }else if(cnt > array[i]){

                    if(s.peek() != array[i]){
                        System.out.println("NO");
                       return;
                    }else{
                        s.pop();
                        //System.out.println('-');
                        sb.append('-').append("\n");
                    }


            }

        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }

}