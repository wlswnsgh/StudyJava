package string;

public class EX3 {

	public static void main(String[] args) {
//		String str = "java";
//		System.out.println("str의 주소: "+ System.identityHashCode(str));
//		
//		str = str + " and";
//		str = str + " android";
//		System.out.println("값 변경 후 str의 주소: " + System.identityHashCode(str));
//		System.out.println(str);
		
//		==========================================================================
		
		String str = "java";
		System.out.println("str의 주소: "+ System.identityHashCode(str));
		
		System.out.println(str);
		
		StringBuffer buffer = new StringBuffer("java");
		System.out.println("buffer의 주소: " + System.identityHashCode(buffer));
		
		buffer.append(" and");
		buffer.append(" android");
		System.out.println("값 변경 후 buffer의 주소: " + System.identityHashCode(buffer));
		
		System.out.println(buffer.toString());
	}

}