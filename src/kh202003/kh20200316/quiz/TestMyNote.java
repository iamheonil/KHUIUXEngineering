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
		System.out.println("\t1. ��Ʈ ���� �����	//MyNote�� fileSave()");
		System.out.println("\t2. ��Ʈ ����		//MyNote�� fileOpen()");
		System.out.println("\t3. ��Ʈ ��� �����ϱ�	//MyNote�� fileEdit()");
		System.out.println("\t4. ������		//main() ���� ����");
		
		System.out.print("\n\t��ȣ�� �Է����ּ��� > ");
		select = sc.nextInt();
		if (select == 1) {
			note.fileSave();
		} else if ( select == 2 ) {
			note.fileOpen();
		} else if ( select == 3 ) {
			note.fileEdit();
		} else if ( select == 4 ) {
			
		} else {
			System.out.println("\n\t�̻��� ���� �Է��ϼ̽��ϴ�. �ٸ� ���� �Է����ּ���.\n");
		}
			
		note.setSc(sc);
		} while (select != 4);
		System.out.println("\t4���� �Է��ϼ̽��ϴ�. ���α׷��� �����մϴ�.");
		System.out.println(select);
		
		
		
	}
}