class Phones{
	public void voiceCall() {
		System.out.println("Voice calling with Phone");
	}
}
class SmartPhones extends Phones{
	public void videoCall() {
		System.out.println("Video calling with SmartPhone");
	}
}
class Communication{
	public void call(Phones p) {
		p.voiceCall();
	}
	public void call(SmartPhones sm) {
		sm.videoCall();
	}
}
public class CompilTimePloymorphism {
	public static void main(String[] args) {
		Phones p1 = new Phones();
		SmartPhones sp = new SmartPhones();
		Phones p2 = new SmartPhones();
		
		Communication comm = new Communication();
		comm.call(p1);
		comm.call(sp);
		comm.call(p2); 
	}
}

 