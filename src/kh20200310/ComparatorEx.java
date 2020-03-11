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

		System.out.println("Comparator 나열 전");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));

		}

		Comparator<Person> comp = new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {

				// 반환값
				// - 음수 : 첫번째(o1) 데이터가 작다, 정렬순서를 앞으로 보낸다
				// - 0 : o1, o2의 데이터가 같다.
				// - 양수 : 첫번째(o1) 데이터가 크다, 정렬순서를 뒤로 보낸다.

				// 오름차순
//				if ( o1.getNo() < o2.getNo() ) {
//					return -1;
//				} else if ( o1.getNo() > o2.getNo() ) {
//					return 1;
//				} else {
//					return 0;				
//				}

//				// 내림차순
//				if ( o1.getNo() < o2.getNo() ) {
//					return 1;
//				} else if ( o1.getNo() > o2.getNo() ) {
//					return -1;
//				} else {
//					return 0;				
//				}

				// 이름 기준 오름차순
//				if (o1.getName().compareTo(o2.getName()) < 0) {	// 왼쪽이 작은경우, 정렬시 맨 앞으로
//					return -1;
//				} else if (o1.getName().compareTo(o2.getName()) > 0) {	// 왼쪽이 클 경우, 정렬시 맨 뒤로
//					return 1;
//				} else {
//					return 0;
//				}

				// 이름 기준 내림차순
//				if (o1.getName().compareTo(o2.getName()) < 0) {	// 왼쪽이 작은경우, 정렬시 맨 앞으로
//					return 1;
//				} else if (o1.getName().compareTo(o2.getName()) > 0) {	// 왼쪽이 클 경우, 정렬시 맨 뒤로
//					return -1;
//				} else {
//					return 0;
//				}
				
				// 취미 기준 오름차순
//				if ( o1.getHobby().compareTo(o2.getHobby() ) < 0) {	// 왼쪽이 작은경우, 정렬시 맨 앞으로
//					return -1;
//				} else if ( o1.getHobby().compareTo(o2.getHobby()) > 0 ) {	// 왼쪽이 클 경우, 정렬시 맨 뒤로
//					return 1;
//				} else {
//					return 0;
//				}
				
				// 취미 기준 내림차순
				if ( o1.getHobby().compareTo(o2.getHobby() ) < 0) {	// 왼쪽이 작은경우, 정렬시 맨 앞으로
					return 1;
				} else if ( o1.getHobby().compareTo(o2.getHobby() ) > 0) {	// 왼쪽이 클 경우, 정렬시 맨 뒤로
					return -1;
				} else {
					return 0;
				}
				
			}
		};

		Collections.sort(list, comp);
		System.out.println("\nComparator 나열 후");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));

		}

	}
}