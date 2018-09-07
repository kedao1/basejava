package cn.dl.jcdz.io;

import java.io.FileOutputStream;

public class OutPutMain {

    public static void main(String[] args) {
        String content = "123,你好！";
        String path = "";
        OutPutMain test = new OutPutMain();
        test.string2File(content,path);
    }

    public void string2File(String content, String path) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("2.txt");
            byte[] array = content.getBytes();
            fos.write(array);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
