package map;

import java.util.HashMap;

public class Quiz2 {

	public static void main(String[] args) {
		HashMap<String, Integer> gg = new HashMap<>();
		
		gg.put("국어", 80);
		gg.put("수학", 90);
		gg.put("영어", 100);
		
		System.out.println(gg);
		
		gg.replace("국어", 50);
		gg.replace("수학", 60);
		gg.replace("영어", 70);
		System.out.println(gg);
		
		gg.remove("영어");
		System.out.println(gg);
		
		System.out.println(gg.get("국어"));
		System.out.println(gg.get("수학"));
		System.out.println(gg);
		System.out.println("gg의 크기:" + gg.size());
	}

}
