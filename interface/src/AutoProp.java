
public class AutoProp implements Auto{

	@Override
	public void start() {
		System.out.println("Start the Auto by using key");
		
	}

	@Override
	public void move() {
		System.out.println("Move the Auto by using Accelerator");
		
	}

	@Override
	public void stop() {
		System.out.println("Stop the Auto by using Break");
		
	}
	

}
