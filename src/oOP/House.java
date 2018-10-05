package oOP;
import java.util.Scanner;
public class House {
	public House() {
		
	}
	public void paintWall() {
		double len;
		double wid;
		double area;
		double time;
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is the length of your wall?(feet)");
		len = input.nextDouble();
		System.out.println("What is the width of your wall?(feet)");
		wid = input.nextDouble();
		
		area = len * wid;
		time = (area / 200) * 60;
		
		System.out.println("It will take " + time + " minutes to paint the wall");
				
		
	}

}
