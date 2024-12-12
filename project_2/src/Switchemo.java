
public class Switchemo {
	public static void calc(int num, String opertion) {
		switch(opertion) {
		case "square":
			System.out.println("Square of "+num+" is "+(num*num));
			break;
		case "cube":
			System.out.println("Cube "+num+" is "+(num*num*num));
			break;
		default:
			System.out.println("Invalid Operation");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 10;
		String operation ="square";
		calc(num,operation);

	}

}
