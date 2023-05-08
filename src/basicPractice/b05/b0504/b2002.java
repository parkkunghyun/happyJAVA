package basicPractice.b05.b0504;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class b2002 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 터널 입구 출구에 잠복해서 차량 번호 적기
        // 스택으로 하는데 추월해서 나오면 답에 +1 하고 저 차량 스택에서 그냥 없애버리기!

        int n = Integer.parseInt(br.readLine());
        Queue<String> q1 = new LinkedList<>();

        for(int i =0; i<n; i++) {
            q1.add(br.readLine());
        }
        int result =0;
        Queue<String> queue = new LinkedList<>();

        for(int i =0; i<n; i++) {
            queue.add(br.readLine());
        }

        for(int i =0; i<n; i++) {
            String carNumber = queue.poll();
            if(carNumber.equals(q1.peek())) {
                q1.poll();
            }
            else {
                q1.remove(carNumber);
                //System.out.println("carNumberis======>" + carNumber);
                result+=1;
            }
        }
        System.out.println(result);

        br.close();
    }
}
