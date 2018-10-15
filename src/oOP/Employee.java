package oOP;

public class Employee {
private double wage;
private double exp;
	public Employee() {
		wage = .01;
		exp = -2;
	}
	public double getWage() {
		return wage;
	}
	public void changeWage(double nWage) {
		wage = nWage;
	}
	public double getExp() {
		return exp;
	}
	public void setExp(double nExp) {
		exp = nExp;
	}
	public void giveBonus() {
		wage = wage * 1.1;
	}
}
