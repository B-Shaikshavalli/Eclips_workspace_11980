//Introduce in java 8 For using only one abstract method 
@FunctionalInterface
public interface Printer {
	void printJob();
	//Any no. of default and static methods are allowed
	default void scan() {
		System.out.println("Print default");
		
	}
	static void scanner() {
		System.out.println("print static");
		
	}

	

}
