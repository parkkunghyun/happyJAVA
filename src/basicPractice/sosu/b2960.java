package basicPractice.sosu;

import java.io.*;
import java.util.StringTokenizer;

public class b2960 {
    static boolean [] v1;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        // 소수 출력이면 에라토스테네의 체 생각하자!
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        v1 = new boolean[n+1];
        get_prime();
        StringBuilder sb = new StringBuilder();

        for(int i = m; i<=n; i++) {
            if(!v1[i]) {
                sb.append(i).append('\n');
            }
        }
        System.out.println(sb);

        br.close();
        bw.close();
    }
    public static void get_prime() {
        // true = 소수 아님 false = 소수
        v1[0] = true;
        v1[1] = true;

        for(int i =2; i<Math.sqrt(v1.length); i++) {
            for (int j =i*i; j<v1.length; j+=i) {
                v1[j] = true;
            }
        }
    }

}
