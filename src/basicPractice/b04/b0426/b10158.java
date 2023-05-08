package basicPractice.b04.b0426;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b10158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine()," ");
        int W = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");
        int p = Integer.parseInt(st.nextToken()); // w 위치
        int q = Integer.parseInt(st.nextToken()); // h위치
        int t = Integer.parseInt(br.readLine()); // 시간


        System.out.println(p+" "+q);
        br.close();
    }
}
