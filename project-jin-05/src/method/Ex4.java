package method;

public class Ex4 {
	
	public static void printHello(int cnt) {
		for(int i = 1; i <= cnt; i++) {
			System.out.print(i+ " ");
		}
		System.out.println();
	}
	
	public static String Hello() {
		return "안녕하세요^^" ;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Hello());
		printHello(3);
	}

}
