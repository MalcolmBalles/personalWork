package oOP;

public class Worker {
double wage;
int thours;
	public Worker() {
		wage = 7.25;
		thours = 0;
	}
	public Worker(double wAge, int hours) {
		wage = wAge;
		thours = hours;
	}
	public double getWage() {
		return wage;
	}
	public double getThours() {
		return thours;
	}
	public void setWage( double nwage) {
		wage = nwage;
	}
	public void setHours(int hours) {
		thours = hours;
	}
	public void raise(double raise) {
		wage =  wage * raise;
	}
	public double paycheck() {
		double paycheck = thours * wage;
		return paycheck;
	}
}
