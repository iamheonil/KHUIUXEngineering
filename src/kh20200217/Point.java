package kh20200217;

public class Point {

	protected int x;
	protected int y;
	
	public Point() {
		
	}
	
	public Point(int x, int y) {
		x = 3;
		y = 4;
	}

	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public void draw() {
		System.out.println("XÀÇ ÁÂÇ¥°ª : " + x);
		System.out.println("YÀÇ ÁÂÇ¥°ª : " + y);
	}
	
}
