
public class ReverseOfStr {
	public static void main(String[] args) {
		//Reverse of string by using StringBuffer
		StringBuffer sbf = new StringBuffer("MyJava");
		System.out.println(sbf.reverse());
		
		//Reverse of string by using Iterative
		String str = "Reverse of a String";
		int a = str.length();
		System.out.println("Length of the String : "+a);
		char[] strArray = str.toCharArray(); //Than convert into str to array by using char
		for(int i =strArray.length-1;i >=0;i--) {
			System.out.println(strArray[i]);
			
		}
		
		
	}
}
