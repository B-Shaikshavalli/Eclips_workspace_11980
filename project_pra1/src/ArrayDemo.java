//Array for practice
public class ArrayDemo {
	public static void main(String[] args) {
		//Array declaration 
		int []arr1;
		int []arr2;
		
		//Array Creation
		arr1 = new int [10];
		arr2=new int [20];
		
		//Array Initialization 
		arr1 [0]=10;
		arr1[1]=20;
		arr2[0]=10;
		arr2[1]=30;
		
		for(int i = 0;i <arr1.length;i++) {
			System.out.println(arr1[i]);
		}
		System.out.println("-----------");
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		
		int[] arr3 = new int[]{10,20,30,80,70};
		int[] arr4 = new int[]	{50,82,30,70,50,20};
		
		System.out.println(arr3[0]);//or
		System.out.println("-----------");
		for(int i = 0;i < arr3.length;i++) {
			System.out.println(arr3[i]);
		}
		System.out.println("-----------");
		for(int i = 0;i < arr4.length;i++) {
			System.out.println(arr4[i]);
		}
		System.out.println("-----------");
	
	
	}
	

}
