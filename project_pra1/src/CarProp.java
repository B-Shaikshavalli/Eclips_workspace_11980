
public class CarProp implements Vehicle{

	@Override
	public void start() {
		System.out.println("Start the car by using key");
		
	}

	@Override
	public void move() {
		System.out.println("Move the car by using Accelerator");
		
	}

	@Override
	public void stop() {
		System.out.println("Stop the car by using Break");
		
	}

}
