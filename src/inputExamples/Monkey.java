package inputExamples;
import java.util.Scanner;

public class Monkey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("What is the height of an adult money (in inches please, no units)");
		Scanner input = new Scanner(System.in);
		int answer = input.nextInt();
		System.out.println(answer + " inches");
	}

}
