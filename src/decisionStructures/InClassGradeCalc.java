package decisionStructures;

import java.util.Scanner;

public class InClassGradeCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("What is your test average?");
		Scanner input = new Scanner(System.in);
		double tavg = input.nextDouble();
		System.out.println("What is your homework average?");
		double havg = input.nextDouble();
		System.out.println("What is your teacher nice? (1 is yes 2 is no)");
		int ans = input.nextInt();
		 
		if (ans == 1) {
			if (tavg >= havg) {
				System.out.println("your grade is " + tavg);
			} else {
				System.out.println("your grade is " + havg);

			}
		} else {
			if (ans == 2) {

				if (tavg >= havg) {
					System.out.println("your grade is " + havg);
				} else {
					System.out.println("your grade is " + tavg);

				}
			} else {
				System.out.println("you think you are a funny guy, well no now u failed");
			}
		}

	}

}
