package test2;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person();
		person.height = 170;
		person.name = "둘리";
		person.showInfo();
		
		System.out.println(person.height);
		System.out.println(person.name);
	}

}


class Person{
	public String name; // 이름
	int height; // 키
	//private를 선언한 함수는 윗 값에 선언할 수 없다.
	private double weight; // 몸무게
	
	public void showInfo() {
		System.out.println("이름:"+ name +
				"키:"+ height + "몸무게:" + weight);
	}
}