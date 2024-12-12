
public class Employee {

	//instance props
	int employeeId;
	String employeeName;
	double employeeSalary;
	//static prop
	static String employeeOrganization = "Edubridge";
	
	//constructor
	public Employee(int employeeId,String employeeName,double employeeSalary) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
		
		
	}
	//instance Method
	public void displayDetails() {
		System.out.println("employee Id :"+employeeId);
		System.out.println("employee Name :"+employeeName);
		System.out.println("employee Salary :"+employeeSalary);
	}
	
	public String toString() {
		return employeeId+"\t"+employeeName+"\t"+employeeSalary;
	}
	
 
}
 