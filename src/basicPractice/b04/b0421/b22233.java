package basicPractice.b04.b0421;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class b22233 {
    static int [][] arr;
    static boolean [][] visited;
    static int answer = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        arr = new int[n][m];
        for(int i =0; i<n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for(int j=0; j<m; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int T = Integer.parseInt(br.readLine());

        for(int i =0; i<n; i++) {
            for(int j=0; j<m; j++){
                if(arr[i][j] < T) {
                    arr[i][j] = 0;
                }else{
                    arr[i][j] = 1;
                }
            }
        }

        visited = new boolean[n][m];
        for(int i =0; i<n; i++) {
            for(int j=0; j<m; j++){
                if(visited[i][j] == false && arr[i][j] == 1) {
                    answer+=1;
                    bfs(i,j);
                }
            }
        }

        System.out.println(answer);
        br.close();
    }
    public static void bfs(int r, int c) {
        visited[r][c] =true;
        int [] sx = {1,-1,0,0};
        int [] sy = {0,0,1,-1};

        // deque?가 있나?
        Queue<Point> q = new LinkedList<>();
        q.add(new Point(r,c));
        while(!q.isEmpty()) {
            Point cur = q.poll();

            for(int i =0; i<4; i++) {
                int nr = sy[i]+r;
                int nc = sx[i] + c;

                if(0<= nr && nr <arr.length
                 && 0<= nc && nc <arr[0].length
                        && visited[nr][nc] == false && arr[nr][nc]==1) {
                    q.add(new Point(nr,nc));
                    visited[nr][nc] =true;
                }
            }
        }
    }
}
