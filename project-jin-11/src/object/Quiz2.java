package object;

public class Quiz2 {

	public static void main(String[] args) {
		
		Student stu1 = new Student(21, "홍길동");
		
//		if(stu1 instanceof Student) {
//			Student dent = (Student)stu1;
//		}
		
		System.out.println("학번: " + stu1.id);
		System.out.println("학생의 이름: " + stu1.name);
	}

}