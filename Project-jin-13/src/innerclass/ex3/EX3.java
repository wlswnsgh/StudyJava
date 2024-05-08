package innerclass.ex3;

public class EX3 {

	public static void main(String[] args) {
		
		Outer outer = new Outer();
		Outer.InstanseInner instanseInner = outer.new InstanseInner();
		instanseInner.i1 = 300;
		instanseInner.i2 = 300;
		
		Outer outer2 = new Outer();
		Outer.InstanseInner instanseinner2 = outer2.new InstanseInner();
		instanseinner2.i1 = 400;
		instanseinner2.i2 = 400;
		
		System.out.println("첫번째 인스턴스 내부클래스: " 
		+ instanseInner.i1 + ", " + instanseInner.i2); // instanseInner.i2 정적 클래스 때문에 400으로 나온다.
		
		System.out.println("두번째 인스턴스 내부클래스: " 
				+ instanseinner2.i1 + ", " + instanseinner2.i2);
		
		Outer.StaticInner staticInner = new Outer.StaticInner();
		staticInner.i1 = 300;
		staticInner.i2 = 300;
		
		System.out.println(staticInner.i1 + " " + staticInner.i2);
	}

}

class Outer {
	
	// 인스턴스 내부 클래스
	class InstanseInner {
		int i1 = 100;
		static int i2 = 200;
		// 정적변수는 외부 객체에 종속됨
	}
	
	// 정적 내부 클래스
	static class StaticInner {
		int i1 = 100;
		static int i2 = 200;
	}
	
	
}