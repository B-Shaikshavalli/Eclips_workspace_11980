import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class FileDemo {

	public static void main(String[] args) throws IOException { 
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter file path");
		String sf = s.next();
		int w =0;
		int l =0;
		int c =0;
		BufferedReader br = new BufferedReader(new FileReader(sf));
		
		String currentLine = br.readLine();
		while(currentLine != null) {
			l++;
			
			String word[] = currentLine.split(" ");
			w = w + word.length;
			
			for(String words : word) {
				c = c + words.length();
				
				currentLine = br.readLine();
				
			}	
		}
		System.out.println("no of lines "+l);
		System.out.println("no of words "+w);
		System.out.println("no of characters "+c);
		
		

	}

}
