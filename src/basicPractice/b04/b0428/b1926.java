package basicPractice.b04.b0428;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class b1926 {
    static int h,w;
    static int [][] map;
    static int dx[] = {-1,1,0,0};
    static int dy[] = {0,0,-1,1};
    static boolean visited[][];
    static int count = 0;

    public static void dfs(int y, int x) {
        visited[y][x] =true;
        count ++;

        for(int i=0; i< 4; i++) {
            int sy = dy[i] + y;
            int sx = dx[i] + x;

            if(0<= sy && sy<h && 0<= sx && sx < w
                    && !visited[sy][sx] && map[sy][sx] == 1) {
                dfs(sy,sx);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        h = Integer.parseInt(st.nextToken());
        w = Integer.parseInt(st.nextToken());

        map = new int[h][w];
        visited = new boolean[h][w];

        boolean zero = false;
        List<Integer> answer = new ArrayList<>();

        for(int i =0; i<h; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for(int j =0; j<w; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());

                if(map[i][j] == 1) {
                    zero = true;
                }
            }
        }
        if(!zero) {
            System.out.println("0");
            System.out.println("0");
            return;
        }

        for(int i =0; i<h; i++) {
            for(int j =0; j<w; j++) {
                count = 0;
                if(!visited[i][j] && map[i][j] ==1) {
                    dfs(i,j);
                    answer.add(count);
                }
            }
        }

        Collections.sort(answer);
        System.out.println(answer.size());
        System.out.println(answer.get(answer.size()-1));
        br.close();
    }

}
