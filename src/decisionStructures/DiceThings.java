package decisionStructures;

public class DiceThings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int roll = 0;
		int times = 0;
		for(int count = 0; count <= 87; count++) {
			roll = 1 + (int)(Math.random() * 13);
			if((roll % 3) == 0) {
				times++;
			}
		}
		System.out.println(times);
	}

}
