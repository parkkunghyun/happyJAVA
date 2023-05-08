package basicPractice.b04.b0430;

import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class b5568 {
    public static int NUMBER_OF_CARD;
    static int NUMBER_OF_SELECT;
    static String card[];
    static boolean visited[];
    static HashSet<String> hs = new HashSet<String>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        NUMBER_OF_CARD = Integer.parseInt(br.readLine());
        NUMBER_OF_SELECT = Integer.parseInt(br.readLine());

        card = new String[NUMBER_OF_CARD];
        visited = new boolean[NUMBER_OF_CARD];

        for(int i =0; i<NUMBER_OF_CARD; i++) {
            card[i] = br.readLine();
        }

        selectCard(NUMBER_OF_SELECT, "");
        sb.append(hs.size());
        sb.append("\n");
        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }

    public static void selectCard(int remain, String k) {
        if(remain ==0) {
            hs.add(k);
            return;
        }
        for(int i =0; i<NUMBER_OF_CARD; i++) {
            if(!visited[i]) {
                visited[i] = true;
                selectCard(remain-1, k+card[i]);
                visited[i] = false;
            }
        }
    }

}
