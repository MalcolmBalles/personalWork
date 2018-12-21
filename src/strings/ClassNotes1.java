package strings;
import java.util.Scanner;
public class ClassNotes1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("ssn please");
		String name = input.nextLine();
		int count = 0;
		System.out.println("First 3");
		for(count = 0; count <= 2; count++) {
			System.out.print(name.charAt(count));
		}
		System.out.println("");
		System.out.println("Mid 2");

		for(count = 3; count <= 4; count++) {
			System.out.print(name.charAt(count));
		}
		System.out.println("");
		System.out.println("last 4");

		for(count = 5; count <= 8; count++) {
			System.out.print(name.charAt(count));
		}
		
	
	}

}
