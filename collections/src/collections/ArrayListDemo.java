package collections;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		System.out.println(a1.size());
		
		a1.add(100);
		a1.add(100);//List as 
		a1.add(200);
		System.out.println(a1.size());
		System.out.println(a1);
		
		a1.add("java");//adding elements
		a1.add("Python");
		System.out.println(a1.size());
		System.out.println(a1);
		
		a1.add(2,"Angular");//adding elements in specific index
		
		//update 
		a1.set(0, 1000);
		
		a1.remove(0);
		
		System.out.println(a1.get(2));//show the element in specific index
		
		System.out.println(a1.get(a1.size()-1));
		
		//remove all elements use clear
		a1.clear();
		System.out.println(a1);
	}

}
