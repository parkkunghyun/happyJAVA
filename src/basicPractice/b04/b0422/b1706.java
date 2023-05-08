package basicPractice.b04.b0422;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class b1706 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 낱말 다 구하고 그 중 가장 먼저 나오는거 구하기!
        //그냥 한줄씩 보기? 20줄이니까 가능하지 않을라나?

        // 가로 다 보고 세로 다보기 그래서 낱말 출력?

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int R= Integer.parseInt(st.nextToken());
        int C= Integer.parseInt(st.nextToken());

        char [][] arr = new char[R][C];
        for(int i =0; i<R; i++) {
            String puzzle = br.readLine();
            for(int j =0; j<C; j++) {
                char p = puzzle.charAt(j);
                arr[i][j] = p;
            }
        }
        // 여기에 단어들 담을 예정!
        ArrayList<String > arrayList = new ArrayList<>();
        // 일단 가로!
        for(int i =0; i<R; i++) {
            String word = ""; // #이 나오면 어레이리스트에 넣고 새로 ""로 만들기!
            for(int j =0; j<C; j++) {
                if(arr[i][j] == '#' && word !="") {
                    arrayList.add(word);
                    word = "";
                }
                else if (arr[i][j] >='a' && arr[i][j] <='z') {
                    word += arr[i][j];
                }
            }
            if (word != ""){
                arrayList.add(word);
            }
        }

        // 일단 세로!
        for(int j =0; j<C; j++) {
            String word = ""; // #이 나오면 어레이리스트에 넣고 새로 ""로 만들기!
            for(int i =0; i<R; i++) {
                if(arr[i][j] == '#' && word !="") {
                    arrayList.add(word);
                    word = "";
                }
                else if (arr[i][j] >='a' && arr[i][j] <='z') {
                    word += arr[i][j];
                }
            }
            if (word != ""){
                arrayList.add(word);
            }
        }

        Collections.sort(arrayList);
        for(int i =0; i<arrayList.size(); i++) {
            String answer = arrayList.get(i);
            if(answer.length() != 1) {
                System.out.println(answer);
                System.exit(0);
            }
        }


        // 낱말이면 한단어는 안되나?

        br.close();
    }
}
