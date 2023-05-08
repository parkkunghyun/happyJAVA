package io;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class HelloIo005 {
    public static void main(String[] args) throws Exception {
        PrintWriter out = new PrintWriter(new OutputStreamWriter(new FileOutputStream("/tmp/my.txt")));
        // FileOutputStream은 write(int);를 가짐 -> int의 마지막 바이트만 저장!
        // FileOutputStreamdms "/tmp/my.txt"에 저장
        // OutputStreamWrite 생성자에 들어온 OutputWriteStream의 write()를 이용하여 적는다.
        // PrintWriter는 println(문자열) 문자열을 출력한다
        out.println("hello");
        out.println("world");
        out.println("@@@@");
        out.close();
    }
}
