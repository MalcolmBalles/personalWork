package mathOperators;
import java.util.Scanner;
public class ChangeOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double amount = 0;
		int dollars = 0;
		int quarters = 0;
		int dimes = 0;
		int nickels = 0;
		int pennies = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("What would you like change for?");
		amount = input.nextDouble();
		
		dollars = (int)amount;
		quarters = (int)((amount - dollars) / .25);
		dimes = (int)(((amount - dollars) - (quarters * .25)) / .1);
		nickels = (int)(((amount - dollars) - (quarters * .25) - (dimes * .1)) / .05);
		pennies = (int)(((amount - dollars) - (quarters * .25) - (dimes * .1) - (nickels * .05)) / .009);
		
		System.out.println("You have $" + amount);
		System.out.println("That means you will get " + dollars + " dollars");
		System.out.println("That means you will get " + quarters + " quarters");
		System.out.println("That means you will get " + dimes + " dimes");
		System.out.println("That means you will get " + nickels + " nickels");
		System.out.println("That means you will get " + pennies + " pennies");


		
	}

}
