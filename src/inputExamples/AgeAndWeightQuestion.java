package inputExamples;

import java.util.Scanner;

public class AgeAndWeightQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("What is your age (in years)?");
		Scanner input = new Scanner(System.in);
		int age = input.nextInt();
		System.out.println("What is your wieght (in pounds)?");
		int weight = input.nextInt();
		System.out.println("You are " + age + " years old and you  " + weight + " pounds");
	}
}
