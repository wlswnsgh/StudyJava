package Quiz;

public class method {
	
	public static int methodEl(int n1, int n2) {
		
		if(n1 < n2) {
			return -999 ;
		} else {
			return n1 - n2;
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		System.out.println(methodEl(20, 10));
		System.out.println(methodEl(10, 50));
	}

}
