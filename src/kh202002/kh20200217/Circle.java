package kh202002.kh20200217;

import java.util.Scanner;

public class Circle extends Point {
	
	private int radius;	// radius = 반지름
	Point pi = new Point();
//	Scanner sc = new Scanner(System.in);
	
	public Circle() {
		this(0, 0, 0);
	}

	public Circle(int x, int y, int radius) {
		super(x, y);
		
		setRadius(radius);				// ] 두개다 같지만 set~~ 으로 쓰는게 더 좋다.
//		this.radius = radius; 			// ] 
	}

	// Radius 반지름
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public void draw() {
//		System.out.print("원의 반지름을 입력하세요. : ");
//		radius = sc.nextInt();
		System.out.print("원의 중심점 : ");
		super.draw();
		double won = java.lang.Math.PI * radius * radius; // 원의 면적
		double won2 = 2 * java.lang.Math.PI * radius;	// 원의 둘레
		System.out.print("원의 면적 : ");
		System.out.printf("%.1f\n", won);
//		System.out.print("원의 둘레 :");
//		System.out.printf("%.1f\n", won2);
		
		System.out.printf("원의 둘레 : %.1f\n", won2);
		// printf 는 문장과 혼용 가능.
	}
}
