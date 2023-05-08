package basicPractice.b04.b0418;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b1024 {
    // 1:20 - 1:40 알고리즘 고민
    // 실제 코딩

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        //일단 수열을 만들어서 이걸 다 더한게 맞으면 브레이크!

        boolean isFlag= false;
        for(int i = L; i<=N+1; i++) {
            int idx= 0; // 0 1 2 3 .. 이게 더해지는 연속수!
            int sum = i*(i-1) / 2; // 합계!

            while(true) {
                if(sum == N) {
                    for(int k=0; k<i; k++){
                        System.out.print(idx+k+" ");
                    }
                    System.exit(0);
                }
                if(sum > N) {
                    break;
                }
                sum += i;
                idx +=1;
            }
        }
        System.out.println(-1);
        br.close();
    }
}
