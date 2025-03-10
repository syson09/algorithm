import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
    static int[] dx = {0,1,0,-1};   // 좌우이동
    static int[] dy = {1,0,-1,0};   // 상하이동
    static boolean[][] visited;     // 방문여부
    static int[][] A;               // 미로
    static int N, M;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        A = new int[N][M];
        visited = new boolean[N][M];
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            String line = st.nextToken();
            for(int j=0; j<M; j++){
                A[i][j] = Integer.parseInt(line.substring(j,j+1));
            }
        }
        BFS(0,0);
        System.out.println(A[N-1][M-1]);
    }
    private static void BFS(int i, int j){
        Queue<int[]>queue = new LinkedList<>();
        queue.offer(new int[] {i,j});
        visited[i][j] = true;
        while(!queue.isEmpty()){
            int now[] = queue.poll();

            for(int k=0; k<4; k++){ // 상하좌우로 탐색
                int x = now[0] + dx[k];
                int y = now[1] + dy[k];
                if(x >= 0 && y >= 0 && x < N && y < M){ // 배열을 넘어가면 안됨
                    if(A[x][y] != 0 && !visited[x][y]){ // 0이 아니고 방문했던 곳이 아니어야함v
                        visited[x][y] = true;
                        A[x][y] = A[now[0]][now[1]] +1; // 핵심
                        queue.add(new int[] {x,y});
                    }
                }
            }
        }
    }
}