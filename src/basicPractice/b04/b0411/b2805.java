package basicPractice.b04.b0411;

import java.io.*;
import java.util.StringTokenizer;

public class b2805 {
    // H를 지정
    // 적어도 M미터의 나무를 가져가기위해 -> 높이 최댓값!
    static int m = 0;
    static int cnt;
    static int n;
    static Integer [] trees;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        int min = 0;
        long max =0;
        trees = new Integer[n];

        st = new StringTokenizer(br.readLine(), " ");
        for(int i =0; i<n; i++) {
            int tree = Integer.parseInt(st.nextToken());
            trees[i] = tree;
            if(max<tree) {
                max = tree;
            }
        }
        long start = 0;
        long end = max;

        while(start<=end){
            long mid = (start+end) /2;
            long sum = 0;

            for(int tree: trees) {
                if(tree-mid >0){
                    sum += tree - mid;
                }
            }
            if(sum >= m) {
                start = mid+1;
            }else {
                end = mid -1;
            }
        }


        System.out.println(end);
        br.close();
        bw.close();
    }

}
