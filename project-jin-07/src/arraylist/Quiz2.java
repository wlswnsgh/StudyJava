package arraylist;

import java.util.ArrayList;

public class Quiz2 {

	public static void main(String[] args) {
		
		ArrayList<Boolean> boolen = new ArrayList<Boolean>();
		boolen.add(true);
		boolen.add(true);
		boolen.add(false);
		
		for(boolean list : boolen) {
			System.out.print(list + " ");
		}
		
		System.out.println();
		
//		for(int i = 0; i < boolen.size(); i++) {
//			boolean a= boolen.get(i);
//			System.out.print(a + " ");
//		}
//		System.out.println();
		
		boolean b1 = boolen.get(0);
		System.out.print(b1+" ");
		
		boolean b2 = boolen.get(2);
		System.out.print(b2);
	}
}
