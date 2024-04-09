package array;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student3[] studenta = new Student3[3];

		// 인스턴스를 생성하고 배열에 저장
		studenta[0] = new Student3("James", 1001);
		studenta[1] = new Student3("Tomas", 1002);
		studenta[2] = new Student3("Edward", 1003);
		
		// 각 요소의 정보 출력하기
		for(int i = 0; i < studenta.length; i++) {
			studenta[i].fo();
		}
	}
}

class Student3 {
	String Name;
	int classOF;
	
	public Student3(String name, int classOF) {
		super();
		Name = name;
		this.classOF = classOF;
	}
	
	public void fo() {
		System.out.println(classOF + "," + Name);
	}
	
}