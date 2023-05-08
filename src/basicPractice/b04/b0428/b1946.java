package basicPractice.b04.b0428;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class b1946 {
    static int result;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());
        for(int k = 0; k<T; k++ ){
            int N = Integer.parseInt(br.readLine());
            int [] arr = new int[N+1];
            for(int i =0; i<N; i++){
                st = new StringTokenizer(br.readLine(), " ");
                int index = Integer.parseInt(st.nextToken());
                int value = Integer.parseInt(st.nextToken());
                arr[index] = value;
            }
            result = 1;

            int vot = arr[1];
            for(int i =2; i<N+1; i++) {
                if(arr[i] < vot) {
                    vot = arr[i];
                    result+=1;
                }
            }
            System.out.println(result);

        }
        br.close();
    }
}
