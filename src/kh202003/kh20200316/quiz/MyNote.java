package kh202003.kh20200316.quiz;

import java.lang.reflect.Constructor;
import java.util.Scanner;

public class MyNote {

	private Scanner sc = new Scanner(System.in);
	private Constructor construc;
	

	public Scanner getSc() {
		return sc;
	}

	public void setSc(Scanner sc) {
		this.sc = sc;
	}

	public void fileSave() {
		System.out.println("���� �̰� ���̺�");
	}

	public void fileOpen() {
		System.out.println("���� �̰� ����");
	}
	
	public void fileEdit() {
		System.out.println("���� �̰� ����");
	}
	
	
	
}


