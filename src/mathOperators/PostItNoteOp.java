package mathOperators;
import java.util.Scanner;
class PostItNoteOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double len = 0;
		double wid = 0;
		int postl = 0;
		int postw = 0;
		int total = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is the length of the rectangle? (inches)");
		len = input.nextDouble();
		System.out.println("What is the width of the rectangle? (inches)");
		wid = input.nextDouble();
		
		postl = (int)len / 3;
		postw = (int)wid / 3;
		total = postl * postw;
		System.out.println("You will be able to fit " + total + " post it notes on your rectangle");
				
		
	}

}
