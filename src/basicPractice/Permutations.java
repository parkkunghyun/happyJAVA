package basicPractice;

import java.util.Arrays;

public class Permutations {
    private static int n,m;
    private static int[] arr; //원소를 저장할 배열
    private static boolean[] visited; //중복 제거 위한 방문 처리

    public static void main(String[] args) {
        n = 4;
        m = 2;
        arr = new int[m];
        visited = new boolean[n+1];
        permutation(0);
    }
    private static void permutation(int cnt) {
        if(cnt ==m) {
            System.out.println(Arrays.toString(arr));
            return;
        }
        for(int i =1; i<=n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                arr[cnt] = i;
                permutation(cnt+1);
                visited[i] = false;
            }
        }
    }
    private static void repeatPermutation(int cnt ){
        if(cnt==m){
            System.out.println(Arrays.toString(arr));
            return;
        }
        for(int i =1; i<=n; i++) {
                arr[cnt] = i;
                permutation(cnt+1);
        }
    }

    private static void combinations(int cnt, int start) {
        if (cnt ==m) {
            System.out.println(Arrays.toString(arr));
            return;
        }
        for(int i =start; i<=n; i++) {
            arr[cnt] = i;
            combinations(cnt+1, i+1); //오름차순으로 구하기
        }
    }
    private static void repeatedCombinations(int cnt, int start) {
        if (cnt ==m) {
            System.out.println(Arrays.toString(arr));
            return;
        }
        for(int i =start; i<=n; i++) {
            arr[cnt] = i;
            combinations(cnt+1, i); //오름차순으로 구하기
        }
    }

}
