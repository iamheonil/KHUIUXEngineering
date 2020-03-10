package kh20200310_practice2;

import java.util.Scanner;

public class BookManagerMapEx {
	
	private static final int NEW = 1;
	private static final int DEL = 2;
	private static final int SEARCH = 3;
	private static final int PRINT_ALL = 4;
	private static final int SORT = 5;
	private static final int EXIT = 6;
	
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
		
		System.out.print("�����з��ڵ�(1.�ι�/2.�ڿ�����/3.�Ƿ�/4.��Ÿ) : ");
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
		Scanner sc = new Scanner(System.in);
		BookManagerMap bmt = new BookManagerMap();
		int menuNum = 0;
		
		do {
			System.out.println();
			System.out.println("1�� : å �߰��ϱ�");
			System.out.println("2�� : å �����ϱ�");
			System.out.println("3�� : ���������� �˻�");
			System.out.println("4�� : ��ü å ���");
			System.out.println("5�� : å ��ȣ�� �˻�");
			System.out.println("6�� : �ý��� ���� ");
			System.out.println("ȯ���մϴ�. ��ȣ�� �Է����ּ���.");
			System.out.print("\t >> ");
			
			
			menuNum = sc.nextInt();
			switch (menuNum) {
			
			case NEW:
				bmt.putBook(inputBook());
				System.out.println();
				break;
				
			case DEL:
				sc.nextLine();
				System.out.print("������ å ��ȣ�� �Է��ϼ��� : ");
				String bNo = sc.nextLine();
				bmt.removeBook(bNo);
				System.out.println();
				break;
				
			case SEARCH:
				sc.nextLine();
				System.out.print("ã�� �������� �Է��ϼ���. : ");
				String bName = sc.nextLine();
				bmt.searchBook(bName);
				System.out.println();
				break;
				
			case PRINT_ALL:
				bmt.displayAll();
				System.out.println();
				break;
				
			case SORT:
				sc.nextLine();
				System.out.print("å ��ȣ�� �Է��ϼ��� : ");
				bNo = sc.nextLine();
				bmt.printBook(bNo);
				System.out.println();
				break;
				
			case EXIT:
				System.out.println("���α׷��� �����մϴ�. ����");
				break;
				
			default : 
				System.out.println("����� �� ��ȣ�� �Է����ּ���.");
				break;
			}
		} while(menuNum != EXIT);
		
	} // method end

} // class end


//		System.out.print("������ put");
		

//		System.out.println("������ remove");
		

		// å ã��
//		System.out.println("SearchBook");


		// ��ü ���
//		System.out.println("displayAll");


		// �ش� ���
//		System.out.println("PrintBook / �ش����");


