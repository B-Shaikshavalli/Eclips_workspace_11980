package collections;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		PriorityQueue<Integer> q = new PriorityQueue<>();
		System.out.println(q.isEmpty());
		
		q.add(44);
		q.add(48);
		q.add(50);
		q.add(60);
		q.add(80);
		
		System.out.println(q);
		
		System.out.println(q.remove());

	}

}
