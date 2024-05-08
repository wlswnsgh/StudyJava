package map;

import java.util.HashMap;
import java.util.Set;

public class Quiz4 {

	public static void main(String[] args) {
		
		HashMap<Integer, Student> map = new HashMap<>();
		
		Student std1 = new Student(1001, "둘리", 90, 80, 70);
		Student std2 = new Student(1002, "도우너", 55, 65, 75);
		Student std3 = new Student(1003, "또치", 80, 50, 50);
		
		map.put(std1.Grade, std1);
		map.put(std2.Grade, std2);
		map.put(std3.Grade, std3);
		
//		System.out.println(std1.toString());
//		System.out.println(std2.toString());
//		System.out.println(std3.toString());
		
		Set<Integer> key = map.keySet();
		for(int ky : key) {
			System.out.println("[key]:" + ky + " [Value] "+map.get(ky));
		}
		
		int sum1 = std1.KOREAN + std1.MATH + std1.ENGLISH;
		double avg1 = sum1 / 3.0; // 80.0
		System.out.println(std1.NAME+"의 합계: "+ sum1 + " " + std1.NAME + "의 평균: " + avg1);
		
		int sum2 = std2.KOREAN + std2.MATH + std2.ENGLISH;
		double avg2 = sum2 / 3.0; // 65.0
		System.out.println(std2.NAME+"의 합계: "+ sum2 +  " " + std2.NAME + "의 평균: " + avg2);
		
		int sum3 = std3.KOREAN + std3.MATH + std3.ENGLISH;
		double avg3 = sum3 / 3.0; // 60.0
		System.out.println(std3.NAME+"의 합계: "+ sum3 +  " " + std3.NAME + "의 평균: " + avg3);	

	}

}

class Student {
	int Grade;
	String NAME;
	int KOREAN;
	int MATH;
	int ENGLISH;
	

	public Student(int grade, String nAME, int kOREAN, int mATH, int eNGLISH) {
		super();
		Grade = grade;
		NAME = nAME;
		KOREAN = kOREAN;
		MATH = mATH;
		ENGLISH = eNGLISH;
	}

	@Override
	public String toString() {
		return "Student [Grade=" + Grade + ", NAME=" + NAME + ", KOREAN=" + KOREAN + ", MATH=" + MATH + ", ENGLISH="
				+ ENGLISH + "]";
	}

	
}