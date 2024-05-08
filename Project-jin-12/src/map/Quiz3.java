package map;

import java.util.Collection;
import java.util.HashMap;

public class Quiz3 {

	public static void main(String[] args) {
		
			HashMap<String, Float> map = new HashMap<>();
			map.put("국어", 80.0f);
			map.put("수학", 90.0f);
			map.put("영어", 100.0f);
			
			Collection<String> keys1 = map.keySet();
//			System.out.println(keys1);
			for(String kys1: keys1) {
				System.out.println("[과목명]:" + kys1 + " [점수]:" + map.get(kys1));
			}
			
			Collection<Float> keys2 = map.values();
//			System.out.println(keys2);
			for(Float kys2: keys2) {
				System.out.println("[점수]:" + kys2);
			}
	}

}
