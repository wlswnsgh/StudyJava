package main;

import java.util.ArrayList;

public class Quiz5 {

	public static void main(String[] args) {
		
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student(1001, "둘리"));
		list.add(new Student(1002, "또치"));
		list.add(new Student(1003, "도우너"));
		
		for(int i = 0; i < list.size(); i++) {
			Student str = list.get(i);
			str.Inshow();
		}
		
	}
}

class Student {
	int num;
	String name;
	
	public Student(int num, String name) {
		this.num = num;
		this.name = name;
	}
	
	public void Inshow() {
		System.out.println("studentID = " + num+"," + " studentName = " + name);
	}
	
}