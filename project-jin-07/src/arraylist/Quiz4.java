package arraylist;

import java.util.ArrayList;

public class Quiz4 {

	public static void main(String[] args) {
//		Student[] studentEl = new Student[2];
//		
//		studentEl[0] = new Student(21, "홍길동");
//		studentEl[1] = new Student(22, "예 시");
//		
//		for(int i = 0; i < studentEl.length; i++) {
//			studentEl[i].InShow();
//		}
		
		ArrayList<Student> Q4 = new ArrayList<Student>();
		Q4.add(new Student(22, "예  시"));
		Q4.add(new Student(21, "홍길동"));
		
		for(int i =0; i < Q4.size(); i++) {
			Student str = Q4.get(i);
			str.InShow();
		}
	}
}

class Student {
	int glassOf;
	String Name;
	
	public Student(int glassOf, String name) {
		super();
		this.glassOf = glassOf;
		Name = name;
	}
	
	public void InShow() {
		System.out.println(glassOf + "학번이고 이름은 " + Name+"입니다.");
	}
}