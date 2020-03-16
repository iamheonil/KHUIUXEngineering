package kh202003.kh20200316.charStream;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class CharStreamEx_03 {
	public static void main(String[] args) {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out), true);

//		char[] cbuf = new char[1024];

		String str = null;

		try {
			while ((str = in.readLine()) != null) {
				out.println(str);
//				out.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				out.close(); // PrintWriter �� Try/catch ��� ���� �ʾƵ� �ȴ�.
				if (in != null) {
					in.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}