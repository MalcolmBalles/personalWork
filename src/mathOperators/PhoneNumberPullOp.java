package mathOperators;
import java.util.Scanner;
public class PhoneNumberPullOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double phone = 0;
		int one = 0;
		int two = 0;
		int three = 0;
		int four = 0;
		int five = 0;
		int six = 0;
		int seven = 0;
		int eight = 0;
		int nine = 0;
		int ten = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your phone number? (no dashes just the numbers)");
		phone = input.nextDouble();
		
		//i call this next section why
		ten   = (int)(phone / 1000000000);
		nine  = (int)((phone - ((double)ten * 1000000000)) / 100000000);
		eight = (int)((phone - ((double)ten * 1000000000) - (nine * 100000000)) / 10000000) ;
		seven = (int)((phone - ((double)ten * 1000000000) - (nine * 100000000) - (eight * 10000000)) / 1000000);
		six   = (int)((phone - ((double)ten * 1000000000) - (nine * 100000000) - (eight * 10000000) - (seven * 1000000)) / 100000);
		five  = (int)((phone - ((double)ten * 1000000000) - (nine * 100000000) - (eight * 10000000) - (seven * 1000000) - (six * 100000)) / 10000);
		four  = (int)((phone - ((double)ten * 1000000000) - (nine * 100000000) - (eight * 10000000) - (seven * 1000000) - (six * 100000) - (five * 10000)) / 1000);
		three = (int)((phone - ((double)ten * 1000000000) - (nine * 100000000) - (eight * 10000000) - (seven * 1000000) - (six * 100000) - (five * 10000) - (four * 1000)) / 100);
		two   = (int)((phone - ((double)ten * 1000000000) - (nine * 100000000) - (eight * 10000000) - (seven * 1000000) - (six * 100000) - (five * 10000) - (four * 1000) - (three * 100)) / 10);
		one   = (int)((phone - ((double)ten * 1000000000) - (nine * 100000000) - (eight * 10000000) - (seven * 1000000) - (six * 100000) - (five * 10000) - (four * 1000) - (three * 100) - (two * 10)));

		System.out.println("Your area code is " + ten + nine + eight);
		System.out.println("Your 3 middle numbers are " + seven + six + five);
		System.out.println("Your last 4 numbers are " + four + three + two + one);
	}

}
