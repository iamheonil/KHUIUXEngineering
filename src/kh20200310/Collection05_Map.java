package kh20200310;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Collection05_Map {
	public static void main(String[] args) {

		Map map = new HashMap();

		// ����
		map.put(1, "Apple");
		map.put(2, "Banana");
		map.put(3, "Cherry");

		System.out.println("map : " + map);

		System.out.println("\n---get()-------"); // ��ȸ
		System.out.println(map.get(3)); // 3=Cherry
		System.out.println(map.get(5)); // null, key�� ���� ��

		System.out.println("\n---put()-------");
		map.put("D", "Durian");
		System.out.println("map : " + map);

		System.out.println("get(\"D\") : " + map.get("D"));

		System.out.println("----------");
		map.put(2, "Orange"); // ������ �����ϴ� key
		map.put(4, "Apple"); // ���������ʴ� key, ������ �����ϴ� value

		System.out.println("map : " + map);

		System.out.println("\n---contains()-------");
		System.out.println("key 5 : " + map.containsKey(5));
		System.out.println("value \"Apple\" : " + map.containsValue("Apple"));

		// 5��� key�� �������� ���� ��쿡 ������ ����
		if (!map.containsKey(5)) {
			map.put(5, "Grape");
		}

		if (map.containsKey(555)) {
			String str = (String) map.get(555);
			System.out.println(str.length());
		} else {
			System.out.println("[ERROR] 555 Ű�� ����");
		}

		System.out.println("\n---size()-------");
		System.out.println(map.size());

		System.out.println("\n---isEmpty()-------");
		System.out.println(map.isEmpty());

		System.out.println("\n---remove()-------"); // ����
		map.remove(3); // key�� 3�� Entry�� ����
		System.out.println(map);

		// key�� 2�� Entry�� value�� "Apple"�� �� ����
		map.remove(2, "Apple");
		System.out.println(map);

		System.out.println("\n---null�� ó��-------");

		map.put(null, "Bob"); // key�� null�� ��Ȳ�� ���� ����
		map.put(10, null);
		System.out.println(map);

		map.put(null, null);
		System.out.println(map);

		System.out.println("\n-------map -> set-------");

		Set keySet = map.keySet(); // key���� Set���� ����

		Set entrySet = map.entrySet(); // Entry(key-value��)���� Set���� ����

		System.out.println("keySet : " + keySet);
		System.out.println("entrySet : " + entrySet);

		System.out.println("-------------");

		Set keys = map.keySet(); // key Set

		Iterator iter = keys.iterator(); // Key Set�� �ݺ��� ����

		// Key Set Iterator �ݺ�
		while (iter.hasNext()) {
			Object key = iter.next(); // Key ������

			System.out.println(map.get(key)); // key�� �ش��ϴ� Value ���
		}

	}
}
