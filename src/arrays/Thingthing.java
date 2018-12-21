package arrays;
import java.util.ArrayList;
import java.util.Random;
public class Thingthing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random gen = new Random();
		ArrayList<Rectangle> recs = new ArrayList<Rectangle>();
		for(int c=0;c<400;c++) {
			recs.remove(new Rectangle(50+gen.nextInt(21), 50+gen.nextInt(21)));
		}
		for(int c=399;c>=0;c--) {
			System.out.print(c+":  ");
			System.out.println(recs.get(c).getArea());
		}
	}

}
