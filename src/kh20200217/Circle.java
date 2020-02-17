package kh20200217;

import java.util.Scanner;

public class Circle extends Point {
	
	private int radius;
	Point pi = new Point();
	Scanner sc = new Scanner(System.in);
	
	public Circle() {
		
	}

	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}

	
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public void draw() {
//		System.out.print("���� �������� �Է��ϼ���. : ");
//		radius = sc.nextInt();
		double won = java.lang.Math.PI * radius * radius; // ���� ����
		double won2 = 2 * java.lang.Math.PI * radius;	// ���� �ѷ�
		System.out.print("���� ���� :");
		System.out.printf("%10.1f\n", won);
		System.out.print("���� �ѷ� :");
		System.out.printf("%10.1f\n", won2);
	}
}
