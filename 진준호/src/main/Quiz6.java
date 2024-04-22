package main;

public class Quiz6 {

	public static void main(String[] args) {
		
		Pen pen = new Pen();
		Color color = new Color();
		Brand brand = new Brand();
		
		color.i = 2;
		color.j = 100;
		color.color = "파랑색";
		
		color.show1();
		color.show2();
		
		System.out.println();
		
		brand.i = 3;
		brand.j = 80;
		brand.brand = "몽블랑";
		
		brand.show1();
		brand.show2();
		
		
	}

}

class Pen {
	int i;
	int j;
	
	public void show1() {
		System.out.println("펜의 굵기: " + i);
		System.out.println("남은 양: " + j + "%");
	}
}

class Color extends Pen {
	String color;
	
	public void show2() {
		System.out.println("볼펜의 색: " + color);
	}
}

class Brand extends Pen{
	String brand;
	
	public void show2() {
		System.out.println("브랜드: " + brand);
	}
}