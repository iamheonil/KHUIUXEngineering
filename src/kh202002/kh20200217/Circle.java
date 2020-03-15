package kh202002.kh20200217;

import java.util.Scanner;

public class Circle extends Point {
	
	private int radius;	// radius = ������
	Point pi = new Point();
//	Scanner sc = new Scanner(System.in);
	
	public Circle() {
		this(0, 0, 0);
	}

	public Circle(int x, int y, int radius) {
		super(x, y);
		
		setRadius(radius);				// ] �ΰ��� ������ set~~ ���� ���°� �� ����.
//		this.radius = radius; 			// ] 
	}

	// Radius ������
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
		System.out.print("���� �߽��� : ");
		super.draw();
		double won = java.lang.Math.PI * radius * radius; // ���� ����
		double won2 = 2 * java.lang.Math.PI * radius;	// ���� �ѷ�
		System.out.print("���� ���� : ");
		System.out.printf("%.1f\n", won);
//		System.out.print("���� �ѷ� :");
//		System.out.printf("%.1f\n", won2);
		
		System.out.printf("���� �ѷ� : %.1f\n", won2);
		// printf �� ����� ȥ�� ����.
	}
}
