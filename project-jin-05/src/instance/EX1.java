package instance;

public class EX1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student student = new Student(); // Student 객체 생성
		
		student.studentID = 1001;
		student.studenName = "둘리";
		student.grade = 2;
		student.address = "인천 구월동";
		
		System.out.println("studentID = " + student.studentID);
		System.out.println("studenName = " + student.studenName);
		System.out.println("grade = " + student.grade);
		System.out.println("address = " + student.address);
		System.out.println();
		System.out.println("객체의 주소는" + student + "입니다.");
	}

}
