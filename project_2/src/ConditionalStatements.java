
public class ConditionalStatements {
	
	
	public static boolean isEven(int num) {
		boolean status = false;
		if(num % 2 == 0) {
			status = true; 
		}
		return status;
	}
	public static boolean isOdd(int num) {
		if(num % 2 == 1) {
			
		}
		
		return false;
	}
	public static void isEvenOrOdd(int num) {
		if(num % 2 == 0) {
			System.out.println(num+"is even");
		}else {
			System.out.println(num+"is odd");
		}
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(isEven(10));
		System.out.println(isEven(11));
		System.out.println(isEven(20));
		
		System.out.println(isOdd(11));
		
		isEvenOrOdd(10);
		isEvenOrOdd(11);
		
		

	}

}
