package kh202003.kh20200313.byteStream;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Echo {
	public static void main(String[] args) {

		// 키보드로 입력 -> 모니터 출력

		InputStream is = System.in;
		OutputStream os = System.out;

		byte[] buf = new byte[1024]; // 입출력 임시 저장소
		int len = 0; // 입력 데이터의 길이

		try {
			// EOF를 만날 때까지 키보드의 입력을 받아 입력받은 데이터만큼 모니터로 출력
			while ((len = is.read(buf)) != -1)
				os.write(buf, 0, len);
			os.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (os != null) {
					os.close();
				}
				if (is != null) {
					is.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}