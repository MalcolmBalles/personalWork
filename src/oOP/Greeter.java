package oOP;

public class Greeter {
	private int age;
	public Greeter() {
		age = -999;

	}
	public void sayHello() {
		System.out.println("Hurro uWu");
	}
	public int sayAge() {
		return age;
	}
	public void setAge(int newAge) {
		age = newAge;
		
	}
	
}
