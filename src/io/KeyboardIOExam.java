package io;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class KeyboardIOExam {
    public static void main(String[] args) throws Exception {
        // keyboard로부터 한줄씩 입력
        // 키보드: System.im
        // 화면 출력: System.out
        // 키보드 입력받으면 문자니까 char가 필요! - Writer, Reader
        // 근데 한줄씩 끝나는 문자열이면 bite 중에
        // BufferReader 라는 클래스의 readLine이라는 메소드를 가지고 있음
        // BufferReader 는 장식이다
        //BufferReader는 더이상 읽어드것이 없다면 null값!

        // BufferedReader
        // System.in으로 키보드로 적고 -> InputStreamReader에 들어가고 -> BufferedReader로 바이트로 들어감
        // 그리고 한줄씩 꺼냄
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        while((line= br.readLine()) != null) {
            System.out.println("일어들인 값: "+ line);
        }

    }
}
