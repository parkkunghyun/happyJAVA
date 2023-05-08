package basicPractice.b05.b0504;

import java.io.*;
import java.util.StringTokenizer;

public class b12782 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());
        for(int k = 0; k<T; k++) {
            st = new StringTokenizer(br.readLine(), " ");
            String n = st.nextToken();
            String m = st.nextToken();

            int oneCount = 0;
            int zeroCount = 0;

            for(int i =0; i<n.length(); i++) {
                if(n.charAt(i) != m.charAt(i)) {
                    if (n.charAt(i) == '1') {
                        oneCount++;
                    }else {
                        zeroCount++;
                    }
                }
            }
            int result =  Math.min(oneCount, zeroCount) +Math.abs(oneCount - zeroCount);
            sb.append(result);
            sb.append("\n");
        }
        System.out.println(sb.toString());
        br.close();
        bw.flush();
        bw.close();
    }

}
