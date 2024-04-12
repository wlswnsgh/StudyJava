package downcasting;

import java.util.ArrayList;

public class Quiz2 {

	public static void main(String[] args) {
		
		ArrayList<Person> list = new ArrayList<Person>();
		list.add(new Student("둘리"));
		list.add(new Office("또치"));

	}

}

class Person{
	String Name;

	public Person(String name) {
		this.Name = name;
	}
	
	public void show1() {
		System.out.println(Name+"는 밥을 먹는다.");
	}
}

class Student extends Person{

	public Student(String name) {
		super(name);
	}
	
}

class Office extends Person{

	public Office(String name) {
		super(name);
	}
	
}