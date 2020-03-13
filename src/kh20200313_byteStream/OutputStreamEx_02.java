package kh20200313_byteStream;

import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamEx_02 {
	public static void main(String[] args) {

		OutputStream os = System.out;
		
		byte[] b = new byte[1024];
		
		b[0] = 'A';
		b[1] = 'B';
		b[2] = 'C';
		b[3] = '\n';
		b[4] = '1';
		b[5] = '2';
		b[6] = '3';
		b[7] = '\n';
		
		try {

			os.write(b);
			os.flush(); // 버퍼 비우기, 출력시 꼭 해줘야하는 작업
			
//			System.out.println();
			
			String str = "Hi Hello";
			
			byte[] tmp = str.getBytes();
			
			os.write(tmp);
			os.flush();
			
		} catch (IOException e) {
			e.printStackTrace();

		} finally {
			try {
				if (os != null) {
					os.close();
				}
				
			} catch (IOException e) {
				e.printStackTrace();

			}
		} // Finally

	} // Main End
} // Class End