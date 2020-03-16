package kh202003.kh20200316.charStream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class CharStreamEx_02 {
	public static void main(String[] args) {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		String str = null; // 이번에 입력받을 문자열

		try {
			while ((str = reader.readLine()) != null) {
				writer.write(str); // 문자열 출력
				writer.newLine(); // 개행
				
				writer.flush(); // 무조건 넣어줘야하는 버퍼 제거
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

	} // Main End
} // class End