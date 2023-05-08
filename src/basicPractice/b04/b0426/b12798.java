package basicPractice.b04.b0426;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class b12798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int [] arr = new int[N]; // 일단 배열에 들어가있는 사람들!
        st= new StringTokenizer(br.readLine(), " ");
        for(int i =0; i<N; i++) {
            arr[i] =Integer.parseInt(st.nextToken());
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        int currentIn = 1;
        //이 숫자부터 들어가기 가능! 이거 아니면 일단 stack에!
        for(int i =0; i<N; i++) {
            if(arr[i] == currentIn) {
                currentIn +=1;
            }else {
                arrayList.add(arr[i]);
            }
        }

        if(arrayList.isEmpty()) {
            System.out.println("Nice");
            System.exit(0);
        }


       boolean success = true;
       for(int i =arrayList.size()-1; i>=0; i--) {
           int result = arrayList.get(i);
           if(currentIn != result) {
               System.out.println("Sad");
               success = false;
               break;
           }
           currentIn +=1;
       }
       if(success) {
           System.out.println("Nice");
       }

    }
}
