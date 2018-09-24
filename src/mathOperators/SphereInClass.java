package mathOperators;
import java.util.Scanner;
public class SphereInClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double rad = 0;
		double vol = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("what is the radius of your sphere (in meters)");
		rad = input.nextDouble();
		
		
		vol = rad * rad * rad * 4 / 3 * 3.141592;
		System.out.println("The volume of your sphere is " + vol);
	}

}
