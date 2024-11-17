package Hw7;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Hw07_03 {
//	請寫一支程式,利用老師提供的Dog與Cat類別分別產生兩個物件,寫到C:\data\Object.ser裡。注
//	意物件寫入需注意的事項,若C:\內沒有data資料夾,請用程式新增這個資料夾
	public static void main(String[] args) {
		// 1. Dog 與 Cat 類別分別產生兩個物件
		Dog dog1 = new Dog("球球");
		Cat cat1 = new Cat("莫莫");

		File dataDir = new File("C:\\data");
		if (!dataDir.exists()) {
			dataDir.mkdirs(); 
		}

		
		try (FileOutputStream fos = new FileOutputStream("C:\\data\\Object.ser");
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			
			oos.writeObject(dog1);
			oos.writeObject(cat1);
			
			System.out.println("成功寫入到 C:\\data\\Object.ser");
			
			} catch (IOException e) {
				
			System.out.println("發生錯誤" + e.getMessage());
			e.printStackTrace();
		}

		
		try (FileInputStream fis = new FileInputStream("C:\\data\\Object.ser");
				ObjectInputStream ois = new ObjectInputStream(fis)) {

			System.out.println("C:\\data\\Object.ser 檔案內容如下:");
			System.out.println("--------------------");

			while (true) {
				try {
					
					Animal animal = (Animal) ois.readObject();
					animal.speak();
					System.out.println("--------------------");
				} catch (EOFException e) {
					System.out.println("資料讀取完畢！");
					break; 
				}
			}
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}