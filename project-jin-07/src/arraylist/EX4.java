package arraylist;

import java.util.ArrayList;

public class EX4 {

	public static void main(String[] args) {
		
		// 둘리 학생 생성
		Student2 student1 = new Student2("둘리");
		
		// 둘리가 수강하는 과목을 추가
		student1.subjectList.add(new Subject("국어", 100));
		student1.subjectList.add(new Subject("수학", 80));
		
		// 학생 정보 출력
		student1.showInfo();
	}

}

// 과목 클래스
class Subject {
	String name; // 과목명
	int score; // 점수
	
	public Subject(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	
	public void showIn() {
		System.out.println(name+"과목이고 "+score+"점 입니다.");
	}
}

// 학생 클래스
class Student2 {
	String studentName; // 학생의 이름
	ArrayList<Subject> subjectList; // 수강 과목 리스트
	
	public Student2(String studentName) {
		super();
		this.studentName = studentName;
		subjectList = new ArrayList<Subject>();
	}
	
	public void showInfo() {
		int total = 0; // 총 점수
		
		for(Subject s : subjectList) {
			total = total + s.score;
		}
		
		System.out.println(studentName + " 학생의 총점은 "+ total + " 입니다.");
	}
}