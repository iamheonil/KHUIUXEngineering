package kh20200310_practice2;

import java.util.Scanner;

public class BookManagerMapEx {
	public static void main(String[] args) {
		
		menu();
		
//		>> menu() 메소드 추가함
//		public static void menu(){}
//
//			=> 다음 내용이 출력되게 함
//			=> BookManagerMap 클래스 객체 생성함
//
//		*** 도서 관리 프로그램 ***
//
//		1. 새 도서 추가	//putBook(inputBook() 이 리턴한 객체) 실행
//		2. 도서 삭제	//removeBook(삭제할 책번호) 실행
//		3. 도서 검색출력	//searchBook(검색할 도서명) 실행 
//				=> index 리턴받아 printBook(key) 실행
//		4. 전체 출력	//displayAll() 실행
//		6. 끝내기
//
//		>>추가, 삭제, 검색에 필요한 키정보는 키보드로 입력받도록 함
//		//Book 객체의 필드값을 키보드로 입력받아 초기화하고 객체 리턴
//		+ static inputBook() : Book
//
//		//삭제 또는 검색을 위한 도서 타이틀을 키보드로 입력받아 리턴
//		+ static inputBookTitle() : String
//
//		>> 끝내기 메뉴 선택 전까지는 메뉴 반복 실행되도록 처리함
		

	}
	
	public static Book inputBook() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("도서번호를 입력하세요 : ");
		String setbNo = sc.nextLine();
		System.out.print("도서분류코드(1.인문/2.자연과학/3.의료/4.기타)");
		int setCategory = sc.nextInt();
		sc.nextLine();
		System.out.print("책 제목을 입력하세요 : ");
		String setTitle = sc.nextLine();
		System.out.print("지은이를 입력하세요 : ");
		String setAuthor = sc.nextLine();
		
		Book book = new Book(setbNo, setCategory, setTitle, setAuthor);
		return book;
	}
	
	public static void menu() {
		
		BookManagerMap bmt = new BookManagerMap();
		Scanner sc = new Scanner(System.in);
		String bNum = "";
		
		
		System.out.println("데이터 put");
//		inputBook();
		bmt.putBook(inputBook());
//		System.out.println(bmt.getBooksMap());
		System.out.println();
		
		System.out.println("데이터 remove");
		System.out.println("삭제할 책 번호");
		String bNo = sc.nextLine();
		bmt.removeBook(bNo);		
		
		// 책 찾기
//		System.out.println("SearchBook");
//		System.out.print("찾을 도서명을 입력하세요. : ");
//		String bName = sc.nextLine();
//		bmt.searchBook(bName);
		System.out.println();
		
		// 전체 출력
		System.out.println("displayAll");
		bmt.displayAll();
		
		System.out.println();
		// 해당 출력
		System.out.println("PrintBook / 해당출력");
		System.out.print("책 번호를 입력하세요 : ");
		bNo = sc.nextLine();
		bmt.printBook(bNo);
		
	}
	
}
