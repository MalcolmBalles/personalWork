package oOP;

public class OOPTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee bob = new Employee();
		System.out.println(bob.getWage());
		bob.changeWage(8);
		System.out.println(bob.getWage());
		System.out.println(bob.getExp());
		bob.setExp(9001);
		System.out.println(bob.getExp());
		bob.giveBonus();
		System.out.println(bob.getWage());

		

	}

}
