package instance;

public class Student {
	int studentID; //학번
	
	String studenName; //이름
	
	int grade; //학년
	
	String address; //주소

	//학생의 모든 정보를 보여주는 함수 선언
	public void showStudentInfo() {
		System.out.println("학년:"+ studentID +
				", 이름:" + studenName + 
				", 학년:" + grade + 
				", 주소:" + address);
		
	}
}