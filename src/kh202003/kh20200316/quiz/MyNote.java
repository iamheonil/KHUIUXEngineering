package kh202003.kh20200316.quiz;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MyNote {
	private Scanner sc = new Scanner(System.in);
	File src = new File("./src/kh202003/kh20200316/quiz/", "notepad.txt");
	File cFile = new File("./src/kh202003/kh20200316/quiz/", "notepad.txt");

	BufferedReader reader = null;
	PrintWriter writer = null;

	public void fileSave() {
		try {
			String data = null;
			String theEnd = "/exit";
			System.out.print("\n\t���Ͽ� ������ ������ �Է��ϼ���, �Է��� ������ /exit �� �Է��ϼ���.");
			StringBuilder sb = new StringBuilder();

			do {
				sb.append(data = sc.nextLine());
				sb.append("\n");
			} while (data.equals(theEnd) != true);

			System.out.println("���� �Ͻðڽ��ϱ�? : Y/N (��ҹ��� ���� �� ��)");
			String result = sc.nextLine();
			if (result.equals("Y") || result.equals("y")) {
				System.out.println("������ ���ϸ��� �Է��ϼ��� : ");
				String saveFile = sc.nextLine();
				writer = new PrintWriter("./src/kh202003/kh20200316/quiz/" + saveFile);
				writer.println(sb);
				System.out.println("����������" + saveFile + "������ ����Ǿ����ϴ�.");
			} else {
				System.out.println("���������� �����Ǿ����ϴ�.");
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (writer != null) {
				writer.close();
			}
		}
	}

	public void fileOpen() {
		System.out.print("\n\tOpen �� ���ϸ��� �Է����ּ���. : ");
		String fileName = sc.nextLine();
		String fileContent = null;
		System.out.println();
		try {
			reader = new BufferedReader(new FileReader("./src/kh202003/kh20200316/quiz/" + fileName));
			while ((fileContent = reader.readLine()) != null) {
				System.out.println(fileContent);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (reader != null) {
					reader.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	public void fileEdit() {
		System.out.println("���� �� ���ϸ��� �Է��ϼ���. : ");
		String fileName = sc.nextLine();

		try {
			reader = new BufferedReader(new FileReader("./src/kh202003/kh20200316/quiz/" + fileName));
			System.out.println(fileName + "�� ���������� �ҷ� �Խ��ϴ�!");
			String data = null;
			String theEnd = "/exit";
			String fileContent = null;
			while ((fileContent = reader.readLine()) != null) {
				System.out.println(fileContent);
			}
			System.out.println("==================== ���� ����");
			System.out.print("\n���Ͽ� ������ ������ �Է��ϼ���, �Է��� ������ /exit �� �Է��ϼ���.");
			StringBuilder sb = new StringBuilder();

			do {
				sb.append(data = sc.nextLine());
				sb.append("\n");
			} while (data.equals(theEnd) != true);

			System.out.println("\n");
			System.out.println("���� �Ͻðڽ��ϱ�? : Y/N (��ҹ��� ���� �� ��)");
			String result = sc.nextLine();
			if (result.equals("Y") || result.equals("y")) {
				result = null;
				writer = new PrintWriter(new FileOutputStream("./src/kh202003/kh20200316/quiz/" + fileName, true));
				writer.println(sb);
				System.out.println("\n\t");
				System.out.println("���������� " + fileName + " ������ ����Ǿ����ϴ�.");
				System.out.println("\n\t");
			} else {
				System.out.println("���������� �����Ǿ����ϴ�.");
				System.out.println("\n\t");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (writer != null) {
					writer.close();
				}
				if (reader != null) {
					reader.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	} // Main End
} // Class End