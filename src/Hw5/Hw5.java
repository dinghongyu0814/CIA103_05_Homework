package Hw5;

import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;



public class Hw5 {
//	public static void main(String[]args) {
		
		
//		請設計一個方法為starSquare(int width, int height),當使用者鍵盤輸入寬與高時,即會印出對應的*長方形,如圖:
			
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("輸入高度");
//		int height = sc.nextInt();
//		
//		System.out.println("輸入寬度");
//		int width = sc.nextInt();
//		
//		starSquare(height, width);
//	}
//	
//	public static void starSquare(int height, int width) {
//		for (int i = 0; i < height ; i++) {
//			for (int j = 0; j < width; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//}
		
//		請設計一個方法為randAvg(),從10個 0~100(含100)的整數亂數中取平均值並印出這10個亂數與平均值,如圖:
		
//	public static void main(String[]args) {
//		randAvg();
//	}
//	
//	static void randAvg() {
//		int sum = 0;
//		int[] number = new int[10];
//	
//		for (int i = 0; i <= 9; i++) {
//			number[i] = (int)(Math.random() * 101);
//			sum += number[i];
//			System.out.print(number[i] + "\t");
//		}
//		System.out.println();
//		System.out.println("平均值" + sum / 10);
//		
//		
//	}
	
//	利用Overloading,設計兩個方法int maxElement(int x[][])與double maxElement(double x[][]),可以找出二維陣列的最大值並回傳,如圖:
	
//		public static int maxElement(int[][] x) {
//			int max = x[0][0];
//			for (int i = 0; i <x.length; i++) {
//				for (int j = 0; j < x.length; j++) {
//					if (x[i][j] > max) {
//						max = x[i][j];
//					}
//				}
//			}
//			return max;
//		}
//		
//		public static double maxElement(double[][] x) {
//			double max = x[0][0];
//			for (int i = 0; i < x.length; i++) {
//				for (int j = 0; j < x.length; j++) {
//					if (x[i][j] > max) {
//						max = x[i][j];
//					}
//				}
//			}
//			return max;
//		}
//		
//		public static void main(String[]args) {
//			int[][] intArray = {
//					{15, 31, 58},
//					{23, 39, 19},
//					{94, 28, 50}
//			};
//			
//			double[][] doubleArray = {
//					{30.5, 25.6, 63.7},
//					{53.7, 75.7, 56.1},
//					{60.2, 52.8, 88.2}
//			};
//			
//			int num1 = maxElement(intArray);
//			double num2 = maxElement(doubleArray);
//			System.out.println(num1);
//			System.out.println(num2);
//		}
	
//	身為程式設計師的你,收到一個任務,要幫系統的註冊新增驗證碼的功能,請設計一個方法
//	genAuthCode(),當呼叫此方法時,會回傳一個8位數的驗證碼,此驗證碼內容包含了英文大小寫
//	與數字的亂數組合,如圖:
	
//	public static final String word= "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
//    public static final int num = 8;
//  
//    public static String genAuthCode() {
//    	SecureRandom sr = new SecureRandom();
//    	StringBuilder sb = new StringBuilder(num);
//    
//    	for (int i = 0; i < num; i++) {
//    		int x = sr.nextInt(word.length());
//    		sb.append(word.charAt(x));
//    }
//		return sb.toString();
//	
//}
//    public static void main(String[]args) {
//    	String sb = genAuthCode();
//    	System.out.println(sb);
//    }
}
