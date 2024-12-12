package exceptions;

public class ExceptionTest {

	public static void main(String[] args) {
		int[] arr = {10,20,30};
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		try {
		System.out.println(arr[3]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("dont have any value in index 3");
		}
		System.out.println("===================================");
		String s = null;
		try {
			System.out.println(s.charAt(0));
		} catch (ArrayIndexOutOfBoundsException e) {
		
			System.out.println("no elempent present");
		}catch (ArithmeticException e) {
			System.out.println("Can't divided by 0");
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("===================================");
			System.out.println(e); 
			System.out.println("===================================");
			System.out.println(e.getMessage());
		}
		System.out.println("__________________________________________");
		try {
			System.out.println(10/0);
		} catch (ArrayIndexOutOfBoundsException e) {
		
			System.out.println("no elempent present");
		
		}finally {
			System.out.println("Mandatory Code");
		}
		System.out.println("end");

	}

}
