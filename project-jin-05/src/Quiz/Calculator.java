package Quiz;

public class Calculator 
{
	public static void CalEl(int num1, char ch ,int num2 ) {
		int result = 0;
		
		switch (ch) {
		case '+':
			result = num1 + num2;
			System.out.println(result);
			break;
		case '-':
			result = num1 - num2;
			System.out.println(result);
			break;
		case '*':
			result = num1 * num2;
			System.out.println(result);
			break;
		case '/':
			result = num1 / num2;
			System.out.println(result);
			break;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalEl(10,'+',5);
		CalEl(10,'-',5);
		CalEl(10,'*',5);
		CalEl(10,'/',5);
	}

}
