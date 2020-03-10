package kh20200310_practice2;

import java.util.Scanner;

public class BookManagerMapEx {
	public static void main(String[] args) {
		
		menu();
		
//		>> menu() �޼ҵ� �߰���
//		public static void menu(){}
//
//			=> ���� ������ ��µǰ� ��
//			=> BookManagerMap Ŭ���� ��ü ������
//
//		*** ���� ���� ���α׷� ***
//
//		1. �� ���� �߰�	//putBook(inputBook() �� ������ ��ü) ����
//		2. ���� ����	//removeBook(������ å��ȣ) ����
//		3. ���� �˻����	//searchBook(�˻��� ������) ���� 
//				=> index ���Ϲ޾� printBook(key) ����
//		4. ��ü ���	//displayAll() ����
//		6. ������
//
//		>>�߰�, ����, �˻��� �ʿ��� Ű������ Ű����� �Է¹޵��� ��
//		//Book ��ü�� �ʵ尪�� Ű����� �Է¹޾� �ʱ�ȭ�ϰ� ��ü ����
//		+ static inputBook() : Book
//
//		//���� �Ǵ� �˻��� ���� ���� Ÿ��Ʋ�� Ű����� �Է¹޾� ����
//		+ static inputBookTitle() : String
//
//		>> ������ �޴� ���� �������� �޴� �ݺ� ����ǵ��� ó����
		

	}
	
	public static Book inputBook() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ȣ�� �Է��ϼ��� : ");
		String setbNo = sc.nextLine();
		System.out.print("�����з��ڵ�(1.�ι�/2.�ڿ�����/3.�Ƿ�/4.��Ÿ)");
		int setCategory = sc.nextInt();
		sc.nextLine();
		System.out.print("å ������ �Է��ϼ��� : ");
		String setTitle = sc.nextLine();
		System.out.print("�����̸� �Է��ϼ��� : ");
		String setAuthor = sc.nextLine();
		
		Book book = new Book(setbNo, setCategory, setTitle, setAuthor);
		return book;
	}
	
	public static void menu() {
		
		BookManagerMap bmt = new BookManagerMap();
		Scanner sc = new Scanner(System.in);
		String bNum = "";
		
		
		System.out.println("������ put");
//		inputBook();
		bmt.putBook(inputBook());
//		System.out.println(bmt.getBooksMap());
		System.out.println();
		
		System.out.println("������ remove");
		System.out.println("������ å ��ȣ");
		String bNo = sc.nextLine();
		bmt.removeBook(bNo);		
		
		// å ã��
//		System.out.println("SearchBook");
//		System.out.print("ã�� �������� �Է��ϼ���. : ");
//		String bName = sc.nextLine();
//		bmt.searchBook(bName);
		System.out.println();
		
		// ��ü ���
		System.out.println("displayAll");
		bmt.displayAll();
		
		System.out.println();
		// �ش� ���
		System.out.println("PrintBook / �ش����");
		System.out.print("å ��ȣ�� �Է��ϼ��� : ");
		bNo = sc.nextLine();
		bmt.printBook(bNo);
		
	}
	
}
