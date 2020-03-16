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
			System.out.print("\n\t파일에 저장할 내용을 입력하세요, 입력이 끝나면 /exit 를 입력하세요.");
			StringBuilder sb = new StringBuilder();

			do {
				sb.append(data = sc.nextLine());
				sb.append("\n");
			} while (data.equals(theEnd) != true);

			System.out.println("저장 하시겠습니까? : Y/N (대소문자 구분 안 함)");
			String result = sc.nextLine();
			if (result.equals("Y") || result.equals("y")) {
				System.out.println("저장할 파일명을 입력하세요 : ");
				String saveFile = sc.nextLine();
				writer = new PrintWriter("./src/kh202003/kh20200316/quiz/" + saveFile);
				writer.println(sb);
				System.out.println("정상적으로" + saveFile + "명으로 저장되었습니다.");
			} else {
				System.out.println("정상적으로 삭제되었습니다.");
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
		System.out.print("\n\tOpen 할 파일명을 입력해주세요. : ");
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
		System.out.println("수정 할 파일명을 입력하세요. : ");
		String fileName = sc.nextLine();

		try {
			reader = new BufferedReader(new FileReader("./src/kh202003/kh20200316/quiz/" + fileName));
			System.out.println(fileName + "을 성공적으로 불러 왔습니다!");
			String data = null;
			String theEnd = "/exit";
			String fileContent = null;
			while ((fileContent = reader.readLine()) != null) {
				System.out.println(fileContent);
			}
			System.out.println("==================== 현재 내용");
			System.out.print("\n파일에 저장할 내용을 입력하세요, 입력이 끝나면 /exit 를 입력하세요.");
			StringBuilder sb = new StringBuilder();

			do {
				sb.append(data = sc.nextLine());
				sb.append("\n");
			} while (data.equals(theEnd) != true);

			System.out.println("\n");
			System.out.println("저장 하시겠습니까? : Y/N (대소문자 구분 안 함)");
			String result = sc.nextLine();
			if (result.equals("Y") || result.equals("y")) {
				result = null;
				writer = new PrintWriter(new FileOutputStream("./src/kh202003/kh20200316/quiz/" + fileName, true));
				writer.println(sb);
				System.out.println("\n\t");
				System.out.println("정상적으로 " + fileName + " 명으로 저장되었습니다.");
				System.out.println("\n\t");
			} else {
				System.out.println("정상적으로 삭제되었습니다.");
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