package io;

import java.io.File;
import java.io.IOException;
public class FileDelete {
    public static void main(String[] args) {
        if(args.length != 1) {
            System.out.println("사용법: java io.FileInfo 파일이름");
            System.exit(0); //return; 과 같은 의미!
        }
        File f = new File(args[0]);
        if (f.exists()) {
            boolean deleteFlag = f.delete();
            if(deleteFlag) System.out.println("파일 삭제 성공");
            else System.out.println("실패");
        }else{
            System.out.println("파일 없음");
        }
    }
}
