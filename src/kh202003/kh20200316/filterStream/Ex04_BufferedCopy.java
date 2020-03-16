package kh202003.kh20200316.filterStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex04_BufferedCopy {
	public static void main(String[] args) {

		// BufferedStream�� �̿��� ���� ����
		// Source.txt -> Dest.txt ����

		File file = new File("./src/kh202003/kh20200316/", "BufferedOut.txt");
		File cFile = new File("./src/kh202003/kh20200316/", "Dest.txt");
//		FileInputStream fis = null;
//		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		byte[] buf = new byte[1024];
		int len = -1;
		int total = 0;

		try {
//			fis = new FileInputStream(file);
//			fos = new FileOutputStream(cFile, false);

			bis = new BufferedInputStream(new FileInputStream(file));
			bos = new BufferedOutputStream(new FileOutputStream(cFile));

			while ((len = bis.read(buf)) != -1) {
				bos.write(buf, 0, len);

//				total += len;
			}
			bos.flush(); // ���� ����

			System.out.println("����Ϸ�, " + cFile.length() + "Byte ���� �ƽ��ϴ�.");

		} catch (FileNotFoundException e) {
			System.out.println("\t>> ���� ����");
			System.out.println("\t>> �� �� ���� ���");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
//				if (fis != null) {
//					fis.close();
//				}
				if (bis != null) {
					bis.close();
				}
//				if (fos != null) {
//					fos.close();
//				}
				if (bos != null) {
					bos.close();
				}

			} catch (IOException e) {
				e.printStackTrace();
			}
		}

//		System.out.println(total);

	} // Main End
} // Class End
