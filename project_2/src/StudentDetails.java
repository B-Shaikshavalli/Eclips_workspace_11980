import java.util.Scanner;
public class StudentDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the SName");
		String Sname = in.next();
		System.out.println("Enter the Rollno");
		int Rollno = in.nextInt();
		
		
		System.out.println("SName :"+Sname);
		System.out.println("Rollno :"+Rollno);
		

	}

}
