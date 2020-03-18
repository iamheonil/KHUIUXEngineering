package kh202002.kh20200217;

import java.util.Scanner;

public class Rectangle extends Point {

	private int width;
	private int height;
//	Scanner sc = new Scanner(System.in);
	Point p1 = new Point();
	
	public Rectangle() {
		this(0, 0, 0, 0);
	}
	
	public Rectangle(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}
		
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public void draw() {
//		System.out.print("�׸��� �ʺ� �Է��ϼ���. : ");
//		width = sc.nextInt();
//		System.out.print("�׸��� ���̸� �Է��ϼ���. : ");
//		height = sc.nextInt();
		double rec = width * height;
		double rec2 = 2 * (width + height);
		
		System.out.print("�簢���� ��ǥ : ");
		super.draw();
		System.out.print("�׸��� ���� :");
		System.out.printf("%.1f\n", rec);
		System.out.print("�׸��� �ѷ� :");
		System.out.printf("%.1f\n", rec2);
	}
}