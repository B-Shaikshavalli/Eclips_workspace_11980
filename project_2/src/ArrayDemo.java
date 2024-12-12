/* Array Definition:
  -------------------
  
 */
public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.declaration of an Array
		int []arr1;
		int []arr2;
		int []arr3;
		
		//2.Array Creation
		arr1 = new int[10];
		//arr2 = new 
		
		//3.Array Initialization
		arr1[0] = 20;
		arr1[1] = 40;
		arr1[2] = 50;
		
		//4.Access Array Element
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		//Array Declaration,creation and Initialization at a time
		int[] arr4 = new int[] {44,55,28,28,37};
		
		int[] arr5 = {20,58,45,67,20};
		
		System.out.println("-------------");
		//Find size of array
		System.out.println(arr1.length);
		System.out.println("-------------");
		//Array Traversal
		double[] salaries = {55000.0,60000.0,81222.0,70000.0};
		System.out.println("By Using for loop");
		
		int size = salaries.length;
		for (int index = 0; index < size ;index++) {
			System.out.println(salaries[index]);
		}
		System.out.println("Using for each loop");
		for(double salary : salaries) {
			System.out.println(salary);
		}
		System.out.println("-------------");
		//1.Store the following employee names :Wills,Smith,Jones,Alex
		//2.Display all employees using for loop and for each loop
		String[] emplNames= {"Wills","Smith","Jones","Alex"};
        System.out.println("By Using for loop");
		
		for (int index = 0; index < emplNames.length ;index++) {
			System.out.println(emplNames[index]);
		}
		System.out.println("Using for each loop");
		
		for(String eployeeName : emplNames) {
			System.out.println(eployeeName);
			
		}
		//Total subject Marks
		//Average subject Marks
		int [] subjectMarks = {55,44,99,77,88,66}; 
		int totalMarks =0;
		for (int sum : subjectMarks) {
			totalMarks +=sum;
			
		} 
		System.out.println(totalMarks);
		System.out.println("average"+totalMarks/subjectMarks.length);
		// min element in an array
		int min = subjectMarks[0];
		for(int marks : subjectMarks) {
		if(min > marks) {
		min = marks;
		}
		}
		System.out.println("Minimum marks : "+min);

		// max element in an array
		int max = subjectMarks[0];
		for(int marks : subjectMarks) {
		if(max < marks) {
		max = marks;
		}
		}
		System.out.println("Maximum marks = "+max);

		// searching an element
		int search = 50;
		for(int i=0; i<subjectMarks.length; i++) {
		if(subjectMarks[i] == search) {
		System.out.println("Element found at "+i);
		System.exit(0);
		}
		}
		System.out.println("Element not found");
		//Arrange Ascending Order
		System.out.println("--------------------");
		
		
		/*for(int index =0;index < subjectMarks.length;index++) {
			for(int i =index + 1;i < subjectMarks.length;i++) {
				int b=0;
				if(index < i) {
					
					b = index;
					index = i;
					i = b;
					
				}
				}
			System.out.println(index); 
			}*/
		//store different type of elements
		//use Object type to represent 
		Object[] objArray = {10,"jones",45000.0,true};
		
		int element1= (int) objArray[0];
		String element2= (String) objArray[1];
		double element3= (double) objArray[2];
		boolean element4= (boolean) objArray[3];
		
		System.out.println(element1);
		System.out.println(element2);
		System.out.println(element3);
		System.out.println(element4);
		
		
		
		
		String s1 = "10";
		String s2 = "20";
		int n1 = Integer.parseInt(s1);
		int n2 = Integer.parseInt(s2);
		System.out.println(s1 + s2);
		System.out.println(n1 + n2);
		
		String s3 = "10.5";
		String s4 = "20";
		double d1 = Double.parseDouble(s1);
		double d2 = Double.parseDouble(s2);
		System.out.println(s1 + s2);
		System.out.println(d1 + d2 );
		
	} 

}
