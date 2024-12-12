package java8features;

interface MyFunctionalInterface{
	void greet();
	
}
interface MyFunctionalInterface2{
	int findsquare(int num);
}
interface MyFunctionalInterface3{
	int findsumOfTwoNum(int x, int y);
}
interface MyFunctionalInterface4{
	boolean isEven(int num);
}
public class LambdaExpressions{
	public static void main(String[] args) {
		 MyFunctionalInterface myfun = () -> System.out.println("hello");
		 myfun.greet();
		 
		 MyFunctionalInterface2 myfun2 = (int num) -> num * num;
		 int square = myfun2.findsquare(10);
		 System.out.println(square);
		 
		 MyFunctionalInterface3 myfun3 = (x , y) -> (x + y);
		 int sum = myfun3.findsumOfTwoNum(10 , 20);
		 System.out.println(sum);
		 
		 MyFunctionalInterface4 myfun4 = (n) -> (n%2 == 0);
		 boolean isE = myfun4.isEven(20);
		 System.out.println(isE);
		 
			 
		 
	}
	
}
