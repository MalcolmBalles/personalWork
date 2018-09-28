package mathOperators;
import java.util.Scanner;
public class MathOpsBoxPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("What is the length of the box (feet please)");
		Scanner input = new Scanner(System.in);
		double len = input.nextDouble();
		System.out.println("What is the width of the box (feet please)");
		double wid = input.nextDouble();
		System.out.println("What is the height of the box (feet please)");
		double high = input.nextDouble();
		double vol = high * wid * len;
		System.out.println("Your box has a volume of " + vol + " feet cubed");


	}

}
