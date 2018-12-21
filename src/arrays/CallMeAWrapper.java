package arrays;
import java.util.ArrayList;
import java.util.Scanner;
public class CallMeAWrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Double> ages = new ArrayList<Double>();
		Scanner in = new Scanner(System.in);
		System.out.println("How many employees do you have?");
		int studs = in.nextInt();
		for(int c = 0;c < studs;c++) {
			System.out.println("What is the wage of eployee #" + (c + 1));
			ages.add(in.nextDouble());
		}
		double sum = 0;
		for(double x: ages) {
			if(x > sum) {
				sum = x;
			}
		}
		System.out.println(sum);
	}

}
