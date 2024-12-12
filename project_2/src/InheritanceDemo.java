//Inheritance :
//To extends one class from another
//In order to reuse the functionalities
public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone p = new Phone();
		p.call();
		p.msg();
		System.out.println("-----------------");
		
		SmartPhone sp = new SmartPhone();
		sp.call();
		sp.msg();
		sp.browsing();
		
		

	}

}
