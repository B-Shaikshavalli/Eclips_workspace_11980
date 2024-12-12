import java.util.Scanner;
public class MyAtmApp {
	 static double balance=5000.0;
	 static int originalpin = 1234;
	 
	 public static boolean authentication(int pin) {
		 if(pin == originalpin) {
			 return true;
		 }
		 return false;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pin =0;
		Scanner in = new Scanner(System.in);
	
		int option =0; 
		
		do { 
			System.out.println("ATM APPLication");
			System.out.println("---------------");
			System.out.println("1.balance");
			System.out.println("2.deposit");
			System.out.println("3.withdraw");
			System.out.println("0.Invalid");
			option =in.nextInt();
			
			switch(option) {
			case 1:
				System.out.println("please enter pin ");
				 pin = in.nextInt();
				if(authentication(pin)) {
					System.out.println("Balance "+balance);
					
				}else {
					System.out.println("Invalid pin ");
				}
			
			break;
			case 2:
				System.out.println("please enter pin ");
				 pin = in.nextInt();
				if(authentication(pin)) { 
					System.out.println("please enter deposit amount ");
					double depositAmount=in.nextDouble();
					balance=balance +depositAmount;
					System.out.println("deposit amount");
				}else {
					System.out.println("Invalid pin ");
				}
			break;
			
			case 3:
			System.out.println("Withdraw");
			double withdrawAmount = in.nextDouble();
			balance = balance - withdrawAmount;
			System.out.println("Withdraw is successfull");
			break;
		    case 0:
			System.out.println("Thank you for using ATM");
			System.out.println("Have a nice day!");
			System.exit(0);//Terminate JVM
			break;
	       default:
		   System.out.println("Invalid Option");
		   System.out.println("Please select the valid option");
		   break;
			}
	}while (option != 0);
}


}

			
