package Hw4;

import java.time.LocalDate;
import java.util.Scanner;

public class Hw4 {
//	有個一維陣列如下:
//	{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//	請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
	public static void main(String[] args) {
//		int[] num = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };
//
//		int sum = 0;
//		for (int number : num) {
//			sum += number;
//		}
//		double avg = sum / (double) num.length;
//
//		System.out.println("平均值:" + avg);
//
//		System.out.println("大於平均值:");
//		for (int number : num) {
//			if (number > avg) {
//				System.out.print(number + " ");
//			}
//		}

//		請建立一個字串,經過程式執行後,輸入結果是反過來的
//		例如String s = “Hello World”,執行結果即為dlroW olleH
//		String word = "Hello World";
//		StringBuilder sb = new StringBuilder(word);
//		sb.reverse();
//		
//		String upset = sb.toString();
//		System.out.println(upset);

//		有個字串陣列如下 (八大行星):
//		{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//		請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)

//		String[] planets = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };
//		String word = "aeiou";
//		int count = 0;
//
//		for (String planet : planets) {
//			for (char i : planet.toCharArray()) {
//				if (word.indexOf(i) != -1) {
//					count++;
//				}
//
//			}
//
//		}
//		System.out.println("總共" + count);

//		阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有 5 個,其員工編號與身上現金列
//		表如下:
//		請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事
//		有錢可借他;並且統計有錢可借的總人數:例如輸入 1000 就顯示「有錢可借的
//		員工編號: 25 19 27 共 3 人!」

//		int[] employeeid = { 25, 32, 8, 19, 27 };
//		int[] cash = { 2500, 800, 500, 1000, 1200 };
//		Scanner sc = new Scanner(System.in);
//		System.out.println("輸入金額:");
//		int borrow = sc.nextInt();
//
//		StringBuilder x = new StringBuilder();
//		int count = 0;
//
//		for (int i = 0; i < employeeid.length; i++) {
//			if (cash[i] >= borrow) {
//				x.append(employeeid[i]).append(" ");
//				count++;
//			}
//		}
//
//		if (count > 0) {
//			System.out.println("總共有這些人可以借:" + x.toString() + count + "人");
//		} else {
//			System.out.println("沒有人有這麼多錢");
//
//		}
//		sc.close();

//		請設計由鍵盤輸入三個整數,分別代表西元yyyy年,mm月,dd日,執行後會顯示是該年的第幾天
//		例:輸入 1984 9 8 三個號碼後,程式會顯示「輸入的日期為該年第252天」

//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("輸入年份");
//		int year = sc.nextInt();
//		
//		System.out.println("輸入月份");
//		int month = sc.nextInt();
//		
//		System.out.println("輸入日期");
//		int day = sc.nextInt();
//		
//		int[] dayOfMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//		
//		LocalDate date = LocalDate.of(year, month, day);
//		int dayOfYear = date.getDayOfYear();
//		
//		System.out.println("輸入的日期為該年的" + dayOfYear + "天");

//		班上有8位同學,他們進行了6次考試結果如下:
//		請算出每位同學考最高分的次數

//		int[][] score = {
//				{ 10, 37, 100, 77, 98, 90 }, 	// 1
//				{ 35, 75, 70, 95, 70, 80 }, 	// 2
//				{ 40, 77, 79, 70, 89, 100 }, 	// 3
//				{ 100, 89, 90, 89, 90, 75 }, 	// 4
//				{ 90, 64, 75, 60, 75, 50 }, 	// 5
//				{ 85, 75, 70, 75, 90, 20 }, 	// 6
//				{ 75, 70, 79, 85, 89, 99 }, 	// 7
//				{ 70, 95, 90, 89, 90, 75 }, 	// 8
//		};
//		
//		int[] highest = new int [score.length];
//		
//		for (int test = 0; test < score[0].length; test++) {
//			int highestscore = 0;
//			
//			for (int student = 0; student < score.length; student++) {
//				if (score[student][test] > highestscore) {
//					highestscore = score[student][test];
//				}
//			}
//			for (int student = 0; student < score.length; student++) {
//				if (score[student][test] == highestscore) {
//					highest[student]++;
//				}
//		for (int i = 0; i < highest.length; i++) {
//			System.out.println("同學" + (i + 1) + "考最高的分數" + highest[i] + "次");
//		}
//			}
//		}

	}
}
