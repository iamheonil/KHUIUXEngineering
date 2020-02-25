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
// class Array List
//	- 단순 연결 리스트
//	- 배열과 거의 비슷한 동작을 하는 클래스 
//	- 배열과 달리 공간의 크기를 확장하거나 축소할 수 있다.
//	- 빠른편이다(배열에 비해서 크게 느리지 않기에 이걸 더 많이 쓰라고 권장함)
//	- 단방향 포인터 (한 방향으로만 쭉쭉) 
// 	- 수정, 삭제, 중간삽입이 자주 일어나는 경우에는 사용하기 좋지 않다. (비 효율적)

// class Linked List
//	- 링크드 리스트
//	- 양방향 포인터 (어느 방향이든 쭉)
//	- 수정, 삭제, 중간삽입이 자주 일어나는 경우에 사용하기 좋다. (효율적)

// class Vector
//	- ArrayList 와 거의 흡사하다.
//	- 매우매우 유사한 알고리즘을 가지고 있고 동기화처리 되어있다.(Thread-Safe)
//	- Thread-Safe 하다는게 차이점

//	- ** Thread-Safe (다시한번 복습)
// 		- 멀티스레딩 환경에서 여러 스레드에 동시에 영향을 받아도 의도한대로 흘러가는가?
//			(동기화처리 되어있는가)


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
//		System.out.println(list.get(1));	// BaNaNa
		
		// List 에서는 length 대신 Size 를 사용한다.
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		
		System.out.println();
		
		System.out.println("\n수정, set");
		System.out.println(list.set(1, "Orange"));
		System.out.println(list);
		
		System.out.println("\n삭제 remove");
		System.out.print("Boolean 형 : ");
		System.out.println(list.remove("BaNaNa"));
		list.remove("BaNaNa");
		System.out.println(list);
		
		System.out.println();
		System.out.println("인덱스 지정 지워진 값 : " + list.remove(1));
		System.out.println(list);
		
		System.out.println("\n삽입 한번 더");
		list.add("WaterMelon");
		list.add("Tomato");
		System.out.println(list);
		
		System.out.println("\nContains, 들어가있나 확인하는거");
		System.out.println(list.contains("Tomato"));
		
		System.out.println("\nIsEmpty(), 비었나? 확인하는거");
		System.out.println(list.isEmpty());
		// IsEmpty, Contains 두개 자주 쓴다.
		
		System.out.println();
		List l = null;				// 리스트 자체를 생성하지 않아서 Null
									// 배열 NullPointException 띄웠던거랑 똑같은 원리.

//		if(l.isEmpty()) {
//			System.out.println("Empty");
//		}
		
		if(l == null) {	}	// 정상
		
		List ll = new ArrayList();	// 리스트는 생성 됐는데 값이 없어 [] 빈 공간만 출력
		
		if(ll == null) { }	// 정상
		
		if(ll.isEmpty()) {
			System.out.println("Empty");
			System.out.println();
		}
		
		System.out.println(l);
		System.out.println(ll);
		
		
		System.out.println("모든 요소 출력하기");
		list.add(123);
		list.add(true);
		list.add(3.14);
		
		System.out.println(list);					// 1. 객체를 이용한 출력
		
		System.out.println("\n반복문 이용 출력");	// 2. 반복문을 이용한 출력
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list);
		}
		
		System.out.println();
		
		System.out.println("foreach문 이용 출력");	// 3. foreach문을 이용한 출력
		for (Object elements : list) {
			System.out.print(elements + " ");
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		System.out.println("Clear!!");
		System.out.println(list);
		list.clear();				//	빈칸은 남아있고 안에 들어가있는 요소들만 지워버린다.
		System.out.println(list + "   // 안에 들어간 요소 모두 삭제 됐음");
		list = null;				// 객체 파괴 (GC 동작)
		System.out.println(list + " // 객체 파괴 됐음");
		
	}
}
