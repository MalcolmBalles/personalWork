package mathOperators;
import java.util.Scanner;
public class LongDivisionTHing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int div = 0;
		int dav = 0;
		int num = 0;
		int remain = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("What number do you want to divide?");
		div = input.nextInt();
		System.out.println("What number do you want to divide by?");
		dav = input.nextInt();
		
		num = div / dav;
		remain = div % dav;
		System.out.println(num + "r" + remain);


	}

}
