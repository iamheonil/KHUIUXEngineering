package kh202003.kh20200319.OneonOne;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public Server() {

		ServerSocket serv = null;
		Socket sock = null;
		
		try {
			serv = new ServerSocket(8888);
			sock = serv.accept();
			chat(sock);
			System.out.println("누군가 입장!");
		} catch (IOException e) {
			e.printStackTrace();
		}
				
	}

	public void chat(Socket sock) {

		Sender sd = new Sender(sock);
		Receiver rc = new Receiver(sock);
		
		sd.start();
		rc.start();
		
		
	}

	public static void main(String[] args) {

		new Server();

	}
}