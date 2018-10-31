package decisionStructures;

public class PerfectNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int num = 0;
		int count = 0;
		int rem = 0;
		for(num = 1; num <= 1000; num++) {
			while(num > sum) {
				count++;
				sum = sum + count;
			}
			rem = num % sum;
			if(rem == 0) {
				System.out.println(num);
			}
		}
	}

}
