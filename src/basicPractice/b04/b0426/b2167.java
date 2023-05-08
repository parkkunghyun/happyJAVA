package basicPractice.b04.b0426;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b2167 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int [][] arr = new int[N][M];
        for(int i =0; i<N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for(int j =0; j<M; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int k = Integer.parseInt(br.readLine());

        for(int i =0; i<k; i++) {
            int result = 0;
            st = new StringTokenizer(br.readLine());
            int startH = Integer.parseInt(st.nextToken()) -1;
            int startW = Integer.parseInt(st.nextToken()) -1;
            int endH = Integer.parseInt(st.nextToken()) ;
            int endW = Integer.parseInt(st.nextToken()) ;

            for(int y = startH; y<endH; y++) {
                for(int x = startW; x<endW; x++) {
                    result += arr[y][x];
                }
            }
            System.out.println(result);
        }


        br.close();

    }
}
