package collections;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<Integer> h = new HashSet<>();
		/*
		 HashSet
		 1.Elements Insertion order won't be maintained. and store by HashCode.		
		  */
		h.add(100);
		h.add(200);
		h.add(300);
		h.add(400);
		h.add(500);
		
		System.out.println(h);
		h.add(100);
		System.out.println(h);

	}

}
