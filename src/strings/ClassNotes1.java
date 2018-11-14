package strings;
import java.util.Scanner;
public class ClassNotes1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("say a sentence");
		String name = input.nextLine();
		boolean ritu = name.contains("ritu");
		System.out.println(ritu);
		System.out.println(name.indexOf("ur mom gay"));
	}

}
