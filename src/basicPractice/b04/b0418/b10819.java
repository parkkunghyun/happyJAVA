package basicPractice.b04.b0418;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b10819 {
    static int n;
    static int [] arr;
    static int [] change;
    static boolean [] visited;
    static int result = Integer.MIN_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        arr = new int[n];
        visited = new boolean[n];
        change = new int[n];
        for(int i =0; i<n; i++) {
            arr[i] =Integer.parseInt( st.nextToken());
        }

        // 1. 순서를 바꾼 배열들 만들기!
        dfs(0);
        System.out.println(result);
        // 2. 이 배열들 중 가장 큰 수 찾아내기!
        br.close();
    }
    public static void dfs(int depth) {
        if(depth == n) {
            result = Math.max(result, getResult());
            return;
        }
        for(int i =0; i<n; i++){
            if(!visited[i]){
                visited[i] = true;
                change[depth] = arr[i];
                dfs(depth+1);
                visited[i] = false;
            }
        }
    }
    public static int getResult() {
        // change배열을 이용하기!
        int sum = 0;
        for(int i =0; i<n-1; i++) {
            sum += Math.abs(change[i] - change[i+1]);
        }
        return sum;
    }




}
