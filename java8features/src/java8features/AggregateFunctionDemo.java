package java8features;

import java.util.Arrays;

import java.util.List;
import java.util.OptionalInt;

public class AggregateFunctionDemo {

	public static void main(String[] args) {
		List<Integer> salaries = Arrays.asList(55000,45000,25000,35000,65000);
		System.out.println(salaries);
		
		int totalSal = salaries.stream()
				.mapToInt((salary) -> salary)
				.sum();
		System.out.println(totalSal);
		
		System.out.println("-------------------");
		int max = salaries.stream()
				.mapToInt((salary) -> salary)
				.max()
				.getAsInt();
		System.out.println(max);
		
		System.out.println("-------------------");
		int min = salaries.stream()
				.mapToInt((salary) -> salary)
				.min()
				.getAsInt();
		System.out.println(min);
		
		System.out.println("-------------------");
		double avg = salaries.stream()
				.mapToInt((salary) -> salary)
				.average()
				.getAsDouble();
		System.out.println(avg);
	}

}
