package kh202003.kh20200317.socket;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex01_BasicServer {
	public static void main(String[] args) {

		ServerSocket servSock = null; // ���� ���� ����
		Socket sock = null; // ��� ����
		PrintWriter out = null;

		try {
			servSock = new ServerSocket(10009); // ���� ����
			System.out.println("���� ���� ���� �Ϸ�");
			System.out.println();

			System.out.println("Ŭ���̾�Ʈ ���� �����");
			System.out.println("Listen Port : " + servSock.getLocalPort());
			// Ŭ���̾�Ʈ�� �����ϸ� ��ſ� ������ ��ȯ�Ѵ�.
			sock = servSock.accept();

			// �Ͻ����� ����, BLOCKED
			InetAddress ip = sock.getInetAddress();
			System.out.println("����� ���͵� !\n" + ip.getHostAddress() + " : " + sock.getPort());

			out = new PrintWriter(sock.getOutputStream(), true);
			out.println("���� �ϸ��ϸ�");

			// ������ ���
			// ��ż��� Sock ���� ����� ��Ʈ���� ��� ����Ѵ�.

//			sock.getInputStream(); // ������ ���� �Է� ��Ʈ��
//			sock.getOutputStream();// ������ ���� ��� ��Ʈ��

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (out != null) {
					out.close();
				}
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
