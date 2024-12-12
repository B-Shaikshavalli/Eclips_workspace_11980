package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		//To store key and value pair
		//Ordered based on based key
		TreeMap<String ,Integer> hm = new TreeMap();
		hm.put("JFS", 400);
		hm.put("PFS", 400);
		hm.put("MEAN", 250);
		hm.put("MERN", 250);
		
		System.out.println(hm);
		
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		System.out.println(hm.entrySet());
		
		
		//hm.put(null, 100); //null key not allowed in TreeMap. 
		//System.out.println(hm);//Error nullpointException.
		hm.put("Angular", null);
		System.out.println(hm);
		
		for(Map.Entry<String, Integer> entry : hm.entrySet()) {
			System.out.println(entry);
		}

	}

}
