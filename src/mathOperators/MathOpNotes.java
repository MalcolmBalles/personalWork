package mathOperators;

public class MathOpNotes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age = -999;
		age = 10 + 13;   //waits until finishing the operations so it can place only a single number in memory
		System.out.println(age);
		
		double min = 3.24;
		double sal = 4.12 + min;
		System.out.println(sal);
		System.out.println("pay another 4.20");
		sal = sal + 4.20;
		System.out.println(sal);
		System.out.println("pay another 3.13");
		sal = sal + 3.13 - .000000000000001;
		System.out.println(sal);

		
	}

}
