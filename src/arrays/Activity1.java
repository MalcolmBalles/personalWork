package arrays;
import java.util.Scanner;
public class Activity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int[] scores = new int[25000];
		int count = 0;
		int sum = 0;
		for(count = 0; count <= 4; count++) {
			System.out.println("Insert test score #" + (count + 1));
			scores[count] = input.nextInt();
		}
		for(count = 0; count <= 4; count++) {
			sum = sum + scores[count];
		}
		System.out.println(sum);
	}

}
