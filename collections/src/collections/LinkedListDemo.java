package collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList a1 = new LinkedList();
		a1.add(100);
		a1.add(100);
		a1.add("java");
		a1.add("Python");
		a1.add(100.00);
		a1.add(100.00);
		System.out.println(a1);
		
		//generic version ArrayList -Type safety
		LinkedList<Integer> subjmarks = new LinkedList<>();
		subjmarks.add(44);
		subjmarks.add(48);
		subjmarks.add(50);
		subjmarks.add(60);
		subjmarks.add(80);
		
		System.out.println(subjmarks);
		
		int s1 = subjmarks.get(0);
		System.out.println(s1);
		
		//create an array list with a group of course names
		//java,Python,Angular,ReactJS,JS
		LinkedList<String> courseName = new LinkedList<>();
		courseName.add("java");
		courseName.add("Python");
		courseName.add("Angular");
		courseName.add("ReactJS");
		courseName.add("JS");
		
		
		
		System.out.println(courseName);
		
		String s2 = courseName.get(2);
		System.out.println(s2);
		
		
	}


}
