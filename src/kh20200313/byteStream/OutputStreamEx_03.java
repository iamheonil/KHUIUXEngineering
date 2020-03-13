package kh20200313.byteStream;

import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamEx_03 {
	public static void main(String[] args) {

		OutputStream os = System.out;

		byte[] b = new byte[1024];

		int len = 0;

		b[len++] = 'A';
		b[len++] = 'p';
		b[len++] = 'p';
		b[len++] = 'l';
		b[len++] = 'e';
		b[len++] = '\n';
		b[len++] = 'H';
		b[len++] = 'I';
		b[len++] = '\n';

		try {
			os.write(b, 0, len);
			os.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (os != null) {
					os.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	} // Main End
} // Class End