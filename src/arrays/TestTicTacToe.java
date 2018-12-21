package arrays;
import java.util.Scanner;
public class TestTicTacToe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TicTacToe tic = new TicTacToe();
		Scanner in = new Scanner(System.in);
		int pos = 0;
		
		System.out.println("Welcome to tic tac toe! ");
		System.out.println("");
		tic.creatBoard();
		System.out.println("How to play: when its your turn, type the position you would like to place your letter (1-9)");
		System.out.println("'X' player is up, where do you want to go?");
		pos = in.nextInt();
		int intest = 0;
		while(intest == 0) {
			if(tic.testIn(pos) == 0) {
				intest = 1;
			}
			else {
				System.out.println("Already taking, try again (pic a number availible");
				pos = in.nextInt();
			}
		}
		tic.xLoc(pos);
		tic.placeXO();
		for(int count = 0; count < 3; count++) {
			System.out.println("'O' player is up, where do you want to go?");
			pos = in.nextInt();
			intest = 0;
			while(intest == 0) {
				if(tic.testIn(pos) == 0) {
					intest = 1;
				}
				else {
					System.out.println("Already taking, try again (pic a number availible");
					pos = in.nextInt();
				}
			}
			tic.oLoc(pos);
			tic.placeXO();
			System.out.println("'X' player is up, where do you want to go?");
			pos = in.nextInt();
			intest = 0;
			while(intest == 0) {
				if(tic.testIn(pos) == 0) {
					intest = 1;
				}
				else {
					System.out.println("Already taking, try again (pic a number availible");
					pos = in.nextInt();
				}
			}
			tic.xLoc(pos);
			tic.placeXO();
		}
		
	}

}
