package kh202002.kh20200217;

public class Point {

	protected int x;
	protected int y;
	
	public Point() {
		this(0, 0);	// 기본값
					// 아래의 set X, Y가 아무값도 없을때 0,0으로
	}
	
	public Point(int x, int y) {
		setX(x);
		setY(y);
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
		System.out.println("(" + x + ", " + y + ")");
	}
	
}
