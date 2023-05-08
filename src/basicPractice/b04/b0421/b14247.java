package basicPractice.b04.b0421;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class b14247 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Long answer = 0L;
        for (int i = 0; i < n; i++) {
            answer += Long.parseLong(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());

        int[] growth = new int[n];
        for (int i = 0; i < n; i++) {
            growth[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(growth);
        for (int i = 0; i < n; i++) {
            answer += growth[i]*i;
        }
        // 0, 2, 6, 12 ,28 + 16 =
        System.out.println(answer);

        br.close();
    }
}
