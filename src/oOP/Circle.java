package oOP;

public class Circle {
	double radius;
	public Circle() {
		radius = 1;
	}
	public Circle(double rad) {
		radius = rad;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double nrad) {
		radius = nrad;
	}
	public double getArea() {
		return radius * radius * 3.1415 * .5;
	}
	public double getCircum() {
		return 2 * 3.141592 * radius;
	}
	
}
