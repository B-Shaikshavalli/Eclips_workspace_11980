package exceptions;

public class unCheckedExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(10/2);
		try {
			System.out.println(10/0);
		}catch (ArithmeticException e) {
			System.out.println("Can't divide by 0");
		}
		
		System.out.println(10/5);
	}

}
