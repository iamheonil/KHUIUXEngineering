package kh20200218;

import kh20200218_person.Person;

public class ProductEx {
	public static void main(String[] args) {
		
//		System.out.println("---상속 전 테스트-----------------");
//		Computer c1 = new Computer("i7", 1000);
//		c1.out();
//		
//		Tv t1 = new Tv("Canvas", 800);
//		t1.out();
//				
//		System.out.println("---상속 후 테스트-----------------");
//		Product p1 = new Computer("i5", 700);
//		p1.out();
//		
//		Product p2 = new Tv("LG", 500);
//		p2.out();
				
//		System.out.println("---Product 배열 테스트------------");
//		Product[] products = new Product[5];
//		
//		int count = 0;
//		
//		products[count++] = new Computer("com1", 100);
//		products[count++] = new Tv("tv1", 200);
//		products[count++] = new Computer("com2", 300);
//		products[count++] = new Tv("tv2", 400);
//		products[count++] = new Computer("com3", 500);
//		
//		for(int i=0; i<count; i++)
//			products[i].out();	// 다형성
//		
//		System.out.println(count + "개 물건 구입");
				
		System.out.println("---Person------------");
		Person p = new Person("헌일", 10000);
		
		Product prod1 = new Tv("SAMSUNG", 3500);
		Product prod2 = new Computer("EVGA", 1000);
		Product prod3 = new Tv("BenQ", 2000);
		Product prod4 = new Tv("HP", 3000);
		
		p.buy(prod1);
		p.buy(prod2);
		p.buy(prod3);		
		p.buy(prod4);	
		
//		p.display();
		
		p.sell(prod1);
//		p.sell(prod2);
//		p.sell( new Computer("SAMSUNG", 3000));
//		p.sell(prod2);
		
		
		// 추상클래스 abstract 는 객체 생성 불가.
//		Product p = new Product("data", 100);

		// 객체변수는 가능,
		Product p1;
		Product p2;
		
		p1 = new Tv("TV!", 150);
		p2 = new Computer("COMPUTER", 250);
		
	}
}









