package io;
import java.io.IOException;
import java.io.InputStream;
public class InputStreamExam01 {
    public static void main(String[] args) {
        InputStream in = null;
        try {
            int data = in.read(); // byte인데 정수로!
            // 1바이트는 00000000-11111111 => 2의 8승
            // read메소드가 읽을수있는 정보는 저중에 하나
            // 1byte씩 파일 읽어 들인다 -> file크기 모르면? => 더이상 읽을게 없는거 EOF(end of file)
            // EOF는 0000000 00000000 00000000 1111111 임!! -> -1임
            // 1바이트씩 읽지만 이걸 int에 담자!! -> int는 4바이트니까 그릇 충분함!

            // 왜 바이트 단위로 읽어들이는 read메소드가 int를 리턴하냐? -> EOF를 표현하기 위해서!!
        }catch (IOException e) {
            System.out.println("io오류 + e");
        }finally {
            try {
                in.close();
            } catch (Exception ex2) {
                System.out.println("in 오류2 -> "+ ex2);
            }
        }
    }
}