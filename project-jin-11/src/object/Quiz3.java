package object;

public class Quiz3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog("진돗개", "멍멍이");
		System.out.println(dog.toString());
 
	}

}

class Dog {
	String name;
	String type;
	
	public  Dog(String nm, String tp) {
		this.name = nm;
		this.type = tp;
	}

	@Override
	public String toString() {
		return name +" "+ type ;
	}
	
	
	
}