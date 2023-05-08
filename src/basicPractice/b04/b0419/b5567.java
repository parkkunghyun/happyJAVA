package basicPractice.b04.b0419;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class b5567 {
    static boolean [] visited;
    static int [] arr;
    static int n,answer= 0;
    static int result =0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 1-N
        // 초대할 사람의 수, 친구의 친구까지만!
        // 2,3 -> 4
        // 깊이니까 dfs로 3명까지 탐색!
        n = Integer.parseInt(br.readLine());
        int m= Integer.parseInt(br.readLine());
        List<Integer> [] list = new ArrayList[n+1];
        for(int i =1; i<=n; i++ ){
            list[i] = new ArrayList<>();
        }
        for(int i =0; i<m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            list[a].add(b);
            list[b].add(a);
        }
        visited = new boolean[n+1];
        visited[1] = true;
        dfs(1,list,0);
        for(int i=2; i<n+1; i++) {
            if(visited[i] == true) {
                answer+=1;
            }
        }
        System.out.println(answer);
        br.close();
    }
    public static void dfs(int num, List<Integer> [] list, int depth) {
        if(depth ==2) {
            return;
        }
        for(int i =0; i<list[num].size(); i++) {
            int next = list[num].get(i);
            visited[next] = true;
            dfs(next,list,depth+1);
        }
    }
}
