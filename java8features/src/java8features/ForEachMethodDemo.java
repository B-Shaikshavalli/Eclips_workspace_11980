package java8features;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ForEachMethodDemo {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(20,80,45,74);
		
		
		System.out.println("using for each loop");
		for (int a : list){
			System.out.println(a);
		}
		
		System.out.println("-----------------");
		System.out.println("using forEach() method with lambada expression from java 8");
		Consumer<Integer> consumer = (element) -> System.out.println(element);
		list.forEach(consumer);
		
		System.out.println("using forEach() method with MethodReference from java 8");
		Consumer<Integer> consumer2 = System.out::println;
		list.forEach(consumer2);
		
		System.out.println("-----------------");
		list.forEach((element) -> System.out.println(element));
		System.out.println("-----------------");
		
		System.out.println(list);
		System.out.println("-----------------");
		//filter only even numbers
		for(int a : list) {
			if(a%2 == 0) {
				System.out.println(a);
				
			}
		}
		System.out.println("-----------------");
		list.forEach((element) -> {
			if(element%2 == 0) {
				System.out.println(element);
				
			}
			
		});
		System.out.println("using filter () method using Stream API");
		Predicate<Integer> predicate = (element) -> element % 2 == 0;
		
		list.stream()
		.filter(predicate)
		.forEach(System.out :: println);
		
		System.out.println("-----------------");
		List<Integer> salaries = Arrays.asList(55000,45000,25000,35000,65000);
		for(int sala : salaries) {
			int temp = 0;
			temp =sala + 5000;
			System.out.println(temp);
		}

	}

}
