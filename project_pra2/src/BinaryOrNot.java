import java.util.Scanner;
public class BinaryOrNot {
	public void binaryOrNot() {
		Scanner s =new Scanner(System.in);
		System.out.println("enter");
		int num = s.nextInt();
		
		boolean isBinary = true;
		while(num != 0) {
			int temp = num % 10; //Gives Last digit of the num
			if(temp >1) {
				isBinary =false;
				break;
			}else {
				num = num/10; //Remove the Last Digit
			}
		}
		if(isBinary) {
			System.out.println("is binary");
		}else {
			System.out.println("not a binary");
		}
		
	}

	public static void main(String[] args) {
		BinaryOrNot b =new BinaryOrNot();
		b.binaryOrNot();

	}

}
