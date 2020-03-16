package kh202003.kh20200316.charStream;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class CharStreamEx_01 {
	public static void main(String[] args) {

		// Stream은 기본적으로 바이트 통신
		// 문자가 필요한, 2B 통신은 변환해줘야한다.

		// InputStreamReader
		// OutputStreamReader
		// 두 클래스를 이용하여 변환한다.

		// 표준입력 스트림 System.in -> Reader로 변환하는 과정
		Reader reader = new InputStreamReader(System.in);

		// 표준입력 스트림 System.out -> Writer로 변환하는 과정
		Writer writer = new OutputStreamWriter(System.out);

		// 입출력 보조변수
		char[] cbuf = new char[1024];
		int len = -1;
		int total = 0;
		// 바이트 통신과 다르게 여기는 문자수

		try {
			while ((len = reader.read(cbuf)) != -1) {
				writer.write(cbuf, 0, len);
				writer.flush();

				total += len; // 입력받은 문자수
			}


		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (reader != null) {
					reader.close();
				}
				if (writer != null) {
					writer.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		// 위에 System.out 이 Close 되어 아래의 Println 문은 동작하지 않는다.
		System.out.println("지금까지 입력한 문자수는 " + total + "개 입니다.");

	}
}