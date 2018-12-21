package arrays;

public class TicTacToe {
private int[] loc = new int[9];
	public TicTacToe() {
		for(int c = 0; c <=8; c++) {
			loc[c] = 0;
		}
	}
	public void creatBoard() {
		for(int c = 1; c <= 9; c++) {
			if((c % 3) != 0) {
				System.out.print(" " + c + " |");
			}
			else {
				System.out.println(" " + c + " ");
				if((c / 3) < 3) {
					System.out.println("------------");
				}
			}
		}
		System.out.println("");
		System.out.println("");
		System.out.println("");

	}
	public void placeXO() {
		for(int c = 0; c <= 8; c++) {
			if(((c+1) % 3) != 0) {
				if(loc[c] == 0) {
					System.out.print(" " + (c+1) + " |");
				}
				if(loc[c] == 1) {
					System.out.print(" " + "x" + " |");
				}
				if(loc[c] == 2) {
					System.out.print(" " + "o" + " |");
				}
			}
			else {
				if(loc[c] == 0) {
					System.out.println(" " + (c+1) + " ");
				}
				if(loc[c] == 1) {
					System.out.println(" " + "x" + " ");
				}
				if(loc[c] == 2) {
					System.out.println(" " + "o" + " ");
				}
				if(((c+1) / 3) < 3) {
					System.out.println("------------");
				}
			}
		}
		System.out.println("");
		System.out.println("");
		System.out.println("");

	}
	public void xLoc(int pos) {
		loc[pos-1] = 1;
	}
	public void oLoc(int pos) {
		loc[pos-1] = 2;
	}
	public int testIn(int in) {
		return loc[in-1];
	}
	
}
