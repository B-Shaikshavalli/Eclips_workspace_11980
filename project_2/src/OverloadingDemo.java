
class MyCalc{
	public static int findMax(int x,int y) {
		return (x > y) ? x : y;
	}
	public static double findMax(double x,double y) {
		return (x > y) ? x : y;
	}
	public static long findMax(long x,long y) {
		return (x > y) ? x : y;
	}
	//public static int findMin(int x,int y) {
	//	return (x > y) ? x : y;
	//]}
	public static void m1(int...num) {
		int total = 0;
		for(int element : num) {
			total += element;
		}
		System.out.println(total);
	}
}

	


 public class OverloadingDemo {
	 public static void main(String[] args) {
		int maxInt = MyCalc.findMax(10,20);
		System.out.println("IntMax :"+maxInt);
		double maxDouble = MyCalc.findMax(20.0,40.5);
		System.out.println("DoubleMax :"+maxDouble);
		long maxLong = MyCalc.findMax(105078055800L,202548974103697541L);
		System.out.println("LongMax :"+maxLong);
		//int maxInt = MyCalc.findMax(10,20);
		//System.out.println("IntMax :"+maxInt)
		MyCalc.m1();
		MyCalc.m1(10);
		MyCalc.m1(10,20);
		MyCalc.m1(20,50,30);
		MyCalc.m1(50,30,40,90);
		
		MyCalc.m1(new int[] {100,200,500,800,700});
		
	}
	

}
