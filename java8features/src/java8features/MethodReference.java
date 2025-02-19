package java8features;

interface Printer{
	void print();
}

public class MethodReference {
	public static void beginPrintJob() {
		System.out.println("print job begin..");
	}
	public void startPrintJob() {
		System.out.println("print job start..");
	}
	public static void main(String[] args) {
		Printer p1 = () -> MethodReference.beginPrintJob();
		p1.print();
		
		//Method Reference with Instance method
		Printer p2 = MethodReference :: beginPrintJob;
		p2.print();
		
		MethodReference m = new MethodReference();
		
		Printer p3 = () -> m.startPrintJob();
		p1.print();
		
		//Method Reference with static method
		Printer p4 = m :: startPrintJob;
		p2.print();
	}

}
