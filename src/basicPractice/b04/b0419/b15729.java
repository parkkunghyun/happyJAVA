package basicPractice.b04.b0419;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b15729 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 일단 가장 왼쪽에서 버튼 누르기!
        // 0 0 0 0 0 0 0
        // 0 0 1 1 1 0 0
        // 0 0 1 0 0 1 0
        // 일단 왼쪽을 기준으로 불이 켜져야하면 켜주기!
        // 1로 되어있는데 0으로 만들어야하면 다시 여기부터 버튼 누르기!
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int [] arr = new int[n];
        int result = 0;
        int [] emp = new int[n];

        for(int i =0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            emp[i] = 0;
        }

        for(int i =0; i<n-2; i++) {

            if(arr[i] ==1 && emp[i] ==0) {
                result+=1;
                emp[i] =1;
                if(emp[i+1] ==1 ) {emp[i+1] = 0;}
                else if(emp[i+1] ==0  ) {emp[i+1] = 1;}

                if(emp[i+2] ==1 ) {emp[i+2] = 0; }
                else if(emp[i+2] ==0  ) {emp[i+2] = 1;}
            }
            else if(arr[i] ==0 && emp[i] ==1) {
                result+=1;
                emp[i] =0;
                if(emp[i+1] ==1 ) {emp[i+1] = 0;}
                else if(emp[i+1] ==0  ) {emp[i+1] = 1;}

                if(emp[i+2] ==1 ) {emp[i+2] = 0;}
                else if(emp[i+2] ==0  ) {emp[i+2] = 1;}
            }
        }

        if(arr[n-2] != emp[n-2]) {
            result +=1;
            if(emp[n-2] ==1 && emp[n-1] == 1 ) {
                emp[n-2] = 0;
                emp[n-1] = 0;
            }
            else if(emp[n-2] ==1 && emp[n-1] == 0 ) {
                emp[n-2] = 0;
                emp[n-1] = 1;
            }
            else if(emp[n-2] ==0 && emp[n-1] == 0 ) {
                emp[n-2] = 1;
                emp[n-1] = 1;
            }
            else if(emp[n-2] ==0 && emp[n-1] == 1 ) {
                emp[n-2] = 1;
                emp[n-1] = 0;
            }
        }

        if(arr[n-1] != emp[n-1]) {
            result+=1;
        }
        System.out.println(result);


        br.close();
    }
}
