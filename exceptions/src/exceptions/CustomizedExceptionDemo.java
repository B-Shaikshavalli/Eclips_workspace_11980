package exceptions;

public class CustomizedExceptionDemo {
	static int balance = 5000;
	public static void checkAge(int age) throws InvalidAgeException {
		if(age >= 18) {
			System.out.println("Eligible to Vote");
		}else {
			throw new InvalidAgeException("Not Eligible to vote");		
			}
	}
	public static void withdraw(int amount)  {
		if(amount >= balance) {
			System.out.println("Insufficient Funds");
		}else {
			throw new InSufficientBalanceException("Collect Cash");		
			}
	}
	

	public static void main(String[] args) {
		try {
			checkAge(18);
		} catch (InvalidAgeException e) {
			System.out.println(e.getMessage());
		}
		withdraw(6000);

		

	}

}
