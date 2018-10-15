package oOP;
import java.util.Scanner;
public class RoomAreaOoO {

	public RoomAreaOoO(){
		
	}
	public void area() {
		double len;
		double wid;
		double area;
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is the length of your wall? (feet)");
		len = input.nextDouble();
		System.out.println("What is the width of your wall? (feet)");
		wid = input.nextDouble();
		
		area = len * wid;
		System.out.println("The area of the wall is " + area + " feet squared");

	}
	public void areaWithDoor() {
		double len;
		double wid;
		Scanner input = new Scanner(System.in);
		double doorl;
		double doorw;
		double area;
		
		System.out.println("What is the length of your wall? (feet)");
		len = input.nextDouble();
		System.out.println("What is the width of your wall? (feet)");
		wid = input.nextDouble();
		System.out.println("What is the length of your door? (feet)");
		doorl = input.nextDouble();
		System.out.println("What is the width of your door? (feet)");
		doorw = input.nextDouble();
		
		area = (len * wid) - (doorl * doorw);
		System.out.println("The area of the wall is " + area + " feet squared");
		
	}
	
}
