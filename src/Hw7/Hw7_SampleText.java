package Hw7;

import java.io.*;

public class Hw7_SampleText {
	public static void main(String[] args) throws IOException {

		File fileIn = new File("C:\\CIA103 workspace\\HomeWork-05\\src\\Hw7\\Sample.txt");
		FileReader fr = new FileReader(fileIn);
		BufferedReader br = new BufferedReader(fr);

		String str;
		int word = 0;
		int row = 0;

		while ((str = br.readLine()) != null) {
			row++;
			word = str.length();
		}
		
		fr.close();
		br.close();
		
		System.out.println(fileIn.getName() + "檔案為" + fileIn.length() + "個位元組" + word + "個字元" + row + "列資料");
	}
}
