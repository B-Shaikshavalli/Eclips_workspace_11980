package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		//insertion order Maintain based on based key hash code
		LinkedHashMap<String ,Integer> hm = new LinkedHashMap();
		hm.put("JFS", 400);
		hm.put("PFS", 400);
		hm.put("MEAN", 250);
		hm.put("MERN", 250);
		
		System.out.println(hm);
		
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		System.out.println(hm.entrySet());
		System.out.println(hm.get(0));
		
		hm.put(null, 100);
		System.out.println(hm);
		hm.put("Angular", null);
		System.out.println(hm);
		
		for(Map.Entry<String, Integer> entry : hm.entrySet()) {
			System.out.println(entry);
		}

	}

}
