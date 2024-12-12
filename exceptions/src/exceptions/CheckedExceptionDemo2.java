package exceptions;

public class CheckedExceptionDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("java");

	}

}
