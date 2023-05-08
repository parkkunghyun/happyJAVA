package basicPractice.b04.b0424;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class b5397 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb= new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        for(int i =0; i<t; i++) {
            Stack<Character> preStack = new Stack<>();
            Stack<Character> postStack = new Stack<>();

            String password = br.readLine();
            for(int j =0; j<password.length(); j++) {
                char p = password.charAt(j);

                if(p =='<') {
                    if(!preStack.isEmpty()) {
                        postStack.push(preStack.pop());
                    }
                }
                if(p=='>') {
                    if(!postStack.isEmpty()) {
                        preStack.push(postStack.pop());
                    }
                }
                if( ('0'<= p && p<='9') || ('a'<=p && p<='z') ||  ('A'<=p && p<='Z') ){
                    preStack.push(p);
                }

                if(p =='-') {
                    if(!preStack.isEmpty()) {
                        preStack.pop();
                    }
                }
            }
            // BPAC
            while(!preStack.isEmpty()) {
                postStack.push(preStack.pop());
            }
            while(!postStack.isEmpty()) {
                sb.append(postStack.pop());
            }
            sb.append("\n");

            System.out.println(sb.toString());
        }


        br.close();
    }
}
