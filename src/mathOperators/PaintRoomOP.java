package mathOperators;
import java.util.Scanner;
public class PaintRoomOP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double wid = 0;
		double len = 0;
		double area = 0;
		double gallons = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is the room's length? (feet)");
		len = input.nextDouble();
		System.out.println("What is the room's width? (feet)");
		wid = input.nextDouble();
		
		area = ( 16 * wid ) + ( 16 * len );
		gallons = area / 150;
		System.out.println("The length of the room is " + len + " feet the width is " + wid + " feet");
		System.out.println("The total area you will need to paint is " + area + " feet squared, so you will need " + gallons + " gallons of paint");
		
		
	}

}
