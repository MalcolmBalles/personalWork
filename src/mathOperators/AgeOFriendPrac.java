package mathOperators;
import java.util.Scanner;
public class AgeOFriendPrac {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("what is the age of your first friend?");
		Scanner input = new Scanner(System.in);
		int age1 = input.nextInt();
		System.out.println("what is the age of your second friend?");
		int age2 = input.nextInt();
		System.out.println("what is the age of your thrid friend?");
		int age3 = input.nextInt();
		int sum = age1 + age2 + age3;
		System.out.println("the total age of your 3 friends is " + sum);
	}
}
