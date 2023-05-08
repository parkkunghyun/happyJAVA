package basicPractice.b04.b0424;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b4963 {
    //
    static int [] dy = {1,-1,0,0,1,-1,1,-1};
    static int [] dx = {0,0,1,-1,1,-1,-1,1};

    static int w,h;
    static boolean [][] visited;
    static int [][] map;
    static int cnt;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        while(true) {
            st = new StringTokenizer(br.readLine(), " ");
            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());

            if(h==0 && w==0) {
                System.exit(0);
            }

            map = new int[h][w];
            visited = new boolean[h][w];
            cnt = 0;

            for(int i =0; i<h; i++) {
                st = new StringTokenizer(br.readLine(), " ");
                for(int j =0; j<w; j++) {
                    int c = Integer.parseInt(st.nextToken());
                    map[i][j] = c;
                }
            }

            for(int i =0; i<h; i++) {
                for (int j =0; j<w; j++) {
                    if(map[i][j] ==1 && visited[i][j] == false) {
                        dfs(i,j);
                        cnt++;
                    }
                }
            }
            System.out.println(cnt);
        }
    }

    public static void dfs(int y,int x) {
        visited[y][x] = true;
        for(int i =0; i<8; i++) {
            int sy = dy[i]+y;
            int sx = dx[i] + x;

            if(0<=sy && sy<h && 0<= sx && sx<w && map[sy][sx] ==1 && visited[sy][sx] == false) {
                dfs(sy,sx);
            }
        }
    }
}
