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
		
						// x, y ���� �ʴ� ��, Radius ���� ��
		cirArr[0] = new Circle(6, 8, 6);
		cirArr[1] = new Circle(60, 6, 5);
		cirArr[2] = new Circle(5, 7, 8);
		
							// x, y �Ⱦ� , width, height ���� ��
		recArr[0] = new Rectangle(5, 2, 15, 5);
		recArr[1] = new Rectangle(6, 2, 20, 5);
		recArr[2] = new Rectangle(7, 2, 3, 3);
		
		poiArr[0] = new Rectangle(8, 2, 13, 5);
		poiArr[1] = new Circle(9, 2, 100);
		poiArr[2] = new Rectangle(6, 2, 10, 5);
		poiArr[3] = new Circle(4, 2, 15);
		poiArr[4] = new Circle(5, 2, 10);

		for(int i = 0; i < 3; i++) {
			System.out.print(i + 1 +"��° ");
			cirArr[i].draw();
			System.out.println();
		}
		
		System.out.println("======================================================");
		System.out.println();
		for(int i = 0; i < 3; i++) {
			System.out.println(i + 1 + "��° �׸� : ");
			 recArr[i].draw();
			 System.out.println();
		}
			
		System.out.println("======================================================");
		for(int i = 0; i < poiArr.length; i++) {
			System.out.println(i + 1 + "��° : ");
			 poiArr[i].draw();
			 System.out.println();
		}
	}
}

//+ �߰� ����
//	* ��������
//	1. Point �� ��ü �迭 ����, ���� : 5��
//	2. �� index���� Circle, Rectangle ��ü ����, �ʱ�ȭ��(���Ǵ��)
//	3. for �� ��� : draw() �޼ҵ� ������