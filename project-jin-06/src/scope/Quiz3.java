package scope;

public class Quiz3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// person는 메인함수가 끝나기 전까지
		Person person = new Person(); // Person 클래스 안에 person 변수를 지정하고 new 명령어로 Person이라는 클래스를 가져온다 
		
		// i는 메인함수가 끝나기 전까지 사용 가능
		int i = 10; // 정수 자료형에 변수 i를 지정하고 10이라고 선언한다.
		
		if(i > 1) {
			String str = "안녕하세요"; // str은 if문 블록이 끝나기 전까지
			System.out.println();
		}
		
		for(int k=0; k<10; k++) { // k는 for문 블록이 끝나기 전까지
			System.out.println(); // 값을 10번 출력한다.
		}
		// 지역변수의 유효 범위는 변수가 선언된 블록 스코프에 따라 달라진다.
	}

}
