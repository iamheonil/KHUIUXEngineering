package kh202003.kh20200316.filterStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Ex07_02_ObjectInputStream {
	public static void main(String[] args) {

		File file = new File("./src/kh202003/kh20200316/", "ObjectTest.ser");

		// Object 스트림 객체
		ObjectInputStream ois = null;

		try {
			ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)));

			// 파일 읽기
			Object obj1 = ois.readObject();
			Object obj2 = (Point) ois.readObject();
			Object obj3 = (Point) ois.readObject();

			System.out.println(obj1);
			System.out.println(obj2);
			System.out.println(obj3);

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