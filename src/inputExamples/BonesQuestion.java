package inputExamples;
import java.util.Scanner;

public class BonesQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("How many bones have you broken (your own or others)?");
		Scanner input = new Scanner(System.in);
		int answer = input.nextInt();
		System.out.println("You have broken " + answer + " bones");
	}

}
