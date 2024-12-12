package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo2 {

	public static void main(String[] args) {
		LinkedHashSet<Integer> h = new LinkedHashSet<>();
		/*
		 HashSet
		 1.maintain insertion order.	
		 2.duplicate	
		  */
		h.add(100);
		h.add(200);
		h.add(500);
		h.add(400);
		h.add(300);
		
		System.out.println(h);
		h.add(100);
		System.out.println(h);

	}

}
