package basicPractice.b04.b0418;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class b2304 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 시작위치와 끝위치 알아야함!
        int n = Integer.parseInt(br.readLine());
        int [] arr = new int[1001];
        int start = 9999;
        int end = -1;
        int maxHigh = -1;
        int result = 0;

        for(int i =0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int L = Integer.parseInt(st.nextToken());
            int H = Integer.parseInt(st.nextToken());
            arr[L] = H;
            start = Math.min(start,L);
            end = Math.max(end,L);
            maxHigh = Math.max(maxHigh, H);
        }
        Stack<Integer> stack = new Stack<>();
        int height = arr[start]; // 처음 높이!
        int temps = 0;

        // 왼쪽-> 오른쪽으로 증가를 찾아서!
        for(int i=start; i<=end; i++) {
            if(arr[i] <= height) {
                stack.push(i); // 2,3
            }
            else{
                while(!stack.isEmpty()) {
                    stack.pop();
                    result += height;
                }
                height = arr[i];
            }
        }
        stack.clear();
        height = arr[end];
        // 오른쪽 -> 왼쪽으로 증가를 찾아서!
        for(int i = end; i>=start; i--) {
            if(arr[i] <= height) {
                stack.push(i); // 2,3
            }
            else{
                while(!stack.isEmpty()) {
                    stack.pop();
                    result += height;
                }
                height = arr[i];
            }
        }
        // 제일 높은애 계산!
        result += maxHigh;

        System.out.println(result);
        br.close();
    }
}
