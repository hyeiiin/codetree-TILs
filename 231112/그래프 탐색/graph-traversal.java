import java.io.*;
import java.util.*;


public class Main {
    static int N,M,map[][],res;
    static boolean visited[];
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
    	BufferedReader br = new  BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][N];
        res = 0;
        visited = new boolean[N];
        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken())-1;
            int y = Integer.parseInt(st.nextToken())-1;
            map[x][y] = 1;
            map[y][x] = 1;
        }
        dfs(0);
        System.out.println(res);
    }
    static void dfs(int start) {
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(i==start && map[i][j]==1 && !visited[start]){
                    res++;
                    visited[start] = true;
                    dfs(j);
                }
            }
        }
    }
}