package Hw5;

public class MyRectangle {
	double width;
	double depth;
	
	void setWidth(double width) {
		this.width = width;
	}
	
	void setDepth(double depth) {
		this.depth = depth;
	}
	
	double getArea() {
		return this.width * this.depth;
	}
	
//	public static void main(String[]args) {
//		MyRectangle mr = new MyRectangle();
//		mr.setDepth(10);
//		mr.setWidth(20);
//		
//		System.out.println(mr.getArea());
//}
	
	public MyRectangle() {
		
	}
	
	public MyRectangle(double width, double depth) {
		this.width = width;
		this.depth = depth;
	}
}
