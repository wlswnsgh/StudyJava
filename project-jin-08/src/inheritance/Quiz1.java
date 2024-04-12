package inheritance;

public class Quiz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal = new Animal();
		
		animal.ani = 4;
		animal.Ex1();
		
	}

}

class Animal {
	int ani;
	
	public void Ex1() {
		System.out.println("다리"+ ani + "개");
	}
}

class Tigger extends Animal{
	int tig;
	
	public void Ex2() {
		System.out.println("꼬리" + tig + "개");
	}
}

class Eagle extends Animal{
	int eag;
	
	public void Ex2() {
		System.out.println("날개" + eag + "개");
	}
}