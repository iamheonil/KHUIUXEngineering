package kh20200310;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorEx {
	public static void main(String[] args) {

		Person p1 = new Person(2, "Park", "Baseball");
		Person p2 = new Person(1, "Bob", "Computer Games");
		Person p3 = new Person(3, "Alice", "Aero Control");

		List<Person> list = new ArrayList<>();

		list.add(p1);
		list.add(p2);
		list.add(p3);

		System.out.println("Comparator ���� ��");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));

		}

		Comparator<Person> comp = new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {

				// ��ȯ��
				// - ���� : ù��°(o1) �����Ͱ� �۴�, ���ļ����� ������ ������
				// - 0 : o1, o2�� �����Ͱ� ����.
				// - ��� : ù��°(o1) �����Ͱ� ũ��, ���ļ����� �ڷ� ������.

				// ��������
//				if ( o1.getNo() < o2.getNo() ) {
//					return -1;
//				} else if ( o1.getNo() > o2.getNo() ) {
//					return 1;
//				} else {
//					return 0;				
//				}

//				// ��������
//				if ( o1.getNo() < o2.getNo() ) {
//					return 1;
//				} else if ( o1.getNo() > o2.getNo() ) {
//					return -1;
//				} else {
//					return 0;				
//				}

				// �̸� ���� ��������
//				if (o1.getName().compareTo(o2.getName()) < 0) {	// ������ �������, ���Ľ� �� ������
//					return -1;
//				} else if (o1.getName().compareTo(o2.getName()) > 0) {	// ������ Ŭ ���, ���Ľ� �� �ڷ�
//					return 1;
//				} else {
//					return 0;
//				}

				// �̸� ���� ��������
//				if (o1.getName().compareTo(o2.getName()) < 0) {	// ������ �������, ���Ľ� �� ������
//					return 1;
//				} else if (o1.getName().compareTo(o2.getName()) > 0) {	// ������ Ŭ ���, ���Ľ� �� �ڷ�
//					return -1;
//				} else {
//					return 0;
//				}
				
				// ��� ���� ��������
//				if ( o1.getHobby().compareTo(o2.getHobby() ) < 0) {	// ������ �������, ���Ľ� �� ������
//					return -1;
//				} else if ( o1.getHobby().compareTo(o2.getHobby()) > 0 ) {	// ������ Ŭ ���, ���Ľ� �� �ڷ�
//					return 1;
//				} else {
//					return 0;
//				}
				
				// ��� ���� ��������
				if ( o1.getHobby().compareTo(o2.getHobby() ) < 0) {	// ������ �������, ���Ľ� �� ������
					return 1;
				} else if ( o1.getHobby().compareTo(o2.getHobby() ) > 0) {	// ������ Ŭ ���, ���Ľ� �� �ڷ�
					return -1;
				} else {
					return 0;
				}
				
			}
		};

		Collections.sort(list, comp);
		System.out.println("\nComparator ���� ��");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));

		}

	}
}