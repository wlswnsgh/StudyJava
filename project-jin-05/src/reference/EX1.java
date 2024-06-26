package reference;

public class EX1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subject subject = new Subject();
		
			Subject math = new Subject("수학", 85);
			Subject korean = new Subject("수학", 100);
			Student student = new Student(1001, "수학", math, korean);
	}

}

class Subject {
	String subjectName; //과목
	
	int scorePoint; //점수
	
	// 모든 멤버를 초기화하는 생성자 만들기~
	public Subject() {
		
	}
	
	public Subject(String subjectName, int scorePoint) {
		subjectName = subjectName;
		scorePoint = scorePoint;
	}
	
}

class Student {
	int studentID;
	String studentName;
	Subject math;
	Subject korean;

	public Student(int studentID, String studentName, Subject math, Subject korean) {
		this.studentID = studentID;
		this.studentName = studentName;
		this.math = math;
		this.korean = korean;	
	}
}