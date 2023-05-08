package basicPractice.b05.b0502;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b15904 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        StringBuilder sb = new StringBuilder();

        String s = br.readLine();
        int idx = 0;
        char [] word = {'U', 'C', 'P', 'C'};
        for(int i =0; i<s.length(); i++) {
            if(word[idx] == s.charAt(i)) {
                idx++;
            }
            if(idx == 4) {
                System.out.println("I love UCPC");
                return;
            }
        }
        System.out.println("I hate UCPC");
        br.close();
    }
}
