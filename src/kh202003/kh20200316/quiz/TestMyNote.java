package kh202003.kh20200316.quiz;

import java.util.Scanner;

public class TestMyNote {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		menu();
		
	}
	
	public static void menu() {
		MyNote note = new MyNote();
		int select = 0;
		do {
		System.out.println("\t******   MyNote  *******");
		System.out.println("\t1. 노트 새로 만들기	//MyNote의 fileSave()");
		System.out.println("\t2. 노트 열기		//MyNote의 fileOpen()");
		System.out.println("\t3. 노트 열어서 수정하기	//MyNote의 fileEdit()");
		System.out.println("\t4. 끝내기		//main() 으로 리턴");
		
		System.out.print("\n\t번호를 입력해주세요 > ");
		select = sc.nextInt();
		if (select == 1) {
			note.fileSave();
		} else if ( select == 2 ) {
			note.fileOpen();
		} else if ( select == 3 ) {
			note.fileEdit();
		} else if ( select == 4 ) {
			
		} else {
			System.out.println("\n\t이상한 수를 입력하셨습니다. 다른 수를 입력해주세요.\n");
		}
			
		note.setSc(sc);
		} while (select != 4);
		System.out.println("\t4번을 입력하셨습니다. 프로그램을 종료합니다.");
		System.out.println(select);
		
		
		
	}
}