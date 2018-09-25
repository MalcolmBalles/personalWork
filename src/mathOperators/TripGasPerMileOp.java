package mathOperators;

import java.util.Scanner;

public class TripGasPerMileOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double dis = 0;
		double total = 0;
		double gpm = 0;
		double cost = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("How long was the trip? (miles)");
		dis = input.nextDouble();
		System.out.println("What is your car's mile per gallon?");
		gpm = input.nextDouble();
		System.out.println("Total amount of money spent on gas? (no '$' symbol)");
		total = input.nextDouble();
		
		cost = total / ( dis / gpm );
		System.out.println("The trip was " + dis + " mile and the total cost of gas was $" + total + ". With a car that got " + gpm + " miles per gallon, the average cost per gallon for the trip was $" + cost + " per gallon");

	}

}
