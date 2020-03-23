package kh202003.kh20200319.OneonOne;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Sender extends Thread {

	Socket sock = null;
	BufferedReader reader = null;
	PrintWriter writer = null;
	Scanner sc = new Scanner(System.in);

	public Sender(Socket sock) {
		this.sock = sock;
	}

	public static void main(String[] args) {

	}

	@Override
	public void run() {

		char[] cbuf = new char[1024];

		try {
//				reader = new BufferedReader(new InputStreamReader(System.in));
			try {
				while (true) {
					System.out.print("보낼 메세지 : ");
					String msg = sc.nextLine();

					writer = new PrintWriter(new OutputStreamWriter(sock.getOutputStream()), true);
					writer.println(msg);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
//		} catch (IOException e) {
//			e.printStackTrace();
		} finally {
			try {
				if (reader != null) {
					reader.close();
				}
				if (writer != null) {
					writer.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}