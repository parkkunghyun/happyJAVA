package io;

import java.io.File;
import java.io.IOException;
public class FileInfo {
    // java io.FileInfo abc 하면 abc가 args임!
    public static void main(String[] args) {
        if(args.length != 1) {
            System.out.println("사용법: java io.FileInfo 파일이름");
            System.exit(0); //return; 과 같은 의미!
        }
        // file의 이름이나 경로를 읽음!
        File f = new File(args[0]);
        if (f.exists()) { // 파일이 존재하는 경우
            System.out.println("length :" + f.length());
            System.out.println("canRead :" + f.canRead());
            System.out.println("canWrite :" + f.canWrite());

            try {
                System.out.println("getCanonicalPath : "+ f.getCanonicalPath());
            }catch (IOException e) {
                System.out.println(e);
            }
            System.out.println("getName : "+ f.getName());
            System.out.println("getParent : " + f.getParent());
        }else{
            System.out.println("파일이 존재하지 않습니다");
        }
    }
}