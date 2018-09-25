package mathOperators;
import java.util.Scanner;
public class AverageTestScoresOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int one = 0;
		int two = 0;
		int three = 0;
		int some = 0;
		double ave = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Score of test 1?");
		one = input.nextInt();
		System.out.println("Score of test 2?");
		two = input.nextInt();
		System.out.println("Score of test 3?");
		three = input.nextInt();
		
		some = one + two + three;
		ave = some / 3;
		System.out.println("Test one scored " + one + ". Test two scored " + two + ". Test three scored " + three);
		System.out.println("The sum of the score is " + some + ", therefore the average of all 3 test is " + ave);
	}

}
