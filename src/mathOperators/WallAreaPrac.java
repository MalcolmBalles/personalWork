package mathOperators;
import java.util.Scanner;
public class WallAreaPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("How wide is the wall? (in feet)");
		Scanner input = new Scanner(System.in);
		double area = input.nextDouble() * 8;
		System.out.println("The area of the wall is " + area + " feet squared");
	}

}
