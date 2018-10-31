package decisionStructures;
import java.util.Scanner;
public class LoopsStartProgramThing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int stop = 0;
		int count = 0;
		int sum = 0;
		while(stop != 9999) {
			System.out.println("What number do you want to multiply by 2 (9999 to stop)?");
			stop = input.nextInt();
			sum = stop * 2;
			System.out.println(sum);
			
		}
		System.out.println("bye");
		
	}

}
