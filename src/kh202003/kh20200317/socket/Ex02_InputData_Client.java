package kh202003.kh20200317.socket;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Ex02_InputData_Client {
	public static void main(String[] args) {

		Socket sock = null;
		Scanner sc = new Scanner(System.in);
		PrintWriter out = null;
		StringBuilder sb = null;

		try {

			String msg = null;
			sock = new Socket("192.168.20.25", 10009);

			System.out.println("���� �Ͽ����ϴ�!");
			System.out.println("������ �����͸� �Է� �ϼ���!");
			sb = new StringBuilder();
//			do {
//				sb.append(msg = sc.nextLine());
//			} while (msg.equals("end") != true);
			out = new PrintWriter(sock.getOutputStream(), true);
			out.println(sc.nextLine());

//			out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(sock.getOutputStream())), true);

		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (sock != null) {
					sock.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}