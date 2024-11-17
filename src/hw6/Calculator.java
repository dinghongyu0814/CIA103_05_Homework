package hw6;


//請設計三個類別Calculator.java,CalException.java與CalTest.java,在Calculator.java裡有個自訂
//方法為powerXY(int x, int y),功能是會計算x的y次方並回傳結果。 CalTest.java執行後,使用者可
//以輸入x與y的值,請加入例外處理機制,讓程式能解決以下狀況:

public class Calculator {
	public static int powerXY(int x, int y) throws CalException{
		
		if (x == 0 && y == 0) {
			throw new CalException("x、y不能同時為0");
		}
		
		if (y < 0) {
			throw new CalException("結果是負值");
		}
		
		return(int)Math.pow(x, y);
	}
}
