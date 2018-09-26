package mathOperators;
import java.util.Scanner;
public class CuttingMoreGrass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double len = 0;
		double wid = 0;
		double mowing = 0;
		double mow = 0;
		double speed = 0;
		double time = 0;
		double cost = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is the length of your lawn? (in feet)");
		len = input.nextDouble();
		System.out.println("What is the width of your lawn? (in feet)");
		wid = input.nextDouble();
		System.out.println("What is the width of your mower? (in inches)");
		mow = input.nextDouble() / 12;
		System.out.println("What is the speed of your mower? (miles per hour)");
		speed = input.nextDouble() * 5280;
		
		mowing = wid / mow;
		mowing = (int)(mowing + .999);
		time = len * mowing / speed;
		cost = time * 12;
		cost = (int)( cost * 100 );
		cost = cost / 100;
		
		System.out.println("It will take " + time + " hour(s) and will cost $" + cost);
		
		


	}

}
