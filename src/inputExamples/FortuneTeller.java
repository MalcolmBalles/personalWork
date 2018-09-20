package inputExamples;

import java.util.Scanner;

public class FortuneTeller {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("enter wieght (in pounds)?");
		Scanner input = new Scanner(System.in);
		int wieght = input.nextInt();
		System.out.println("enter age");
		int age = input.nextInt();
		System.out.println("what is your lucky number? (intager please");
		int num = input.nextInt();
		System.out.println("I see...\n" + num + " years from now...\n you will be reside in number " + age + wieght + "\nat the old folks home.");
	}
}
