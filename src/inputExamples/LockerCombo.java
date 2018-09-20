package inputExamples;

import java.util.Scanner;

public class LockerCombo {
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			System.out.println("first number (0# if single digit)?");
			Scanner input = new Scanner(System.in);
			int one = input.nextInt();
			System.out.println("second number (0# if single digit)");
			int two = input.nextInt();
			System.out.println("3rd number (0# if single digit)");
			int three = input.nextInt();
			System.out.println("Combo is " + one + " - " + two + " - " + three);
		}
}
