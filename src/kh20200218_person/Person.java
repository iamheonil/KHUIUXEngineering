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
		for(int i = 0; i < 3; i++) {
			System.out.print(prodArr[i].getModel() + ", ");
		}
	}
		
	public void sell(Product prod) {
		this.prod = prod;
		
		System.out.println();
		for (int i = 0; i < prodArr.length; i++) {
		System.out.println("���� ������ ������ : " + prodArr[i].getModel());
		}
		System.out.println("���� �������� : " + money);
		System.out.println();
		System.out.println("�Ǹ��Ͻ÷��� ��ǰ��");
		System.out.println("�𵨸� : " + prod.getModel() + "\n��ǰ���� : " + prod.getPrice());
		System.out.println();
		System.out.println("��ø� ��ٷ��ּ���..");
			
		if (prodArr[0] == null) {
			System.out.println("��ǰ�� �����ϰ� ���� �ʾ� �Ǹ����� ���߽��ϴ�.");
		} else {
			System.out.println();
			System.out.println("��ǰ �ǸŰ� �Ϸ� �Ǿ����ϴ�.");
//			System.out.println(money);
//			money = money + this.prodArr[0].getPrice();
//			prodArr[0] = null;
			
//			
//			for (int i = 0; i < prodArr.length; i++) {
//				
//			}
			System.out.println();
			System.out.println(name + " ���� " + prodArr[0].getPrice() + " ������ " + prodArr[0].getModel() +" ���� �Ǹ��ϼ̽��ϴ�.");
			System.out.println("�����ݾ��� : " + (money = money + prodArr[0].getPrice()) + "�� �Դϴ�." );
			System.out.println();
			for(int i = 0; i < count - 1; i++) {
				prodArr[i] = prodArr[i + 1];
			}
			prodArr[count-1] = null;
			count--;
			System.out.print("���� ������ ������ : ");
			display();
		}
		
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
