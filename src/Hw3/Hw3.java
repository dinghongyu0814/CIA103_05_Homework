package Hw3;

import java.util.Random;
import java.util.Scanner;

public class Hw3 {
	public static void main(String args[]) {
//			請設計一隻程式,使用者輸入三個數字後,輸出結果會為正三角形、等腰三角形、其它三角形或不是三角形,如圖示結果:
//			(提示:Scanner,三角形成立條件,判斷式if else)
//			(進階功能:加入直角三角形的判斷)

//			Scanner sc = new Scanner(System.in);

//			System.out.println("請輸入三個整數:");
//			
//			int x = sc.nextInt();
//			int y = sc.nextInt();
//			int z = sc.nextInt();
//			
//			if (x == y && y == z && x != 0 ) {
//				System.out.println("正三角形");
//			} else if   
//				((x != 0 && y != 0 && z != 0) && (x + y > z || y + z > x || x + z > y) && (x == y || y == z || z == x)){
//					System.out.println("等腰三角形");
//			} else if 
//				((x != 0 && y != 0 && z != 0) && (x + y > z && y + z > x && z + x > y))
//				{System.out.println("其他三角形");
//			} else {
//				System.out.println("不是三角形");
//			}

//			請設計一隻程式,會亂數產生一個0~9的數字,然後可以玩猜數字遊戲,猜錯會顯示錯誤訊息,猜對則顯示正確訊息,如圖示結果:
//			(提示:Scanner,亂數方法,無窮迴圈)
//			(進階功能:產生0~100亂數,每次猜就會提示你是大於還是小於正確答案)

//			Random random = new Random();
//			int num = random.nextInt(10);
//			
//			Scanner sc2 = new Scanner(System.in);
//			int guess = -1;
//			
//			while (guess != num) {
//				System.out.println("輸入0~9之間的數字");
//				guess = sc2.nextInt();
//				
//			if (guess < 0 || guess > 9) {
//				System.out.println("是0~9啦");
//			} else if (guess < num ) {
//				System.out.println("太小囉");
//			} else if (guess > num) {
//				System.out.println("太大囉");
//			} else {
//				System.out.println("猜對了");

//			阿文很喜歡簽大樂透(1~49),但他是個善變的人,上次討厭數字是4,但這次他想要依心情決定討厭哪個數字,請您設計一隻程式,讓阿文可以輸入他不想要的數字(1~9),畫面會顯示他可以選擇的號碼與總數,如圖:
//			(提示:Scanner)  (進階挑戰:輸入不要的數字後,直接亂數印出6個號碼且不得重複)
		System.out.println("輸入不想要的數字(1~9)");
		Scanner sc = new Scanner(System.in);
		int dislike = sc.nextInt();

		String num = String.valueOf(dislike);
		System.out.println("可以選擇的號碼:");
		int count = 0;

		for (int i = 1; i <= 49; i++) {
			if (!String.valueOf(i).contains(num)) {
				System.out.print(i + " ");
				count++;
			}

		}
		System.out.println("\n總數:" + count);
		sc.close();

	}
}

////			
//
