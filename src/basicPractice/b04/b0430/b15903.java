package basicPractice.b04.b0430;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class b15903 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");

        PriorityQueue<Long> heap = new PriorityQueue<Long>();
        for(int i =0; i<n; i++) {
            heap.add(Long.parseLong(st.nextToken()));
        }

        long result = 0;

        // 트리정렬 즉 힙 정렬 느낌으로 제일작은거 두개빼서 더하고 두개 넣고 이거 반복!
        // m번 반복!
        for(int i =0; i<m; i++) {
            Long small = heap.poll(); // 최저값빼기!
            Long small2 = heap.poll();
            Long resize = small2+small;
            heap.add(resize);
            heap.add(resize);
        }

        while (!heap.isEmpty()) {
            result += heap.poll();
        }
        System.out.println(result);
        br.close();
    }
}
