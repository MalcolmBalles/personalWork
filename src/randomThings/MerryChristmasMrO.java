package randomThings;

import java.util.Random;

public class MerryChristmasMrO {
	public static void main(String[] args) {
		boolean mrOFestiveQuestionMark = true;
		int count2 = 0;
		while (mrOFestiveQuestionMark == mrOFestiveQuestionMark) {
			count2++;
			if (count2 == 1) {
				System.out.println("MerRy cHriStmAs mR o!1!!");
			}
			if (count2 == 2) {
				System.out.println("mErrY chRisTmaS mr O!!1!");
			} 
			if (count2 == 3) {
				System.out.println("meRry ChrIstMas Mr O1!!1");
				count2 = 0;
			}

			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("          *");
			Random gen = new Random();
			int count = 0;
			int num = -1;
			int space = 10;
			for (int c = 0; c < 12; c++) {
				num = num + 2;
				count++;
				space = space - 1;
				for (int e = 0; e < space; e++) {
					System.out.print(" ");
				}
				System.out.print("/");

				for (int d = 0; d < num; d++) {
					if (gen.nextInt(100) < 20) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}

				}
				if (count == 3) {
					count = 0;
					num = num - 2;
					space++;
				}
				System.out.println("\\");

			}
			System.out.println("/___________________\\");
			System.out.println("        |  |");
			for (int c = 0; c < 5; c++) {
				System.out.println("");
			}
			for (double p = 0; p < 100000000; p++) {
				double r = 0;
				r = p - r;
			}
		}

	}
}
//          |          *
//          |         / \
//          |        /   \
//          |       /     \
//          |       /     \
//          |      /       \
//          |     /         \
//          |     /         \
//          |    /           \
//          |   /             \
//          |   /             \
//          |  /               \
//          | /                 \    
//          |/___________________\  
//                   |  |
//
//
