package kh20200203;

import java.util.Scanner;

public class Source4 {
	public static void main(String[] args) {

// ��� ����.
// Control Statement
// ���α׷��� �������� �帧�� �����ϴ� ����
// ? �������� �帧 : main() �޼ҵ忡�� �����Ͽ� �ڵ� �� �پ� ������ ����Ǵ� �� 		
// ���α׷��� �帧�� �����ڰ� ���ϴ� �������� ������ �� �ִ�.

// ����� ����
// ���ǹ�(Condition Statement)
// if, else if, else

// �ݺ���(Loop)
// for, while, do while		

// ���ù�(Select)
// switch

// ���ǹ�(if)

//		if (10 > 10) {
//		 ���ǽ��� true ��� ����, �ƴ϶�� �Ѿ��
//		}
// 		���ǹ��� ����� true, false(boolean)���� �Ǻ������� �����
//		Ex) num < 10
		
//		if (false) {
//			System.out.println("���?");
//		}
//		System.out.println("����� �ٱ� if");
//		���ǹ��� true �� ��츸 ������ �ڵ带 �����ϰ� �ƴ϶�� �ٱ� �κ��� �ڵ带 �����Ѵ�.
		
		int num = 10;
		
		if (num == 10) {
			System.out.println("Hi");
		}
		System.out.println("Hello");
		
		System.out.println("");
		{
			System.out.println("Apple");
			System.out.println("Banana");
			System.out.println("Cherry");
		}
		
		System.out.println("");
		
		// ��� ���� �� ��� ������ ���� �Ѱ��� ���(�ڵ�)���� ������ �ش�!
		if(false)
			System.out.println("if��");
			System.out.println("if�� ��");
		
			System.out.println("");
		
		if(true) { 
			System.out.println("Apple");
			System.out.println("Banana");
			System.out.println("Cherry");
		}
		System.out.println("if�� ��");
		
		System.out.println("");
		
		
		// ����� �Ǽ��� ; ���̴°� �����ؾ��Ѵ�.
		if(false); { 
			System.out.println(1);
			System.out.println(1);
			System.out.println(1);
		}
		
		// ����� {} ���� �ڵ� �� ���� �����ϱ⵵ �ϰ� {} �ִ� �ڵ� �׷� �� ���� �����ϱ⵵ �ϴµ�
		// �����ڴ� �ݵ�� �ڵ尡 �� ���̾ {} �� ����ؾ��Ѵ�. �̰� ����
			
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է��ϼ��� : ");
		int input = sc.nextInt();
		
		if(input == 10) { 
			System.out.println("�Է°��� 10 �� �½��ϴ�.");
		}
		if(input != 10) {
			System.out.println("�Է°��� 10�� �ƴմϴ�.");
		}
		
				
	}
}