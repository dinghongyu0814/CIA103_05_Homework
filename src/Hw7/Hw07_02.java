package Hw7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Hw07_02 {
//	請從無到有試著完成一個方法名為copyFile,這個方法有兩個參數。呼叫此方法時,第一個參數所
//	代表的檔案會複製到第二個參數代表的檔案
	
	public static void copyfile(String input, String output) {
		
		try(FileInputStream fis = new FileInputStream(input);
			FileOutputStream fos = new FileOutputStream(output)){
			
			
			byte[] word = new byte[1024];
			int info;
			
			while((info = fis.read(word)) != -1) {
				fos.write(word, 0, info);
			}
			System.out.println("複製成功");
		} catch(IOException e) {
			System.out.println("發生錯誤" + e.getMessage());
		}
	}
	
	public static void main(String[]args) {
		String inputfile = "Data.txt";
		String outputfile = "output.txt";
		
		copyfile("C:\\CIA103 workspace\\HomeWork-05\\src\\Hw7\\Data.txt",
				 "C:\\CIA103 workspace\\HomeWork-05\\src\\Hw7\\output.txt");
	}

}
