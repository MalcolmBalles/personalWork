package oOP;

public class Rectangle {
double wid;
double len;
	public Rectangle() {
		wid = 0;
		len = 0;
	}
	public Rectangle(double nwid, double nlen) {
		wid = nwid;
		len = nlen;
	}
	public double getLen() {
		return len;
	}
	public double getWid() {
		return wid;
	}
	public double getPer() {
		return (2 * len) + (2 * wid);
	}
	public double getArea() {
		return len * wid;
	}
	public void setLen(double nlen) {
		len = nlen;
	}
	public void setWid(double nwid) {
		wid = nwid;
	}
	
}
