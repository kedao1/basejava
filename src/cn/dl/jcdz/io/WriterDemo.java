package cn.dl.jcdz.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterDemo {

	public static void main(String[] args) {
		//输出流
		String content = "123,你好!";
		String path = "";
		WriterDemo demo = new WriterDemo();
		demo.string2File(content, path);

	}
	
	public void string2File(String content,String path){
		try {
			Writer out = new FileWriter(new File("2.txt"));
			out.write(content);
			out.flush();
			out.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	

}
