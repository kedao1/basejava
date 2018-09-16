package cn.dl.jcdz.io;


import sun.rmi.runtime.NewThreadAction;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Console2File {
    public static void main(String[] args) throws FileNotFoundException {
        System.setOut(new PrintStream(new File("5.txt")));
        System.out.println("123");
        System.out.println("456");

    }
}
