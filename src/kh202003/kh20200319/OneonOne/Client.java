package kh202003.kh20200319.OneonOne;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	
	public Client() {
		Socket sock = null;
		try {
			sock = new Socket("192.168.20.25", 8888);
			System.out.println("Á¢¼Ó ¿Ï·á¿Ë");
			chat(sock);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public void chat(Socket sock) {
		new Sender(sock).start();
		new Receiver(sock).start();
		
	}
	
	public static void main(String[] args) {
		
		new Client();
		
	}
}
