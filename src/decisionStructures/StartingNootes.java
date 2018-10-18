package decisionStructures;
import java.util.Scanner;
public class StartingNootes {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is your shoe size?");
		int int1 = 1;//double shoeSize = input.nextDouble();
		System.out.println("What is your hieght?");
		int int2 = 4;//double hieght = input.nextDouble();
		int int3 = 18;
		if(int1 > int2 && int1 > int3) {
			System.out.println(int1);

		}
		if(int2 > int1 && int2 > int3) {
			System.out.println(int2);
		}			

		if(int3 > int2 && int3 > int1) {
			System.out.println(int3);
		}
		else {
			System.out.println("u suk! try again");

		}
		System.out.println("Have a nice day");
	}
}