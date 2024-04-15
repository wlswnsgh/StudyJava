package finalex;

public class EX3 {

	public static void main(String[] args) {
		
	}

}

class Parent {
	
	final void method1() {
		
	}
	
	void method2() {
		
	}
}

class Child extends Parent{

	@Override
	void method2() {
		super.method2();
	}
	
}


