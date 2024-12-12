import java.util.Scanner;
public class Pyramid1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no number");
		int row = sc.nextInt();
		System.out.println("===================");
		int rowcount =1;
		for(int i = row;i > 0 ;i--) {
			for(int j = 1;j <= i;j++) {
				System.out.print(" ");
			}
			for(int j = 1;j <= rowcount;j++) {
				System.out.print("* ");
			}
			System.out.println();
			rowcount++;
			
		}
		

	}

}
