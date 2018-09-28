package mathOperators;
import java.util.Scanner;
public class CuttingGrassOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double len = 0;
		double wid = 0;
		double area = 0;
		double rad = 0;
		double cir = 0;
		double cost = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is the length of your lawn? (in feet)");
		len = input.nextDouble();
		System.out.println("What is the width of your lawn? (in feet)");
		wid = input.nextDouble();
		System.out.println("What is the radius of your fountain? (in feet)");
		rad = input.nextDouble();
		
		cir = rad * rad * 3.141592;
		area = ( len * wid ) - (cir);
		cost = area * 1.25 / 100;
		cost = (int)( cost * 100 );
		cost = cost / 100;
		
		
		System.out.println("If we cut your lawn, it will cost $" + cost);


		
	}

}
