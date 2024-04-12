package inheritance;

public class Quiz3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PenColor pencolor = new PenColor();
		pencolor.i = 2;
		pencolor.j = 100;
		pencolor.color = "파랑색";
		pencolor.inshow();
		pencolor.show();

		
		FountainPen fountain = new FountainPen();
		fountain.i = 3;
		fountain.j = 80;
		fountain.y = "몽블랑";
		fountain.inshow();
		fountain.show();
		
	}

}

class Pen {
	int i;
	int j;
	
	public void inshow() {
		System.out.print("펜의 굵기: " + i);
		System.out.print(" 남은 양: " + j+"%");
		
	}
}

class PenColor extends Pen{
	String color;
	
	public void show() {
		System.out.println(" 볼펜의 색: " + color);
	}
}

class FountainPen extends Pen{
	String y;
	public void show() {
		System.out.print(" 브랜드: "+ y);
	}
}