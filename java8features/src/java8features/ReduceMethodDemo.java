package java8features;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class ReduceMethodDemo {

	public static void main(String[] args) {
		List<Integer> salaries = Arrays.asList(55000,45000,25000,35000,65000);
		System.out.println(salaries);
		
		BinaryOperator<Integer> binOper = (sal1,sal2) -> sal1 + sal2;
		//By using binaryOperator interface
		int total = salaries.stream()
				.reduce(binOper)
				.get();
		
		System.out.println(total);
		//By using directly in  reduce
		int sum = salaries.stream()
				.reduce((sal1,sal2) -> sal1 + sal2)
				.get();
		System.out.println(sum);
		
		int totalSal = salaries.stream()
				.mapToInt((salary) -> salary)
				.sum();
		System.out.println(totalSal);
	}

}
