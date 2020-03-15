package kh202003.kh20200313.byteStream;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamEx_03 {
	public static void main(String[] args) {

		InputStream is = System.in; // 입력 객체

		int in = -1; // 입력받은 데이터

		byte[] b = new byte[1024]; // 입력한 데이터 임시저장소

		int len = -1; // 입력한 데이터의 길이
		
		int total = 0;
		
		StringBuilder sb = new StringBuilder();
		
		System.out.println("입력 대기중..");
		
		try {
			
			while ( (len = is.read(b)) != -1 ) { 
				
				System.out.println("글자길이 : " + len); // 입력받은 길이 출력
				
				total += len;
				
				String str = new String(b, 0, len);
				
				System.out.println("입력한 문자열 : " + str);
				
//				System.out.println("입력한 문자열 : " + b[0]);	// 입력받은 문자열
				// new String(b)로 변환하면 byte[]에 모든 요소를 변환한다.
				// 이때 이전에 입력했던 데이터도 같이 변환해버린다.
				// new String(b, 0, len)을 이용하여 입력한 길이만큼만 변환하여 사용한다.
				
				sb.append(str);
			}
			
		} catch (IOException e) {

			e.printStackTrace();
			
		} 
		System.out.println(total + "만큼 입력 했습니다.");
		System.out.println("입력한 문자들");
		System.out.println(sb);

	} // Main End
} // Class End