package arrays;
import java.util.Scanner;
public class AnActivityIDecidedToActuallyDoInClassLmao {

	public static void main(String[] args) {
		String[][] names = new String[4][3];
		Scanner in = new Scanner(System.in);
		for (int c = 0;c<4;c++) {
			for(int co=0;co<3;co++) {
				System.out.println("What is a person's name?");
				names[c][co] = in.nextLine();
			}
		}
		for (int c = 0;c<3;c++) {
			for(int co=0;co<4;co++) {
				System.out.print(names[co][c] + "   ");
			}
			System.out.println();
		}
		in.close();
		
		
	}
}
