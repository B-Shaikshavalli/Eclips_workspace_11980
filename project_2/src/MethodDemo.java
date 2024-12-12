
public class MethodDemo {
	
	public static int findsum(int x ,int y) {
		return x + y;
	}
	public static double findMax(double x, double y){
		return (x > y)?x:y;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int total=findsum(10,20);
		System.out.println(total);
		
		double max =findMax(100,200);
		System.out.println(max);
		
		System.out.println(findsum(200,100));

	}

}
