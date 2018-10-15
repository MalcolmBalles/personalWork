package oOP;
import java.util.Scanner;
public class Numbers {

	public Numbers() {
		
	}
	public void sayNumber(double num1) {
		System.out.println(num1);

		
	}
	public void sayNumberPlus2(double num1) {
		System.out.println(num1 + 2);
	}
	public void saySum(double num1, double num2) {
		System.out.print(num1 + num2);
	}
	public double returnSquare(double num1) {
		num1 = num1 * num1;
		return num1;
				
	}
	public double returnArea() {
		double len;
		double wid;
		Scanner input = new Scanner(System.in);
		double area;
		
		System.out.println("What is the lenght of your rectangle?");
		len = input.nextDouble();
		System.out.println("WHat is the width of your rectangle?");
		wid = input.nextDouble();
		
		area = len * wid;
		return area;
	}
	public double returnRoundUp(double num1) {
		Math.ceil(num1);
		return num1;
	}
}
