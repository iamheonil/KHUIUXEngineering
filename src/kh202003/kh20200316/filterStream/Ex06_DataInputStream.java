package kh202003.kh20200316.filterStream;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex06_DataInputStream {
	public static void main(String[] args) {

		File file = new File("./src/kh202003/kh20200316/", "BufferedOut2.txt");

		DataInputStream dis = null;

		try {
			dis = new DataInputStream(new BufferedInputStream(new FileInputStream(file)));
			
			int d1 = dis.read();
			boolean d2 = dis.readBoolean();
			char d3 = dis.readChar();
			int d4 = dis.readInt();
			
			System.out.println("d1 : " + (char) d1);
			System.out.println("d2 : " + d2);
			System.out.println("d3 : " + d3);
			System.out.println("d4 : " + d4);
			
		} catch (FileNotFoundException e) {
			System.out.println("\t>> 파일 없음");
			System.out.println("\t>> 알 수 없는 경로");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (dis != null) {
					dis.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}