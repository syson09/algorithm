import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Queue<Integer> q = new LinkedList<>();
        for(int i = 1; i <= N; i++){
            q.offer(i);
        }
        int cnt = 1;
        while(q.size() > 1){
            if(cnt%2 == 0){
                q.offer(q.poll());
            }else{
                q.poll();
            }
            cnt++;
        }
        System.out.println(q.peek());
    }
}