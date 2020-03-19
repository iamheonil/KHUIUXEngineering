package kh202003.kh20200319.OneonOne;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Receiver extends Thread {

	Socket sock = null;
	BufferedReader reader = null;
	PrintWriter writer = null;

	public Receiver(Socket sock) {
		this.sock = sock;
	}

	public static void main(String[] args) {

	}

	@Override
	public void run() {
		char[] cbuf = new char[1024];

		try {
			while (true) {
				reader = new BufferedReader(new InputStreamReader(sock.getInputStream()));
				String msg = null;

				while ((msg = reader.readLine()) != null) {
					System.out.print("받은 메세지 > ");
					System.out.println(msg);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (reader != null) {
					reader.close();
				}
				if (writer != null) {
					writer.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}