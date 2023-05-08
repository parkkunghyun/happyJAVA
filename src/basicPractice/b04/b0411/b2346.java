package basicPractice.b04.b0411;

import java.io.*;
import java.util.StringTokenizer;

public class b2346 {
    // 1 -n 원형
    // 3 2 1 -3 -1
    // 1
    // 1 4 5
    //
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int [] balloons = new int[n];
        for(int i =0; i<n; i++) {
            balloons[i] = Integer.parseInt(st.nextToken());
        }
        boolean [] visited = new boolean[n];

        int currentIdx = 0;
        int value = 0;

        while(true) {
            if(balloons.length ==0) {
                break;
            }
            visited[currentIdx] = true;
            value += balloons[currentIdx];

            sb.append(currentIdx);
        }
    }

}
