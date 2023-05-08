package basicPractice.b05.b0504;

import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class b1822 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        // A에는 속하면서 B에는 안속하는 원소 찾기!

        st = new StringTokenizer(br.readLine()," ");
        TreeSet<Integer> A = new TreeSet<>();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine()," ");
        for(int i =0; i<n; i++){
            A.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine()," ");
        for(int i =0; i<m; i++){
            int s1 = Integer.parseInt(st.nextToken());

            if (A.contains(s1)) {
                A.remove(s1);
            }
        }

        System.out.println(A.size());

        for(int ss : A) {
            System.out.print(ss+" ");
        }

        bw.close();
        br.close();
    }
}
