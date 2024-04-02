package Quiz;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person pEl = new Person();
		
		pEl.name = "James";
		pEl.age = 40;
		pEl.isMarried = true;
		pEl.descendent = 3;
		
		System.out.println("이름: " + pEl.name);
		System.out.println("나이: " + pEl.age+"세");
		System.out.println("결혼여부: " + pEl.isMarried);
		System.out.println("자식: " + pEl.descendent);
	}

}
