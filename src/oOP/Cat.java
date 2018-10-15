package oOP;

public class Cat {
int age;
double sleep;
	public Cat() {
		age = 0;
		sleep = 8;
	}
	public void birthday() {
		age++;
	}
	public void sleepMore() {
		sleep++;
	}
	public void sleepLess() {
		sleep--;
	}
	public int getAge() {
		return age;
	}
	public double getSleep() {
		return sleep;
	}
}
