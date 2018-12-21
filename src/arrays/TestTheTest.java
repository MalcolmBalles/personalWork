package arrays;

import java.util.ArrayList;

public class TestTheTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Friend> friends = new ArrayList<Friend>();
		for(int c=0;c<10;c++) {
			friends.add(new Friend("bob"+c, 10));
		}
		for(Friend x: friends) {
			System.out.println(x.getName());
		}
		
		
	}

}
