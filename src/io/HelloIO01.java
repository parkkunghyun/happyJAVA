package io;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class HelloIO01 {
    public static void main(String[] args) throws  Exception{
        //  이 스트림은 반드시 클로즈 해줘야함
        //
        OutputStream out = new FileOutputStream("/tmp/helloio01.dat");
        out.write(1); // 00000000 00000000  00000000 00000001
        out.write(255); //
        out.write(0);
        out.close();
    }
}
