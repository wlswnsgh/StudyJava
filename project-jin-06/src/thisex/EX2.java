package thisex;

public class EX2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person();
		person.setName("ex");
		
		person.printEX();
		person.printThis();
		System.out.println(person);
		
		
	}

}

class Person{
	String name;
	
	// 이름을 변경하는 메소드
	public void setName(String name) {
		this.name = name;
	}
	
	//this의 값을 출력하는 메소드
	public void printThis() {
		System.out.println(this);
	}
	
	//name값을 출력
	public void printEX() {
		System.out.println(name);
	}
	
}