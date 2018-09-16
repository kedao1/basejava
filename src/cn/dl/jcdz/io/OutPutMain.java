package cn.dl.jcdz.io;

import java.io.FileOutputStream;

public class OutPutMain {

	public static void main(String[] args) {
		//字符串内容
		String content = "123，你好！";
		//文件路径和名称2.txt
		String path ="D:/2.txt";
		//调用方法
		OutPutMain test = new OutPutMain();
		test.string2File(content,path);

	}

	//封装
	public void string2File(String content,String path){
		//完成字符串写入到文本2.txt
		FileOutputStream fos = null;
		try{
			fos = new FileOutputStream(path);
			byte[] array = content.getBytes();
			fos.write(array);
		}catch (Exception e){
			e.printStackTrace();
		}
	}


}
