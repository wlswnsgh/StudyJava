package loop;

public class Quiz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age = 25;
		char gender = 'M';
		
		if(age >= 8 && gender == 'M') {
			System.out.println("남학생입니다.");
		} else if(age >= 8 && gender == 'F') {
			System.out.println("여학생입니다.");
		} else {
			System.out.println("재입력 하세요.");
		}
		
	}

}
