package strings;
import java.util.Scanner;
public class PasswordThingy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String repass = "1";
		String pass = "2";
		System.out.println("Password?");
		pass = input.nextLine();
		System.out.println("please re-enter your password");
		repass = input.nextLine();
		while(!(repass.compareTo(pass) == 0)) {
			System.out.println("They did not match, try again");
			System.out.println("Password?");
			pass = input.nextLine();
			System.out.println("please re-enter your password");
			repass = input.nextLine();
		}
		System.out.println("thanks you");
	}

}
