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
		System.out.println(list.get(1));	// BaNaNa
		
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		
//		System.out.println("\n��ȸ, get");
//		System.out.println(list.get(1));
		
		
		
		
	}
}
