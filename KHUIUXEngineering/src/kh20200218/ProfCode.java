package kh20200218;

import java.util.Scanner;

public class ProfCode {
	private static final int LEN = 3;
	
	private String name;
	private int money;
	
	private Product[] prod = new Product[LEN];
	
	private int cnt; //������ ���� ����
	
	
	public ProfCode(String name, int money) {
		this.name = name;
		this.money = money;
	}

	
	public void buy(Product prod) {
		if( money < prod.getPrice() ) {
			System.out.println("[ERROR] �ܾ��� �����մϴ�");
			return;
		}

		if( cnt == LEN ) {
			System.out.println("[ERROR] �� �̻� ������ ������ �� �����ϴ�");
			return;
		}
		
		
		
		//�������ڷ� ���� Product�� ����ʵ忡 �����ϰ�
		this.prod[cnt++] = prod;
		//���ǰ��ݸ�ŭ money�� �����Ѵ�
		money -= prod.getPrice();
		
		//�����Ȳ�� ����Ѵ�
		System.out.println(
			name + "���� " + prod.getPrice() + "���� "
			+ "�����ϰ� " + prod.getModel() + " ������");
		System.out.println("[�ܾ�] " + money);
		
//		ex)
//		Alice���� 500���� �����ϰ� i5 ������
//		[�ܾ�] 0��
	}

	public void sell() {
//		sell_v1(); //������ ���� �Ǹ�
//		sell_v2(); //ó�� ���� �Ǹ�
		sell_v3(); //������ ���� �Ǹ�
	}
	

	
	//���������� ������ ������ �Ǹ�
	public void sell_v1() {
		if( cnt==0 ) {
			System.out.println("[ERROR] �Ǹ��� ������ �����ϴ�");
			return;
		}

		//�Ǹ��� ���ǰ� �ޱ�
		money += this.prod[cnt-1].getPrice();

		//�����Ȳ ���
		System.out.println(
				name + "���� " + prod[cnt-1].getPrice() + "���� "
				+ "�ް� " + prod[cnt-1].getModel() + " �Ǹ���");
		System.out.println("[�ܾ�] " + money);
		
		//���� �Ǹ� (��ü ����)
		this.prod[--cnt] = null;
	}

	
	
	//ó������ ������ ������ �Ǹ�
	public void sell_v2() {
		if( cnt==0 ) {
			System.out.println("[ERROR] �Ǹ��� ������ �����ϴ�");
			return;
		}
		
		//�Ǹ��� ���ǰ� �ޱ�
		money += this.prod[0].getPrice();

		//�����Ȳ ���
		System.out.println(
				name + "���� " + prod[0].getPrice() + "���� "
				+ "�ް� " + prod[0].getModel() + " �Ǹ���");
		System.out.println("[�ܾ�] " + money);
		
		//���� �Ǹ� (��ü ����)
		for(int i=0; i<cnt-1; i++) {
			prod[i] = prod[i+1];
		}
		prod[cnt-1] = null;
		
		cnt--; //���� ���� 1 ����
	}

	
	
	//������ ������ �Ǹ�
	public void sell_v3() {
		if( cnt==0 ) {
			System.out.println("[ERROR] �Ǹ��� ������ �����ϴ�");
			return;
		}
		
		Scanner in = new Scanner(System.in);

		System.out.println("���� ������ ���� �� : " + cnt);
		for(int i=0; i<cnt; i++) {
			System.out.println((i+1) + ". " + prod[i].getModel());
		}
		System.out.print("���° ������ ������ �Ǹ��Ͻðڽ��ϱ�? ");
		int idx = in.nextInt();
		
		if( idx > cnt || idx <= 0 ) {
			System.out.println("[ERROR] �����Ͻ� �̷��� �����ϴ�");
			return;
		}
		
		
		
		//�Ǹ��� ���ǰ� �ޱ�
		money += this.prod[idx-1].getPrice();

		//�����Ȳ ���
		System.out.println(
				name + "���� " + prod[idx-1].getPrice() + "���� "
				+ "�ް� " + prod[idx-1].getModel() + " �Ǹ���");
		System.out.println("[�ܾ�] " + money);
		
		//���� �Ǹ� (��ü ����)
		for(int i=idx-1; i<cnt-1; i++) {
			prod[i] = prod[i+1];
		}
		prod[cnt-1] = null;
		
		cnt--; //���� ���� 1 ����
	}

	public void out() {
		System.out.println("[TEST] CNT : " + cnt);
		System.out.print("[TEST] ");
		for( Product p : prod ) {
			if(p == null)	System.out.print(p + " ");
			else	System.out.print(p.getModel() + " ");
		}
		System.out.println();
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
















