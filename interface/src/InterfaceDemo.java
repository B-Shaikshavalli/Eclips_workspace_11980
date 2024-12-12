
public class InterfaceDemo {
	public static void main(String[] args) {
		//Instantiation is not possible for interface
		//Calc c = new Calc();
		
		MyCalc myCalc = new MyCalc();
		System.out.println(myCalc.sum(10, 20));
		System.out.println(myCalc.sub(30,50));
		System.out.println(myCalc.mul(20,25));
		System.out.println(myCalc.div(20,4));
		System.out.println(myCalc.findSquare(20));
		System.out.println(myCalc.findCube(20));
		
		//Static methods can't be accessed using Implementation
		//System.out.println(myCalc.doubleIt(10));
		
		//Accessing interface static methods using Interface name
		System.out.println(Calc.doubleIt(10));
		
		//Accessing Interface Variables 
		System.out.println(myCalc.PI_VALUE);
		System.out.println(Calc.PI_VALUE);
		
		System.out.println("-------------------");
		//Interface can use as reference type
		Calc c = new MyCalc();
		System.out.println(c.sum(10, 20));
		System.out.println(c.sub(30,50));
		System.out.println(c.mul(20,25));
		System.out.println(c.div(20,4));
		
		System.out.println(myCalc.findSquare(20));
		System.out.println(myCalc.findCube(20));
		
	}

}
