
public class ContinueAndBreack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1 ; i <=20; i++) {
			if(i % 2 == 0) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println("------------------------");
		for(int a = 20 ; a >=1; a--) {
			if(a % 2 == 0) {
				continue;
			}
			System.out.println(a);
		}	

	}
}
