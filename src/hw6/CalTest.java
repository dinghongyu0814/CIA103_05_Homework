package hw6;

import java.util.Scanner;

public class CalTest {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Calculator calculator = new Calculator();

		try {
			System.out.print("輸入x的值:");
			int x = sc.nextInt();
			System.out.print("輸入y的值:");
			int y = sc.nextInt();

			int result = calculator.powerXY(x, y);
			System.out.println(x + "的" + y + "次方是" + result);
		} catch (CalException e) {
			System.out.println("錯誤發生" + e.getMessage());
		} catch (Exception e) {
			System.out.println("錯誤發生" + e.getMessage());
		} finally {
			sc.close();
		}
	}
}
