package basicPractice.b04.b0412;

import java.io.*;
import java.util.StringTokenizer;

public class b19939 {
    //  N개의 정수중 서로 다른 위치 두개뽑기? -> 순열?
    // 6 4 8 6 12 8
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Long[] num = new Long[N + 1];
        Long[] cumSum = new Long[N + 1];
        num[0] = 0L;
        cumSum[0] = 0L;
        for (int i = 1; i <= N; i++) {
            num[i] = Long.parseLong(st.nextToken());
            cumSum[i] = num[i] + cumSum[i - 1];
        }
        // 0 2 5 9
        // 2 3 4
        //
        Long sumVal = 0L;
        for (int i = 2; i <= N; i++) {
            System.out.println("num, cumSum" + num[i] +", " + cumSum[i-1]);
            sumVal += num[i] * cumSum[i-1];
        }
        System.out.println(sumVal);

    }
}
