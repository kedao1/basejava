package cn.dl.jcdz.file;


import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args){
        String path = "F:\\MFPTOOL";
        try {
            listDir(path);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private static void listDir(String path) throws IOException {
        File file = new File(path);
        if(!file.isDirectory()){
            throw new IOException("文件目录不存在！");
        }

        File[] ff = file.listFiles();
        for(File f:ff){
            if(f.isDirectory()){
                listDir(f.getAbsolutePath());
            }else{
                System.out.println(f.getAbsolutePath());
            }
        }
    }
}
