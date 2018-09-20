package inputExamples;
import java.util.Scanner;

public class VoteQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Did you vote in the last election?");
		Scanner input = new Scanner(System.in);
		boolean answer = input.nextBoolean();
		System.out.println("You voted in the last election. " + answer);
	}

}
