package mathOperators;
import java.util.Scanner;
public class AgeQuestionPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("What is your age?");
		Scanner input = new Scanner(System.in);
		int age = input.nextInt() + 7;
		System.out.println("Your age in 7 years will be " + age);
	}

}
