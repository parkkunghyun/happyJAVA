package io;

import java.io.FileReader;
import java.io.Reader;

public class HelloIoRead04 {
    public static void main(String[] args) throws Exception {
        Reader in = new FileReader("/tmp/hello.txt");
        //int ch1 = in.read();
        //System.out.println((char)ch1 );
        int ch = -1;
        while((ch=in.read())!= -1) {
            System.out.println((char)ch);
        }
        in.close();
    }
}
