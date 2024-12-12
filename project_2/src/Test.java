import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter First Number :");
		int min = in.nextInt();
		System.out.println("second First Number :");
		int max = in.nextInt();
		
		
		int x = 100;
		int y = 200;
		
		int min1 = (x < y )?x : y;
		int max1 = (x > y )?x : y;
		
		System.out.println("min value is"+min);
		System.out.println("min value is"+max);
		
		System.out.println("min value is"+min1);
		System.out.println("min value is"+max1);
	}

}
