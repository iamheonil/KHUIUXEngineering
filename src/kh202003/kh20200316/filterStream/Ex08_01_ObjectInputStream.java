package kh202003.kh20200316.filterStream;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class Ex08_01_ObjectInputStream {
	public static void main(String[] args) {

		File file = new File("./src/kh202003/kh20200316/", "ObjectTest2.ser");

		// Object 스트림 객체
		ObjectInputStream ois = null;

		try {
			ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)));

			// 파일 읽기
			List list = (List) ois.readObject();

			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i));
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if (ois != null) {
					ois.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}