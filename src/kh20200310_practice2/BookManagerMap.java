package kh20200310_practice2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class BookManagerMap {

//	//Field
//	- booksMap : HashMap	// 도서번호를 키로 사용함
//
//	//기본생성자 : 맵 객체 생성함
//
//	//매개변수있는 생성자 : 다른 맵을 전달받아. 
//	//		booksMap 객체의 초기값으로 생성함
//
//	//Method
//	+ putBook(book:Book) : void	// 맵에 객체 추가, 도서번호를 키로 사용함
//	+ removeBook(key:String) : void	// 맵에서 객체 제거
//	+ searchBook(String bTitle) : String	: entrySet() 사용
//		// 도서명이 일치하는 객체의 도서번호를 리턴
//		// 도서명이 객체가 맵에 없으면, null 리턴함
//	+ displayAll():void		//맵정보 모두 출력 : keySet() 사용
//	+ printBook(key:String) : void	//key에 해당하는 Book 출력

	Map booksMap = new HashMap();
	Scanner sc = new Scanner(System.in);
	
//	Book b = new Book(null, 0, null, null);
//	public void putBook(Book book) {
//		String bNum = "";
//		map.put(bNum, book);
//	}
	
	
	public void putBook(Book book) {
//		System.out.print("도서번호를 입력하세요 : ");
//		String bNo = sc.nextLine();
//		System.out.print("도서분류코드(1.인문/2.자연과학/3.의료/4.기타)");
//		int category = sc.nextInt();
//		sc.nextLine();
//		System.out.print("책 제목을 입력하세요 : ");
//		String title = sc.nextLine();
//		System.out.print("지은이를 입력하세요 : ");
//		String author = sc.nextLine();

		
		booksMap.put(book.getbNo(), book);
//		booksMap.put(new Book("10002", 3, "오우 너무 하기 싫어", "김헌일"), book);

	}

	public void removeBook(String key) {
		
		booksMap.remove(key);
	}

	public String searchBook(String bTitle) {
		
		Set entrySet = booksMap.entrySet(); // Entry(key-value쌍)들을 Set으로 추출
		System.out.println("entrySet : " + entrySet);
		
		return bTitle;
		
		// 도서 번호 리턴하게 수정
		// 도서명이 없다면 null 리턴

	}

	public void displayAll() {
		// 맵정보 출력
		Set keys = booksMap.keySet(); // key Set

		Iterator iter = keys.iterator(); // Key Set의 반복자 생성

		// Key Set Iterator 반복
		while (iter.hasNext()) {
			Object key = iter.next(); // Key 꺼내기

			System.out.println(booksMap.get(key)); // key에 해당하는 Value 출력
		}
	}

	public void printBook(String key) {
		// key에 해당하는 북 출력
		System.out.println(booksMap.get(key));
	}
}

