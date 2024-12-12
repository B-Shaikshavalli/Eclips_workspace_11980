package collections;

import java.util.ArrayDeque;

public class ArrayDequeDemo {

	public static void main(String[] args) {
		ArrayDeque<Integer> d= new ArrayDeque<>();
        d.offerFirst(100); 
        d.offerFirst(200);
        d.offerFirst(10);
        System.out.println(d);
        
        d.addLast(20);
        d.addLast(30);
        d.addLast(20);
        d.addLast(50);
        System.out.println(d);

	}

}
