import java.util.Scanner;

public class SscProgress {
	public static String studentMarks(int Marks) {    
		
		String Grade = " ";
		int g =0;
		if(Marks >= 91 && Marks <= 100) {
			Grade = "A1";
			 
			if(Grade == "A1")  {
				g = 10;
				System.out.println("   ");
			}
			
			System.out.println("              "+g);
		}else if(Marks >= 81 && Marks <= 90) {
			Grade = "A2";
			
			if(Grade == "A2") {
				g = 9;
			}
			System.out.println("              "+g);
		}else if(Marks >= 71 && Marks <= 80) {
			Grade = "B1";
		
			if(Grade == "B1") {
				g = 8;
			}
			System.out.println("              "+g);
		}else if(Marks >= 61 && Marks <= 70) {
			Grade = "B2";
			
			if(Grade == "B2") {
				g = 7;
			}
			System.out.println("              "+g);
		}else if(Marks >= 51 && Marks <= 60) {
			Grade = "C1";
			
			if(Grade == "C1") {
				g = 6;
			}
			System.out.println("              "+g);
		}else if(Marks >= 41 && Marks <= 50) {
			Grade = "C2";
			if(Grade == "C2") {
				g = 5;
			}
			System.out.println("              "+g);
		}else if(Marks >= 35 && Marks <= 40) {
			Grade = "D";
			
			if(Grade == "D") {
				g = 4;
			}
			System.out.println("              "+g);
		}else if(Marks <= 35) {
			Grade = "E";
			
			if(Grade == "E") {
				g = 0;
			}
			System.out.println("              "+g);
		}
		
		return Grade;
				
		
	}
	
	
 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
		
		System.out.println("Please Enter Roll No : ");
		int hno = in.nextInt();
		if(hno == 12345) { 
			System.out.println("                                               SSC PROGRESS REPORT");
			String SName = "Shaikshavalli";
			String SFName = "Chand Basha";
			String SMName = "Mabi";
			int RollNo = 12345;
			String SSName ="TSR Boys High School";
			String SME="English";
			
			System.out.println("  Student Name  :     "+SName); 
			System.out.println("  Father Name   :     "+SFName);  
			System.out.println("  Mother Name   :     "+SMName);
			System.out.println("  Roll No       :     "+RollNo);
			System.out.println("  Date Of Brith :     21-09-2001");
			System.out.println("  School Name   :     "+SSName);
			System.out.println("  Medium        :     "+SME);
			
			System.out.print("          GRADE POINTS  ");
		    System.out.print("            SUBJECT       ");
		    System.out.println("            GRADE         ");
		     
			String TeluguMarks =studentMarks(90);
			System.out.println("                                    Telugu                    "+TeluguMarks);
			
			
			String HindiMarks =studentMarks(70); 
			System.out.println("                                    Hindi                     "+HindiMarks);
			
			String EnglishMarks =studentMarks(40);
			System.out.println("                                    English                   "+EnglishMarks);

			String MathsMarks =studentMarks(70);
			System.out.println("                                    Maths                     "+MathsMarks);
			
			String ScienceMarks =studentMarks(50);
			System.out.println("                                    Science                   "+ScienceMarks);
			
			String SocialMarks =studentMarks(70);
			System.out.println("                                    Social                    "+SocialMarks);
			
			
			
		}else {
			System.out.println("*******Please Enter valid RollNo*******");
		}
		
		  
 
	}

}
