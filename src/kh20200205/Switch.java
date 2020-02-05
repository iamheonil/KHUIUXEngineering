package kh20200205;

import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {

		// Switch��, Switch - Case ��
		// �� Ʋ�� ���ù�.

//		switch( �񱳴�� ) {
//		case ��1 : 
//		case ��2 : 
//		case ��3 : 
//		case ��4 :
//			
//		default :
		// case �� ���� ������ ����.
		// �񱳴���� ������ �̿��Ѵ�.
//		}

//		int num = 10;
//		switch(num) {
//		
//		// num �� ���� 10 �̶��, 20 �̶��, 30 �̶�� �ش� Case �� ���� �� �� �Ʒ��� Case, default �� ��� �����Ѵ�.
//		// Case ���� Break; �� �ɾ� �ش� Case�� ����ǰ� �Ѵ�. ���� default �� ���� �����ϴ�.
//		case 10 :
//			System.out.println("10");
//			break;
//			
//		case 20 :
//			System.out.println("20");
//			break;
//			
//		case 30 :
//			System.out.println("30");
//			break;
//			
//		case 40 :
//			System.out.println("40");
//			break;
//			
//		default :
//			System.out.println("����Ʈ ��");			
//		}

//		int num = 20;
//		// ����ġ�� ��� ����(��Ģ�������)�� �����ϴ�. �񱳴���� ���������� ���� �ϱ⶧����.
//		// ��Ģ������ ���������� �ǹ������� ���� ���� �ʴ´�.
//		// boolean ���·� �񱳴���� �����ϸ� �ȵȴ�.
//		
//		switch (num - 5) {
//
//		case 10:
//			System.out.println("1�� ����");
//			break;
//
//		case 15:
//			System.out.println("2�� ����");
//			break;
//
//		case 20:
//			System.out.println("3�� ����");
//			break;
//			
//		}

		// double, boolean �� ��� �Ұ����ϴ�.
		// int, char �� ��� �����ϴ�. String �� �����ϳ� ������� �ʴ°��� ����.

//		char c = 'C';
//		switch (c) {
//		case 'A':
//			System.out.println("A�Դϴ�.");
//			break;
//		case 'B':
//			System.out.println("B�Դϴ�.");
//		default:
//			System.out.println("A, B �� �� �ƴմϴ�.");
//			break;
//		}

//		int num = 30;
//		
//		if (num == 10) {
//			System.out.println("num �� 10�Դϴ�.");
//		} else if (num == 20) {
//			System.out.println("num �� 20�Դϴ�.");
//		} else if (num == 30) {
//			System.out.println("num �� 30�Դϴ�.");
//		} else {
//			System.out.println("Default");
//		}

		// Switch, else-if �� �� �� ���� ���� ��Ȳ���� switch, else if �� �� �Ȱ��� ����������
		// �������� ����Ͽ� �ڵ��� �� �־�� �Ѵ�.

		// ����ġ�� �Ѱ����� �����ϴµ�.
		// if ���� �Ʒ��� ���� ���� ����� ����������
//		int score = 88;
//		
//		if(score >= 90) {
//			System.out.println("A");
//		} else if (score >= 80) {
//			System.out.println("B");
//		} else {
//			System.out.println("C");
//		}

//		// ����ġ�� �Ʒ��� ���� ���� ����� �Ұ����ϴ�.
//		switch(score < 90) { 
//		case 1:
//			System.out.println();
//		}

//		switch (score / 10) {
//		case 10:
//			System.out.println("A");
//			break;
//		case 90:
//			System.out.println("B");
//			break;
//		case 80:
//			System.out.println("C");
//			break;
//		case 70:
//			System.out.println("D");
//			break;
//
//		default:
//			break;
//		}

		// Switch ������
		Scanner sc = new Scanner(System.in);
		
		// �ʿ信 ���� �޴���ȣ�� ����ε� ���� �� �ִ�.
		final int HELLO_MENU = 1;
		final int NAME_MENU = 2;
		final int GENDER_MENU = 3;
		final int EXIT_MENU = 4;
		int mKey = 0;

		do {
			System.out.println("============================================");
			System.out.println(" 		M E N U			 ");
			System.out.println("============================================");
			System.out.println("	1. Hello World ����ϱ�");
			System.out.println("	2. �̸� ����ϱ�");
			System.out.println("	3. ���� ����ϱ�");
			System.out.println("	4. ����");
			System.out.println("============================================");
			System.out.println("");
			System.out.print("��ȣ�� �Է����ּ���. : ");
			mKey = sc.nextInt();
			
//			if (mKey == 1) {
//				System.out.println("Hello World!");
//			}
//			else if (mKey == 2) {
//				System.out.println("������");
//			}
//			else if (mKey == 3) {
//				System.out.println("�����Դϴ�.");
//			}
//			else if (mKey == 4) {
//				System.out.println("���α׷��� �����մϴ�.");
//				break;
//			} else {
//				System.out.println("�ٸ� ���� �Է����ּ���");
//			}
			
			switch (mKey) {
			case HELLO_MENU :
				System.out.println("Hello World!");
				break;
			case NAME_MENU :
				System.out.println("NAME");
				break;
			case GENDER_MENU :
				System.out.println("GENDER");
				break;
			case EXIT_MENU :
				System.out.println("BYE");
				break;
			default :
				System.out.println("�ٸ� �� �Է��ϼ���.");
			}

		} while (mKey != 4);




//		
//		switch (mKey) {
//		case HELLO_MENU:
//			System.out.println("Hello World!");
//
//		case NAME_MENU:
//			System.out.println("������");
//
//		case GENDER_MENU:
//			System.out.println("�����Դϴ�.");
//
//		case EXIT_MENU:
//			System.out.println("���α׷��� �����մϴ�.");
//			break;
//		default:
//			System.out.println("�ٸ� ���� �Է��Ͽ����ϴ�.");
//		}

	}
}
