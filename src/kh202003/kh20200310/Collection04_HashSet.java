package kh202003.kh20200310;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Collection04_HashSet {
	public static void main(String[] args) {
		
		Set set = new HashSet();
//		Set set = new LinkedHashSet(); //���Ե� ������ ����
//		Set set = new TreeSet(); //���ĵ� ���¸� ����
		
		set.add(30);
		set.add(20);
		set.add(10);
		set.add(30);
		set.add(20);
		set.add(10);
		
		System.out.println(set);
		
		System.out.println("--------------");

		Iterator iter = set.iterator(); //�ݺ���(iterator) ����
		
		//Set�� ��� ��� ����ϱ�
		while( iter.hasNext() ) {
			System.out.println( iter.next() );
		}
		
		System.out.println("--------------");

		Object[] arr = set.toArray(); // Set -> �迭
		
		System.out.println( Arrays.toString(arr) ); //�迭 ��ü ���
		
		Arrays.sort(arr); //�迭 �����ϱ�
		
		//�ε����� �̿��� �迭 ��ü ���
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("---------------------");
		
		// Set�� �̿��� ArrayList �����
		List list = new ArrayList(set);
		System.out.println(list);
		
		System.out.println("---------------------");
		
		System.out.println("ũ�� : " + set.size());
		System.out.println("����°�? " + set.isEmpty());
		System.out.println("222�� �����ϴ°�? " + set.contains(222));
		System.out.println("30�� ���� : " + set.remove(30));
		
		System.out.println(set);
		
		set.clear(); //��� ��� ����
		System.out.println("����°�? " + set.isEmpty());
		System.out.println(set);
		
	}
}















