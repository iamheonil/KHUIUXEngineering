package kh202003.kh20200317.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex02_InputData_Server {
	public static void main(String[] args) {

		ServerSocket servSock = null;
		Socket sock = null;
		BufferedReader msg = null;

		try {
			servSock = new ServerSocket(10009);
			System.out.println("���� ���� �Ϸ� 10009��");

			// �Ͻ����� ����, BLOCKED
			sock = servSock.accept();
			InetAddress ip = sock.getInetAddress();
			System.out.println("����� ���͵� !\n" + ip.getHostAddress() + " : " + sock.getPort());

			msg = new BufferedReader(new InputStreamReader(sock.getInputStream()));
			String in = msg.readLine();
			System.out.println("�Է� �� ������ : \n" + in);

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (sock != null) {
					sock.close();
				}
				if (servSock != null) {
					servSock.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}