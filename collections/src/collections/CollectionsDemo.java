package collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsDemo {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(55,25,82,50);
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println("asscending order :"+list);
		Collections.sort(list,Comparator.reverseOrder());
		System.out.println("Reverse of a asscending order :"+list);
		
		
		int[] arr = {20,85,49,78};
		System.out.println(arr);
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr);
		System.out.println(arr);
		System.out.println(Arrays.toString(arr));
		
		System.out.println(Arrays.binarySearch(arr, 20));
		System.out.println(Arrays.binarySearch(arr, 201));
		

	}

}
