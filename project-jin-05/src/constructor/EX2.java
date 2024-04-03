package constructor;

public class EX2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person1 = new Person();
		person1.name = "둘리";
		person1.height = 80;
		person1.weight = 180;
		
		Person person2 = new Person("또치");
		person2.weight = 50;
		person2.height = 160;
		
		Person person3 = new Person("도우너", 170, 60);
	}

}

class Person {
	
	String name;
	
	int height;
	
	int weight;
	
	public Person() {	
	}

	public Person(String nm) {
		name = nm;
	}

	public Person(String nm, int he, int we) {
		name = nm;
		height = he;
		weight = we;
	}
	
}

