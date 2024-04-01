package loop;

public class Quiz6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int student = 85;
		
		if(student >= 90 && student <= 99) {
			System.out.println("수");
		} else if (student >= 80 && student <= 89) {
			System.out.println("우");
		} else if (student >= 70 && student <= 79) {
			System.out.println("미");
		} else {
			System.out.println("양");
		}
	}
}
