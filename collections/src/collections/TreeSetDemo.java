package collections;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		/*
		 HashSet
		 1.maintain order sequence
		 2.duplicate not allowed
		  */
		TreeSet<Integer> t = new TreeSet<>();
		
		t.add(100);
		t.add(200);
		t.add(500);
		t.add(400);
		t.add(300);
		
		System.out.println(t);
		t.add(100);
		System.out.println(t);
		
		TreeSet<String> t1 = new TreeSet<>();
		 
		t1.add("Java");
		t1.add("Python");
		t1.add("JS");
		t1.add("Angular");
		t1.add("React");
		
	    System.out.println(t1);
	    
        TreeSet<Integer> t3 = new TreeSet<>(Comparator.reverseOrder());
		
		t3.add(100);
		t3.add(200);
		t3.add(500);
		t3.add(400);
		t3.add(300);
		
		System.out.println(t3);
		t3.add(100);
		System.out.println(t3);
		
		TreeSet<String> t4 = new TreeSet<>(Comparator.reverseOrder());
		 
		t4.add("Java");
		t4.add("Python");
		t4.add("JS");
		t4.add("Angular");
		t4.add("React");
		
	    System.out.println(t4);
	    for(String course : t4) {
	    	System.out.println(course);
	    }
	    for(int price : t3) {
	    	System.out.println(price);
	    }

	}

}
