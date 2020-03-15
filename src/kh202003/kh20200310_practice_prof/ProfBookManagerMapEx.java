package kh202003.kh20200310_practice_prof;

import java.util.HashMap;
import java.util.Scanner;

public class ProfBookManagerMapEx {
	
	private static final Scanner sc = new Scanner(System.in);

	private static final ProfBookManagerMap bmMap = new ProfBookManagerMap();

	//�޴� ���
	private static final int NEW = 1;
	private static final int DEL = 2;
	private static final int SEARCH = 3;
	private static final int PRINT_ALL = 4;
	private static final int SORT = 5;
	private static final int EXIT = 6;
	
	public static void main(String[] args) {
//		test();
		menu();
	}
	
//	private static void test() {
//		//�׽���
//		HashMap<String, ProfBook> testMap = new HashMap<>();
//		testMap.put("100001", new ProfBook("100001", 1, "�ι�����1", "�ι�����1"));
//		testMap.put("200005", new ProfBook("200005", 2, "�ڿ�����1", "�ڿ���������1"));
//		testMap.put("400004", new ProfBook("400004", 4, "��Ÿ����1", "��Ÿ����1"));
//		testMap.put("100009", new ProfBook("100009", 1, "�ι�������2", "�ι�����2"));
//		testMap.put("300007", new ProfBook("300007", 3, "�Ƿ�ͱ��1", "�Ƿ�����1"));
//		testMap.put("200003", new ProfBook("200003", 2, "�ڿ�����2", "�ڿ���������2"));
//		
//		//�׽�Ʈ�� �� �ʱ�ȭ
//		ProfBookManagerMap bmMapTest = new ProfBookManagerMap(testMap);
//		
//		// ��ü ��� �׽�Ʈ
//		bmMapTest.displayAll();
		
		//å ���� �׽�Ʈ
//		bmMapTest.putBook(new Book("400010", 4, "��Ÿ�����̿�", "��Ÿ����3"));
//		bmMapTest.putBook(new Book("400011", 4, "��Ÿ��Ÿ��Ÿ", "��Ÿ����4"));
//		bmMapTest.displayAll();

		//�Է��� å ���� �׽�Ʈ
//		Book tmp = inputBook();
//		bmMapTest.putBook(tmp);
//		bmMapTest.displayAll();
		
		//å �˻� �׽�Ʈ
//		System.out.println("�ι�����1 : " + bmMapTest.searchBook("�ι�����1") );
//		System.out.println("���� å : " + bmMapTest.searchBook("���� å") );
	
		//�Է��� å�̸����� �˻� �׽�Ʈ - ����� å��ȣ
//		bmMapTest.displayAll();
//		System.out.println( bmMapTest.searchBook(inputBookTitle()) );
		
		//å��ȣ�� å ���� ���
//		bmMapTest.displayAll();
//		System.out.println("-----");
//		bmMapTest.printBook("100001");

		//�Է��� å�̸����� �˻� �׽�Ʈ - �˾Ƴ� å��ȣ�� å���� ���
//		bmMapTest.displayAll();
//		bmMapTest.printBook(bmMapTest.searchBook(inputBookTitle()));

//	}

	public static void menu() {
		
		int sel=0;
		
		do {
			System.out.println("*** ���� ���� ���α׷� ***");
			System.out.println();
			System.out.println(" 1. �� ���� �߰�");
			System.out.println(" 2. ���� ����");
			System.out.println(" 3. ���� �˻� ���");
			System.out.println(" 4. ��ü ���");
			System.out.println(" 6. ����");

			do {
				System.out.print("  >> ");
				sel = sc.nextInt();
				if(sel<1 || sel>6) {
					System.out.println("1~6�� �Է��ϼ���");
				}
			} while(sel<1 || sel>6);
			
			switch(sel) {
			case NEW:
				System.out.println(" + + + ���ο� å ���� �Է� + + +");

				bmMap.putBook(inputBook());
				break;
				
			case DEL:
				System.out.println(" + + + å ���� ���� + + +");

				deleteBook();
				break;
				
			case SEARCH:
				System.out.println(" + + + å ���� �˻� + + +");
				
				searchBook();
				break;
				
			case PRINT_ALL:
				System.out.println(" + + + å ���� ��ü ��� + + +");
				
				displayAll();				
				break;
				
			case SORT:
				break;
				
			case EXIT:
				break;
			}
			
		} while( sel != EXIT );
	}
	


	//Book ��ü�� �ʵ尪�� Ű����� �Է¹޾� �ʱ�ȭ�ϰ� ��ü ����
	private static ProfBook inputBook() {
		ProfBook book = new ProfBook();
		
		System.out.print("å ��ȣ : ");
		book.setbNo( sc.next() );
		
		System.out.print("ī�װ�(1.�ι�/2.�ڿ�����/3.�Ƿ�/4.��Ÿ) : ");
		book.setCategory( sc.nextInt() );
		sc.nextLine();
		
		System.out.print("å ����: ");
		book.setTitle( sc.nextLine() );
		
		System.out.print("å ���� : ");
		book.setAuthor( sc.nextLine() );
		
		return book;
	}
	
	private static void deleteBook() {
		System.out.print("������ å�� ��ȣ�� �Է��ϼ��� : ");
		bmMap.removeBook(sc.next());
	}

	private static void searchBook() {
		System.out.print("�������� �Է��ϼ��� : ");
		String bookName = sc.next();
		
		bmMap.printBook( bmMap.searchBook(bookName) );
	}

	private static void displayAll() {
		bmMap.displayAll();
	}

}






















