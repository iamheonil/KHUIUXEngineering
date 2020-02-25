package kh20200225;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Collection02_Iterator {
	public static void main(String[] args) {

		List list = Arrays.asList("A", "B", "C", "D", "E");
		
		// �ݺ���, Iterator
		// Collection �� ��� ��ҵ��� ���������� �о���� ���(���� ���)�� ǥ��ȭ�� ��.

		Iterator iter; // �ݺ���
		iter = list.iterator();	// ����Ʈ�� iterator �����ϱ�.
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		// Iterator �� �ֿ� �޼ҵ�
		// Boolean hasNext() : ���� ����� ���翩��, true / false �� ��ȯ
		// E next() : ���� ��� ��ȯ
		// E -> ������Ʈ��� �����ϸ� ���� ������ ���� ����.

		
	}
}