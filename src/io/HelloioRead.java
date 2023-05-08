package io;

import java.io.FileWriter;
import java.io.Writer;

public class HelloioRead {
    public static void main(String[] args) throws Exception {
        Writer out = new FileWriter("/tmp/hello.txt");
        out.write((int)'a');
        out.write((int)'h');
        out.write((int)'!'); //!를 정수로 형변환!
        out.close();
    }
}
