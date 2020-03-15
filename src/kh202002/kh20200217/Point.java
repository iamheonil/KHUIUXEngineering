package kh202002.kh20200217;

public class Point {

	protected int x;
	protected int y;
	
	public Point() {
		this(0, 0);	// �⺻��
					// �Ʒ��� set X, Y�� �ƹ����� ������ 0,0����
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
