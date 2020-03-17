package kh202003.kh20200317.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class Ex01_BasicClient {
	public static void main(String[] args) {

		Socket sock = null;
		BufferedReader in = null; // 소켓 입력 스트림

		try {
//			sock = new Socket("192.168.20.105", 10001);
//			sock = new Socket("192.168.20.40", 10001);
			sock = new Socket("192.168.20.25", 10009);
			System.out.println("서버 접속 중");
//			sock = new Socket("localhost", 10009);

			in = new BufferedReader(new InputStreamReader(sock.getInputStream()));

			String msg = in.readLine();

			System.out.println();
			System.out.println("\t 전송 데이터 : " + msg);

		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (in != null) {
					in.close();
				}
				if (sock != null) {
					sock.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
