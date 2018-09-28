package mathOperators;
import java.util.Scanner;
public class YearTillVotePrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("How old are you?");
		Scanner input = new Scanner(System.in);
		int vote = 18 - input.nextInt();
		System.out.println("You have to wait " + vote + " year(s) until you can vote");
	}

}
