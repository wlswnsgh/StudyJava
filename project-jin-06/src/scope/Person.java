package scope;

// 모든 변수의 유효 범위를 작성하세요!
public class Person {
	// 인스턴스 변수라서 객체 생성 후에 사용가능
	// 전역변수라서 클래스 끝나기 전까지 사용가능
	String personName; // 문자열 자료형에 personName이라는 변수를 생성
	int personAge; // 정수 자료형에 personAge를 생성
	
	//클래스 변수라서 객체없이도 사용 가능
	// 문자형 자료형에 gender이라는 변수를 생성하고 안에 F값을 생성 
	static char gender = 'F';
	
	// 지역변수는 메소드 안에서만 출력 가능
	public void setPersonName(String name) { 
		this.personName = name; // 지역변수인 name에 이름을 지정해주면 전역변수인 personName 전달되어 출력
	}
}
