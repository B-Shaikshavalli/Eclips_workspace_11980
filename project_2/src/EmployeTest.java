import java.util.Scanner;
public class EmployeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		
		System.out.println("Please Enter employee Id:");
		int employeeId = in.nextInt();
		System.out.println("Please Enter employee Name:");
		String employeeName = in.next();
		System.out.println("Please Enter employee Salary:");
		double employeeSalary = in.nextDouble();
		
		
		System.out.println("Employee Id :"+employeeId);
		System.out.println("Employee Name :"+employeeName);
		System.out.println("Employee Salary :"+employeeSalary);
		
		
		
				

	}

}
