package main;

public class Quiz3 {

	public static void main(String[] args) {
		
		Four fo = new Four();
		System.out.println(fo.showIn(5, 4, "-"));
		
		
	}

}

class Four {
	
	public int showIn(int n1, int n2, String result) {
		
		switch (result) {
		case "+" :
			return  n1 + n2;
			
			
		case "-":
			return  n1 - n2;
			
			
		case "*":
			return  n1 * n2;
			
			
		case "/" :
			return  n1 / n2;
		
		}
		
		return 0;
		
	}
	
}
