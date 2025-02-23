
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int S = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        char[] a = br.readLine().toCharArray();

        st = new StringTokenizer(br.readLine());
        int[] b = new int[4];
        for(int i = 0; i < b.length; i++){
            b[i] = Integer.parseInt(st.nextToken());
        }
        int cnt = 0;
        int cnt1 = 0, cnt2 = 0, cnt3 = 0, cnt4 = 0;


        for(int i = 0; i < S; i++){
            switch(a[i]){
                case 'A':
                    cnt1 ++;
                    break;
                case 'C':
                    cnt2 ++;
                    break;
                case 'G':
                    cnt3 ++;
                    break;
                case 'T':
                    cnt4 ++;
                    break;
            }
            if(i > P-1){
                switch(a[i - P]){
                    case 'A':
                        cnt1 --;
                        break;
                    case 'C':
                        cnt2 --;
                        break;
                    case 'G':
                        cnt3 --;
                        break;
                    case 'T':
                        cnt4 --;
                        break;
                }
            }

            if(i>= P-1 && b[0] <= cnt1 && b[1] <= cnt2 && b[2] <= cnt3 && b[3] <= cnt4) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
