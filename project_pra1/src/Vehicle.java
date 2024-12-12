
public interface Vehicle {
		void start();
		void move();
		void stop();
		

		
		default void light() {
			System.out.println("Lights ON in the Dark time");
		}
		static void Safety() {
			System.out.println("Put the Helment");
		}

	

}
