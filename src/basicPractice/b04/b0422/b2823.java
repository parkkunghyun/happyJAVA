package basicPractice.b04.b0422;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b2823 {
    public static <Scanner> void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int dx[] = {0, 1, 0, -1};
        int dy[] = {1, 0, -1, 0};
        char a[][] = new char[r][c];
        for(int i =0; i<r; i++) {
            String s = br.readLine();
            for (int j =0; j<s.length(); j++) {
                a[i][j] = s.charAt(j);
            }
        }

        int ans = 0;
        for(int i=0; i<r; i++) {
            for(int j=0; j<c; j++) {
                int cnt = 0;
                if(a[i][j] == '.') {
                    for(int k=0; k<4; k++) {
                        int x = i + dx[k];
                        int y = j + dy[k];
                        if(0 <= x && x < r && 0 <= y && y < c) {
                            if(a[x][y] == 'X')
                                cnt++;
                        } else cnt++;
                        if(cnt >= 3) {
                            ans = 1;
                            break;
                        }
                    }
                }
            }
        }
        System.out.println(ans);
    }

}
