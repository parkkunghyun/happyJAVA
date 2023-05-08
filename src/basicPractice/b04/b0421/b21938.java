package basicPractice.b04.b0421;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class b21938 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<String, Boolean> store = new HashMap<>();
        for(int i =0; i<N; i++) {
            store.put(br.readLine(), false);
        }

        int result = store.size();
        for(int i=0; i<M; i++) {
            // 글은 두가지인데 , 있거나 없거나!
            String letter = br.readLine();
            if( !letter.contains(",")){
                if(store.get(letter) == null) {
                    System.out.println(store.size());
                }else{
                    System.out.println(store.size() -1);
                }
            }else {
                // ,로 되어있으면 각각 ,없을때까지 분리해서 각각 확인하기!
                String [] words = letter.split(",");
                for(int j=0; j< words.length; j++) {
                    if (store.get(words[j]) != null && store.get(words[j]) != true ){
                        //System.out.println(words[j] +"=> words jj");
                        store.put(words[j], true);
                        result -=1;
                    }
                }
                System.out.println(result);
            }
        }
        br.close();
    }
}
