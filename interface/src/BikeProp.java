
public class BikeProp implements Bike{

	@Override
	public void start() {
		System.out.println("Start the Bike by using key");
		
	}

	@Override
	public void move() {
		System.out.println("Move the Bike by using Accelerator");
		
	}

	@Override
	public void stop() {
		System.out.println("Stop the Bike by using Break");
		
	}

}
