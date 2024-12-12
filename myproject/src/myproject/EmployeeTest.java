package myproject;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(1,"wills",55000,"wills@gmail.com");
		
		Employee e2 = new Employee();
		e2.setEmployeeID(101);
		e2.setEmployeeName("Jones");
		e2.setEmployeeSalary(258740);
		e2.setEmployeeEmail("jones@gmail.com");
		
		System.out.println(e2.getEmployeeID());
		System.out.println(e2.getEmployeeName());
		System.out.println(e2.getEmployeeSalary());
		System.out.println(e2.getEmployeeEmail());
		
		System.out.println(e1);
		
		
		

	}

}
