package conditional;

public class EX3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 15;
		
		if(age < 8) { // 나이가 8살 미만이면 
			System.out.println("미 취학 아동입니다.");
		} else if(age < 14) { // 나이가 14살 미만이면 
			System.out.println("초등학생입니다.");
		} else if(age < 20) { // 나이가 20살 미만이면 
			System.out.println("중, 고등학생입니다.");
		} else { // 모두 아니라면
			System.out.println("성인 입니다.");
		}
		
	}

}
