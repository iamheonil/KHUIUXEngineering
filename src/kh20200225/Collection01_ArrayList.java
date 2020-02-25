package kh20200225;

import java.util.ArrayList;
import java.util.List;

// List 인터페이스
// 리스트

// 데이터를 일렬로 배치하는 자료구조
// 선형구조
// 요소(Element) 를 인덱스로 관리한다.
// 리스트에 요소가 추가될 때 인덱스를 자동으로 부여한다.
// 데이터의 삽입 순서를 유지하게 되어있다.
// 배열과 아주아주 흡사하다.

// Interface List를 구현하고 있는 Class가 있다.
//	class Array List, class Linked List, class Vector
// 

public class Collection01_ArrayList {
	public static void main(String[] args) {

		
		// 자료구조에서 자주 사용되는 동작 (로직, 알고리즘)
		// CRUD 작업
		// Create 	- 추가/삽입
		// Read		- 조회/탐색
		// Update 	- 수정/변경
		// Delete	- 삭제/제거
		// = CRUD 약자
		
		List list = new ArrayList();
		
		System.out.println("\n삽입, Create");
		list.add("Apple");
		list.add("BaNaNa");
		list.add("Cherry");
		
		System.out.println(list);
		
		System.out.println("\n조회, get");
		System.out.println(list.get(1));	// BaNaNa
		
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		
//		System.out.println("\n조회, get");
//		System.out.println(list.get(1));
		
		
		
		
	}
}
