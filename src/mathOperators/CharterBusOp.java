package mathOperators;
import java.util.Scanner;
public class CharterBusOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int people = 0;
		int buses = 0;
		int extra = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many people are in your group?");
		people = input.nextInt();
		
		buses = people / 35;
		extra = people % 35;
		System.out.println("You have " + people + " people that need to be transported");
		System.out.println("You will need " + buses + " buses and then a van for " + extra + " extra people");
	}

}
