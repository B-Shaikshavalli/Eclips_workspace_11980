
public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee(1001,"wills",45000.0);
		//Accessing Instance props
		System.out.println(e1.employeeId);
		System.out.println(e1.employeeName);
		System.out.println(e1.employeeSalary);
		
		//Accessing Static prop
		System.out.println(e1.employeeOrganization);
		
		//using Class name is recommended
		System.out.println(Employee.employeeOrganization);
		
		//Accessing Instance methods
		e1.displayDetails();
		Employee e2 = new Employee(1002,"wills Jack",85000.0);
		e2.toString();
		System.out.println("------------");
		System.out.println(e2);//output Employee@1c20c684:it Hexadecimal number also known as Hash code(address)
		//after overriding output : employeeId+"\t"+employeeName+"\t"+employeeSalary : 1002 Wills Jack 85000.0
		System.out.println(e2.hashCode());//give the address of Object
		System.out.println(e2);//output Employee@1c20c684:it Hexadecimal number also known as Hash code(address)
		
		

	}

}
