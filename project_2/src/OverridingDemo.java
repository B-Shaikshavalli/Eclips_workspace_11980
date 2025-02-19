
	class Parent{
		public void property() {
			System.out.println("100Acre + 100kgs of gold + 100Crores");
		}
		//using Final key word not overriding
		//ex -- public void final study()
		public void study() {
			System.out.println("Medicine");
		}	
		public void marry() {
			System.out.println("Arrange Marriage");
		}
	}
	class Child extends Parent{
		//Overriding
		@Override
		public void marry() {
			System.out.println("Love Marriage");
		}
		public void study() {
			System.out.println("Acting");
		}
	}


	public class OverridingDemo {
		public static void main(String[] args) {
			Parent p = new Parent();
			p.property();
			p.study();
			p.marry();
			
			System.out.println("--------------");
			Child c = new Child();
			c.property();
			c.study();
			c.marry();
			
			System.out.println("--------------");
			Parent p1 = new Child();
			p1.study();		
	}


}
