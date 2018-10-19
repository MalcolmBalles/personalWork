package decisionStructures;
import java.util.Scanner;
public class InClassSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("How much do you make in a year?");
		Scanner input = new Scanner(System.in);
		double sal = input.nextDouble();
		if (sal <= 20000) {
			System.out.println("You are a Worker");
		}
		else {
			if(sal <= 40000) {
				System.out.println("You are a Manager");

			}
			else {
				if(sal <= 100000) {
					System.out.println("You are a CEO");

				}
				else {
					System.out.println("You are an owner");

					}
				}
			}
		}
	}


