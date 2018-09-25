package mathOperators;
import java.util.Scanner;
public class SpeedingTicketOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double limit = 0;
		double speed = 0;
		double cost = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is the speed limit? (Miles per hour)");
		limit = input.nextDouble();
		System.out.println("How fast was the driver going? (Miles per hour)");
		speed = input.nextDouble();
		
		cost = ( speed - limit - 1 ) * 40 + 55;
		System.out.println("The driver was going " + speed + " mph in a " + limit + " mph zone, therefore they owe a $" + cost + " fee for speeding");

		
	}

}
