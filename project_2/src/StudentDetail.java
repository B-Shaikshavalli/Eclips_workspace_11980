
public class StudentDetail{
	//Instance Variables
	int studentId;
	String studentName;
	float studentGPA;
	
	static String batchCode = "2024-12980"; //static variables are create Memory space for only one's
	

	
	//constructor used to access the instance variables in new class
	//constructor name wants to same as class name
	public StudentDetail(int studentId, String studentName,float studentGPA) { 
		System.out.println("constructor");
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentGPA = studentGPA;
	}
	public void displayStudentDetail() {
		System.out.println("ID : "+studentId);
		System.out.println("Name : "+studentName);
		System.out.println("GPA : "+studentGPA);
		System.out.println("Batch Code : "+batchCode); 
	}

} 
