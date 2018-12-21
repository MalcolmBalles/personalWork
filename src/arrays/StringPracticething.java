package arrays;
import java.util.Scanner;
public class StringPracticething {

	public static void main(String[] args) {
		String[] names = new String[3];
		Scanner input = new Scanner(System.in);
		for(int c = 0; c < names.length; c++) {
			System.out.println("What is the name of friend # " + (c + 1));
			names[c] = input.nextLine();
		}
		System.out.println("pick a letter");
		String let = input.next();
		if(let.length() > 1) {
			let = "a";
			System.out.println("u screwed up, now we looking for 'a'");
		}
		for(int c = names.length - 1; c >= 0; c--) {
			if(names[c].charAt(names[c].length()-1) == let.charAt(0)) {
				System.out.println(names[c]);
			}
		}
		input.close();
	}
}
