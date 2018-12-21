package arrays;

public class Rectangle {
private int len;
private int wid;

	public Rectangle() {
		len = 1;
		wid = 1;
	}
	public Rectangle(int nl, int wl) {
		len = nl;
		wid = wl;
	}
	public int getArea() {
		return (len * wid);
	}
	public int getPer() {
		return ((2* len) + (2* wid));
	}
	
	
}
