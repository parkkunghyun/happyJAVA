package io;

import java.io.File;
import java.io.IOException;
public class TempFile {
    // 임시 파일은 파일명이 tmp_이고 끝이 .dat로 끝남
    // program 종료시 사라지게 만들기!
    public static void main(String[] args) {
        try{
            File f = File.createTempFile("tmp_", ".dat");
            System.out.println(f.getAbsolutePath());
            System.out.println("10초간 멈추기");
            try {
                Thread.sleep(10000); // 초만큼 프로그램 멈추게 하기
            }catch (InterruptedException e1) {
                System.out.println(e1);
            }
            f.deleteOnExit(); // 삭제해줌!
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
