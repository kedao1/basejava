package cn.dl.jcdz.file;

import java.io.File;
import java.io.IOException;

public class FileTest {
    public static void main(String[] args) {
        File file = new File("2.txt");
        System.out.println(file.getAbsolutePath());
        System.out.println(file.length());

        File dir = new File("F:\\");
        System.out.println(dir.getTotalSpace()/(1024*1024)/1024);
        System.out.println(dir.getFreeSpace()/(1024*1024)/1024);
    }


}
