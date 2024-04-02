package instance;

public class EX2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student student2 = new Student(); // Student 객체 생성
		
		student2.studentID = 1002;
		student2.studenName = "또치";
		student2.grade = 3;
		student2.address = "인천 구월동";
		student2.showStudentInfo();
		
		System.out.println("객체의 주소는 " + student2 + "입니다.");
	}

}
