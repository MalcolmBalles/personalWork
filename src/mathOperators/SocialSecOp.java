package mathOperators;
import java.util.*;
public class SocialSecOp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int social = 0;
		int age = 0;
		int last4 = 0;
		int till18 = 0;
		int nine = 0;
		int eight = 0;
		int seven = 0;
		int six = 0;
		int five = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your age?");
		age = input.nextInt();
		System.out.println("What is your SSN?");
		social = input.nextInt();
		
		nine = social / 100000000;
		eight = (social - (nine * 100000000)) / 10000000;
		seven = (social - (nine * 100000000) - (eight * 1000000)) / 1000000;
		six = (social - (nine * 100000000) - (eight * 1000000) - (seven * 100000)) / 100000;
		five = (social - (nine * 100000000) - (eight * 1000000) - (seven * 100000) - (six * 100000)) / 10000;
		last4 = social - (nine * 100000000) - (eight * 1000000) - (seven * 100000) - (six * 100000) - (five * 10000);
		till18 = 18 - age;
		
		System.out.println(nine);
		System.out.println(eight);
		System.out.println(seven);
		System.out.println(six);
		System.out.println(five);

		System.out.println("You are " + age + " years old");
		System.out.println("Your social security is " + social);
		System.out.println("You have to wait " + till18 + " year(s) until you are 18");
		System.out.println("The last 4 numbers in your SSN is " + last4);

		
	}
}
