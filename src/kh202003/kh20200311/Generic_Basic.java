package kh202003.kh20200311;

import java.util.ArrayList;
import java.util.List;

public class Generic_Basic {
	public static void main(String[] args) {

		// Ÿ���� �������� �ʰ� �����Ѵٸ� Object�� ���ȴ�.
		List list = new ArrayList();
		list.add("Hello");
		
		// �θ��� List<String> �� �ڽ��� ArrayList �� �ڷ����� �ٸ��ٸ� ������ �߻��Ѵ�.
		// ������ ���� ����� �Ѵ�b
		//  <E> �� <String> ���� �����ߴ�.
		List<String> sList = new ArrayList<>();

		List<Integer> iList = new ArrayList<>();
		// List<Int> iList = new ArrayList<>(); �� ��� �Ұ�
		// Wrapper Ŭ������ ����ؾ� �Ѵ�.
		
		// Ÿ�� ������
		// ���׸��� ����� �� �ڷ����� �� ���������Ѵ�.
		sList.add("Hi");
		
		// String str1 = list.get(0); -> Ÿ�� �������� ���⿡ ����ȯ�� �ʿ��ϴ�.
		String str1 = (String) list.get(0);
		
		// String���� ó���Ǿ� ����ȯ�� �ʿ����.
		String str2 = sList.get(0);
		
		System.out.println(str1);
		System.out.println(str2);
		
		
		
	}
}