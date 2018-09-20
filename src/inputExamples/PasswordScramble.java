package inputExamples;

import java.util.Scanner;

public class PasswordScramble {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("first number (uno digit)?");
		Scanner input = new Scanner(System.in);
		String one = input.next();
		System.out.println("second number (uno digit)");
		String two = input.next();
		System.out.println("3rd number (uno digit)");
		String three = input.next();
		System.out.println("Password options are:");
		System.out.println(one + two + three);
		System.out.println(one + three + two);
		System.out.println(two + three + one);
		System.out.println(two + one + three);
		System.out.println(three + one + two);
		System.out.println(three + two + one);
	}
}
