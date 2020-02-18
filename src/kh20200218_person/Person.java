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
// �������ڷ� ���� Product��
// ����ʵ忡 �����ϰ�
// ���ǰ��ݸ�ŭ money�� �����Ѵ�
// �Ʒ� ex) ����ó�� ����Ѵ� 
// ex)
// Alice���� 500���� �����ϰ� i5 ������
// [�ܾ�] 0��
// 
// <<getter>>
// + getName() : String
// + getMoney() : int
// <<setter>>
// + setName(String) : void
// + setMoney(int) : void
// ---------------

// ������ǰ ���� ������.
// ��ǰ���� ��� �ִ�. new() �ذ����� ������� �ְ�
// person �� ����, ������ �ڽ��� �����ؾ��Ѵ�.
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
			System.out.print("�ܾ��� �����մϴ�.");
			return;
		} else {
			System.out.println(name + " ���� " + prod.getPrice() + " ���� �����ϰ� " + prod.getModel() +" �����ϼ̽��ϴ�.");
			System.out.println("�ܾ��� : " + (money = money - prod.getPrice()) + "��" );
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
