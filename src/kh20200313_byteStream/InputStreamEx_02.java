package kh20200313_byteStream;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamEx_02 {
	public static void main(String[] args) {

		InputStream is = System.in; // 입력 객체

		int in = -1; // 입력받은 데이터

		StringBuilder sb = new StringBuilder(); // 입력받은 데이터 저장소
		// StringBuilder 가 추가, 삭제, 수정이 잦은 작업에 적합하다.
		
		try {

			while ((in = is.read()) != -1) {
				
				sb.append((char) in); // 입력된 아스키코드를 문자로 변형하여 StringBuilder에 저장

			}

		} catch (Exception e) {

		} finally {
			try {
				if (is != null) {
					is.close(); // 스트림 닫기
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} // 자원 반납에 대한 코드들은 finally에 적어주는것이 적합하다
		}
		System.out.print("입력 결과 : ");
		System.out.print(sb);
		
		// 키보드에서 EOF 는 Ctrl + Z (^Z)
		
	} // Main End
} // Class End