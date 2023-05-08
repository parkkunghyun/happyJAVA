package io;

import java.io.File;

public class FileList {
    public static void main(String[] args) {
        File file = new File("/tmp");
        printFiles(file);
    }
    private static void printFiles(File file) {
        if (file.isDirectory()){
            File[] files = file.listFiles();
            for ( int i =0; i<files.length; i++) {
                System.out.println(files[i].getName());
            }
        }
        else{
            System.out.println(file.getName());
        }
    }
}
