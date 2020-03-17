package kh202003.kh20200317.socket;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex04_Server {
	public static void main(String[] args) {

//		 - serv : ServerSocket
//		 - sock : Socket
//		 - in : BufferedReader
//		 - file : File
//		 - out : FileWriter

		ServerSocket serv = null;
		Socket sock = null;
		BufferedReader in = null;
		File file = null;
		FileWriter out = null;

		try {
			serv = new ServerSocket(10009);
			sock = new Socket("192.168.20.25", 10009);
			
			System.out.println("쏘켓 생성 완료!");
			InetAddress ip = sock.getInetAddress();
			int port = sock.getPort();
			System.out.println("아이피는 : "+ ip + " 포트는 : " + port);
			
			
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}