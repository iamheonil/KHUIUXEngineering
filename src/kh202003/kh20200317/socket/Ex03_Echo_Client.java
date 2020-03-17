package kh202003.kh20200317.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Ex03_Echo_Client {
	public static void main(String[] args) {

		Socket sock = null;
		PrintWriter sendMsg = null;
		Scanner sc = new Scanner(System.in);
		BufferedReader msg = null;
		
		try {
			sock = new Socket("192.168.20.25", 10009);
			System.out.println("접속 완료옹~!");
			System.out.println("시원하게 맞을 메세지 입력 : ");
			
			sendMsg = new PrintWriter(sock.getOutputStream(), true);
			sendMsg.println(sc.nextLine());
			
			msg = new BufferedReader(new InputStreamReader(sock.getInputStream()));
			String getMsg = msg.readLine();
			
//			System.out.println("뜨악!!");
			System.out.println(getMsg);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (sock != null) sock.close();
				if (sendMsg != null) sendMsg.close();
				if (msg != null) msg.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}