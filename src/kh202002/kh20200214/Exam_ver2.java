package kh202002.kh20200214;

import java.util.Scanner;

import kh202002.kh20200213.Student;

public class Exam_ver2 {
	private static final int INPUT_MENU = 1;
	private static final int OUTPUT_MENU = 2;
	private static final int EXIT_MENU = 3;
	
	private static final int INFO_MENU = 1;
	private static final int SCORE_MENU = 2;
	private static final int STU_MENU = 3;
	
	private static final int ALL_MENU = 1;
	private static final int IDX_MENU = 2;
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		StudentService_ver2 ss;
		ss = new StudentService_ver2();
	
//		ss.insertInfoIdx();
//		ss.insertScoreIdx();
//		ss.printStuIdx();
//		
//		ss.insertInfoAll();
//		ss.insertScoreAll();
//		ss.printStuAll();
//		
//		ss.insertStu(1);
//		ss.insertStuAll();

		int select = -1;
		
		do {
			System.out.println("+ + + + + �������� ���α׷� + + + + +");
			System.out.println("\t1. �Է�");
			System.out.println("\t2. ���");
			System.out.println("\t3. ����");
		
			select = selectMenu();

			switch(select) {
			case INPUT_MENU:
				System.out.println("\t  1-1. ���� ���� �Է�");
				System.out.println("\t  1-2. ���� �Է�");
				System.out.println("\t  1-3. ����+���� �Է�");
				
				select = selectMenu();
				switch(select) {
				case INFO_MENU:
					System.out.println("\t    1-1-1. (ALL) ���� ���� ��� �Է�");
					System.out.println("\t    1-1-2. (IDX) ���� ���� ���� �Է�");
					
					select = selectMenu();
					switch(select) {
					case ALL_MENU:
						ss.insertInfoAll();
						break;
						
					case IDX_MENU:
						ss.insertInfoIdx();
						break;
					}					
					break;

				case SCORE_MENU:
					System.out.println("\t    1-2-1. (ALL) ���� ��� �Է�");
					System.out.println("\t    1-2-2. (IDX) ���� ���� �Է�");
					
					select = selectMenu();
					switch(select) {
					case ALL_MENU:
						ss.insertScoreAll();
						break;
						
					case IDX_MENU:
						ss.insertScoreIdx();
						break;
					}
					break;
					
				case STU_MENU:
					System.out.println("\t    1-3-1. (ALL) ����+���� ��� �Է�");
//					System.out.println("\t    1-3-IDX. ����+���� ���� �Է�");
					
					select = selectMenu();
					switch(select) {
					case ALL_MENU:
						ss.insertStuAll();
						break;
						
					case IDX_MENU:
//						ss.insertStu(idx);
						break;
					}
					break;
				}
				break;
				
			case OUTPUT_MENU:
				System.out.println("\t  2-1. (ALL) ��� ���");
				System.out.println("\t  2-2. (IDX) ���� ���");
				
				select = selectMenu();
				switch(select) {
				case ALL_MENU:
					ss.printStuAll();
					break;
					
				case IDX_MENU:
					ss.printStuIdx();
					break;
				}
				break;
				
			case EXIT_MENU:
				System.out.println(" >> �����մϴ� <<");
				return;
			}
		} while(true);
	}
	
	private static int selectMenu() {
		System.out.print("\n\t> ");
		return sc.nextInt();
	}
}
