
public interface Auto {
	void start();
	void move();
	void stop();
	
	default void light() {
		System.out.println("Lights ON in the Dark time");
	}
	static void Safety() {
		System.out.println("Don't seat more than capacity");
	}


}
