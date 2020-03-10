package kh20200310_practice2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class BookManagerMap {

//	//Field
//	- booksMap : HashMap	// ������ȣ�� Ű�� �����
//
//	//�⺻������ : �� ��ü ������
//
//	//�Ű������ִ� ������ : �ٸ� ���� ���޹޾�. 
//	//		booksMap ��ü�� �ʱⰪ���� ������
//
//	//Method
//	+ putBook(book:Book) : void	// �ʿ� ��ü �߰�, ������ȣ�� Ű�� �����
//	+ removeBook(key:String) : void	// �ʿ��� ��ü ����
//	+ searchBook(String bTitle) : String	: entrySet() ���
//		// �������� ��ġ�ϴ� ��ü�� ������ȣ�� ����
//		// �������� ��ü�� �ʿ� ������, null ������
//	+ displayAll():void		//������ ��� ��� : keySet() ���
//	+ printBook(key:String) : void	//key�� �ش��ϴ� Book ���

	Map booksMap = new HashMap();
	Scanner sc = new Scanner(System.in);
	
//	Book b = new Book(null, 0, null, null);
//	public void putBook(Book book) {
//		String bNum = "";
//		map.put(bNum, book);
//	}
	
	
	public void putBook(Book book) {
//		System.out.print("������ȣ�� �Է��ϼ��� : ");
//		String bNo = sc.nextLine();
//		System.out.print("�����з��ڵ�(1.�ι�/2.�ڿ�����/3.�Ƿ�/4.��Ÿ)");
//		int category = sc.nextInt();
//		sc.nextLine();
//		System.out.print("å ������ �Է��ϼ��� : ");
//		String title = sc.nextLine();
//		System.out.print("�����̸� �Է��ϼ��� : ");
//		String author = sc.nextLine();

		
		booksMap.put(book.getbNo(), book);
//		booksMap.put(new Book("10002", 3, "���� �ʹ� �ϱ� �Ⱦ�", "������"), book);

	}

	public void removeBook(String key) {
		
		booksMap.remove(key);
	}

	public String searchBook(String bTitle) {
		
		Set entrySet = booksMap.entrySet(); // Entry(key-value��)���� Set���� ����
		System.out.println("entrySet : " + entrySet);
		
		return bTitle;
		
		// ���� ��ȣ �����ϰ� ����
		// �������� ���ٸ� null ����

	}

	public void displayAll() {
		// ������ ���
		Set keys = booksMap.keySet(); // key Set

		Iterator iter = keys.iterator(); // Key Set�� �ݺ��� ����

		// Key Set Iterator �ݺ�
		while (iter.hasNext()) {
			Object key = iter.next(); // Key ������

			System.out.println(booksMap.get(key)); // key�� �ش��ϴ� Value ���
		}
	}

	public void printBook(String key) {
		// key�� �ش��ϴ� �� ���
		System.out.println(booksMap.get(key));
	}
}

