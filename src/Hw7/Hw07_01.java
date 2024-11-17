package Hw7;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.Set;

public class Hw07_01 {
//	請寫一隻程式,能夠亂數產生10個1~1000的整數,並寫入一個名為Data.txt的檔案裡 (請使用
//	append功能讓每次執行結果都能被保存起來)
	
	public static void main(String[]args) {
		Set<Integer> set = new HashSet<>();
		
		while (set.size() < 10) {
			set.add((int)(Math.random()* 1000 + 1));
		}
		
		try(FileOutputStream fos = new FileOutputStream("C:\\CIA103 workspace\\HomeWork-05\\src\\Hw7\\Data.txt", true);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
				PrintStream ps = new PrintStream(bos)){
		
			ps.print(set);
			System.out.println("已寫入Data.txt");
		} catch(IOException e) {
			System.out.println("發生錯誤" + e.getMessage());
		}
	}

}
