package kh20200218_person;

import kh20200218.Computer;
import kh20200218.Product;

// class Person
// ---------------
// - name : String
// - money : int
// - prod : Product
// ---------------
// <<constructor>>
// + Person(String, int)
//   -> name, money
// 
// <<method>>
// + buy(Product) : void
// 전달인자로 받은 Product를
// 멤버필드에 저장하고
// 물건가격만큼 money를 차감한다
// 아래 ex) 내용처럼 출력한다 
// ex)
// Alice님이 500원을 지불하고 i5 구매함
// [잔액] 0원
// 
// <<getter>>
// + getName() : String
// + getMoney() : int
// <<setter>>
// + setName(String) : void
// + setMoney(int) : void
// ---------------

// 전자제품 매장 구현중.
// 상품들이 깔려 있다. new() 해가지고 만들어져 있고
// person 이 구매, 샀으니 자신이 구매해야한다.
// 

public class Person {
	
	private String name;
	private int money;
	private Product prod;
	private Product[] prodArr = new Product[4];
	public int count = 0;
	
	public Person(String name, int money) {
		setName(name);
		setMoney(money);
	}

	public void buy(Product prod) {
		
		this.prod = prod;
		money = getMoney();
		
		System.out.println();
		if(money < prod.getPrice()) {
			System.out.print("잔액이 부족합니다.");
			return;
		} else {
			System.out.println(name + " 님이 " + prod.getPrice() + " 원을 지불하고 " + prod.getModel() +" 구매하셨습니다.");
			System.out.println("잔액은 : " + (money = money - prod.getPrice()) + "원" );
			this.prodArr[count++] = prod;
//			prodArr[count++] = ;
			
//			for (int i = 0; i < prodArr.length; i++) {
//				prod.getModel();
//			}
			
		}
		System.out.println();
	}
	
	public void display() {
		for (int i = 0; i < prodArr.length; i++) {
//			System.out.print(count);
			
			System.out.print(prodArr[i].getModel() + " = ");
			System.out.println(prodArr[i].getPrice());
		}
	}
	
	public void sell(Product prod) {
		this.prod = prod;
		money = getMoney();
		
		System.out.println(prod.getModel());
				
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	
}
