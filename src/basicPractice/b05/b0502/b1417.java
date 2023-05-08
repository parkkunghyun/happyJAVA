package basicPractice.b05.b0502;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class b1417 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        // 후보 N명 M명의 마을 사람

        int n = Integer.parseInt(br.readLine());
        int dasom = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i =0; i<n-1; i++) {
           int person = Integer.parseInt(br.readLine());
           if (person >= dasom) {
               pq.add(person);
           }
        }

        int count = 0;
        while (!pq.isEmpty() && pq.peek() >= dasom) {
            count++;
            dasom++;
            pq.add(pq.poll()-1);
        }
        System.out.println(count);
        br.close();
    }
}
