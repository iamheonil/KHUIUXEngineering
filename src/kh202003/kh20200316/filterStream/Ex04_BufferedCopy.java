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

		// BufferedStream을 이용한 파일 복사
		// Source.txt -> Dest.txt 복사

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
			bos.flush(); // 버퍼 비우기

			System.out.println("복사완룡, " + cFile.length() + "Byte 복사 됐습니다.");

		} catch (FileNotFoundException e) {
			System.out.println("\t>> 파일 없음");
			System.out.println("\t>> 알 수 없는 경로");
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
