package kh202002.kh20200217;

public class Main {
	public static void main(String[] args) {
		Point poi = new Point();
		Circle cir = new Circle();
		Rectangle rec = new Rectangle(); 
		
//		poi.draw();
//		cir.draw();
//		rec.draw();

		Circle[] cirArr = new Circle[3];
		Rectangle[] recArr = new Rectangle[3];
		Point[] poiArr = new Point[5];
		
						// x, y 쓰지 않는 값, Radius 쓰는 값
		cirArr[0] = new Circle(6, 8, 6);
		cirArr[1] = new Circle(60, 6, 5);
		cirArr[2] = new Circle(5, 7, 8);
		
							// x, y 안쓰 , width, height 쓰는 값
		recArr[0] = new Rectangle(5, 2, 15, 5);
		recArr[1] = new Rectangle(6, 2, 20, 5);
		recArr[2] = new Rectangle(7, 2, 3, 3);
		
		poiArr[0] = new Rectangle(8, 2, 13, 5);
		poiArr[1] = new Circle(9, 2, 100);
		poiArr[2] = new Rectangle(6, 2, 10, 5);
		poiArr[3] = new Circle(4, 2, 15);
		poiArr[4] = new Circle(5, 2, 10);

		for(int i = 0; i < 3; i++) {
			System.out.print(i + 1 +"번째 ");
			cirArr[i].draw();
			System.out.println();
		}
		
		System.out.println("======================================================");
		System.out.println();
		for(int i = 0; i < 3; i++) {
			System.out.println(i + 1 + "번째 네모 : ");
			 recArr[i].draw();
			 System.out.println();
		}
			
		System.out.println("======================================================");
		for(int i = 0; i < poiArr.length; i++) {
			System.out.println(i + 1 + "번째 : ");
			 poiArr[i].draw();
			 System.out.println();
		}
	}
}

//+ 추가 내용
//	* 구현내용
//	1. Point 형 객체 배열 선언, 생성 : 5개
//	2. 각 index별로 Circle, Rectangle 객체 생성, 초기화함(임의대로)
//	3. for 문 사용 : draw() 메소드 실행함