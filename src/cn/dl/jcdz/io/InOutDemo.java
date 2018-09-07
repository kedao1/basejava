package cn.dl.jcdz.io;

import java.io.*;

public class InOutDemo {
    public static void main(String[] args) {
        //键盘输入
        BufferedReader br ;
        //文件输出
        BufferedWriter bw ;

        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            bw = new BufferedWriter(new FileWriter(new File("3.txt")));
            String s ;
            while ((s=br.readLine()).length()>0){
                bw.write(s);
                bw.write("\n");
            }
            br.close();
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
