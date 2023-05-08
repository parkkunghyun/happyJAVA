package basicPractice.b04.b0411;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class b2331 {
    // 57, 74, 65, 61,37,58. 89.
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());

        List<Integer> list = new ArrayList<>();
        list.add(a);

        while (true) {
            int temp = list.get(list.size()-1);
            int result = 0;

            while (temp!=0) {
                result += Math.pow(temp%10,p);
                temp = temp/10; // 57 -> 7 , 5
            }

            if(list.contains(result)) {
                int ans = list.indexOf(result);
                bw.write(ans+"\n");
                break;
            }
            list.add(result);
        }

        br.close();
        bw.close();
    }
}
