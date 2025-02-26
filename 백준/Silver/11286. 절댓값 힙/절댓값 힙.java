import java.util.Scanner;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] array = new long[N];
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> {
            int absA = Math.abs(a);
            int absB = Math.abs(b);
            if( absA == absB) return a - b;
            return absA - absB;
        });
        for(int i = 0; i<N; i++){
            int temp = sc.nextInt();
            if(temp == 0){
                if(pq.size() > 0){
                    System.out.println(pq.poll());
                }else{
                    System.out.println('0');
                }
            }else{
                pq.offer(temp);
            }

        }
    }
}