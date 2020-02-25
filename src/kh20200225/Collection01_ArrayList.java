package kh20200225;

import java.util.ArrayList;
import java.util.List;

// List �������̽�
// ����Ʈ

// �����͸� �Ϸķ� ��ġ�ϴ� �ڷᱸ��
// ��������
// ���(Element) �� �ε����� �����Ѵ�.
// ����Ʈ�� ��Ұ� �߰��� �� �ε����� �ڵ����� �ο��Ѵ�.
// �������� ���� ������ �����ϰ� �Ǿ��ִ�.
// �迭�� ���־��� ����ϴ�.

// Interface List�� �����ϰ� �ִ� Class�� �ִ�.
//	class Array List, class Linked List, class Vector
// 
// class Array List
//	- �ܼ� ���� ����Ʈ
//	- �迭�� ���� ����� ������ �ϴ� Ŭ���� 
//	- �迭�� �޸� ������ ũ�⸦ Ȯ���ϰų� ����� �� �ִ�.
//	- �������̴�(�迭�� ���ؼ� ũ�� ������ �ʱ⿡ �̰� �� ���� ����� ������)
//	- �ܹ��� ������ (�� �������θ� ����) 
// 	- ����, ����, �߰������� ���� �Ͼ�� ��쿡�� ����ϱ� ���� �ʴ�. (�� ȿ����)

// class Linked List
//	- ��ũ�� ����Ʈ
//	- ����� ������ (��� �����̵� ��)
//	- ����, ����, �߰������� ���� �Ͼ�� ��쿡 ����ϱ� ����. (ȿ����)

// class Vector
//	- ArrayList �� ���� ����ϴ�.
//	- �ſ�ſ� ������ �˰����� ������ �ְ� ����ȭó�� �Ǿ��ִ�.(Thread-Safe)
//	- Thread-Safe �ϴٴ°� ������

//	- ** Thread-Safe (�ٽ��ѹ� ����)
// 		- ��Ƽ������ ȯ�濡�� ���� �����忡 ���ÿ� ������ �޾Ƶ� �ǵ��Ѵ�� �귯���°�?
//			(����ȭó�� �Ǿ��ִ°�)


public class Collection01_ArrayList {
	public static void main(String[] args) {

		
		// �ڷᱸ������ ���� ���Ǵ� ���� (����, �˰���)
		// CRUD �۾�
		// Create 	- �߰�/����
		// Read		- ��ȸ/Ž��
		// Update 	- ����/����
		// Delete	- ����/����
		// = CRUD ����
		
		List list = new ArrayList();
		
		System.out.println("\n����, Create");
		list.add("Apple");
		list.add("BaNaNa");
		list.add("Cherry");
		
		System.out.println(list);
		
		System.out.println("\n��ȸ, get");
//		System.out.println(list.get(1));	// BaNaNa
		
		// List ������ length ��� Size �� ����Ѵ�.
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		
		System.out.println();
		
		System.out.println("\n����, set");
		System.out.println(list.set(1, "Orange"));
		System.out.println(list);
		
		System.out.println("\n���� remove");
		System.out.print("Boolean �� : ");
		System.out.println(list.remove("BaNaNa"));
		list.remove("BaNaNa");
		System.out.println(list);
		
		System.out.println();
		System.out.println("�ε��� ���� ������ �� : " + list.remove(1));
		System.out.println(list);
		
		System.out.println("\n���� �ѹ� ��");
		list.add("WaterMelon");
		list.add("Tomato");
		System.out.println(list);
		
		System.out.println("\nContains, ���ֳ� Ȯ���ϴ°�");
		System.out.println(list.contains("Tomato"));
		
		System.out.println("\nIsEmpty(), �����? Ȯ���ϴ°�");
		System.out.println(list.isEmpty());
		// IsEmpty, Contains �ΰ� ���� ����.
		
		System.out.println();
		List l = null;				// ����Ʈ ��ü�� �������� �ʾƼ� Null
									// �迭 NullPointException ������Ŷ� �Ȱ��� ����.

//		if(l.isEmpty()) {
//			System.out.println("Empty");
//		}
		
		if(l == null) {	}	// ����
		
		List ll = new ArrayList();	// ����Ʈ�� ���� �ƴµ� ���� ���� [] �� ������ ���
		
		if(ll == null) { }	// ����
		
		if(ll.isEmpty()) {
			System.out.println("Empty");
			System.out.println();
		}
		
		System.out.println(l);
		System.out.println(ll);
		
		
		System.out.println("��� ��� ����ϱ�");
		list.add(123);
		list.add(true);
		list.add(3.14);
		
		System.out.println(list);					// 1. ��ü�� �̿��� ���
		
		System.out.println("\n�ݺ��� �̿� ���");	// 2. �ݺ����� �̿��� ���
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list);
		}
		
		System.out.println();
		
		System.out.println("foreach�� �̿� ���");	// 3. foreach���� �̿��� ���
		for (Object elements : list) {
			System.out.print(elements + " ");
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		System.out.println("Clear!!");
		System.out.println(list);
		list.clear();				//	��ĭ�� �����ְ� �ȿ� ���ִ� ��ҵ鸸 ����������.
		System.out.println(list + "   // �ȿ� �� ��� ��� ���� ����");
		list = null;				// ��ü �ı� (GC ����)
		System.out.println(list + " // ��ü �ı� ����");
		
	}
}
