package kh202003.kh20200317.socket;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
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
		char[] cbuf = new char[1024];
		int len = -1;
		File checkF = new File("./src/kh202003/kh20200317/socket/result/Server.txt");

		String src = "./src/kh202003/kh20200317/socket/result/";
		
		try {
			serv = new ServerSocket(10009);
//			sock = new Socket("192.168.20.25", 10009);
//			sock = new Socket("192.168.0.2", 10009);
			System.out.println("쏘켓 생성 완료!");

			sock = serv.accept();
			InetAddress ip = sock.getInetAddress();
			int port = sock.getPort();
			System.out.println("아이피는 : " + ip + " 포트는 : " + port);
			System.out.println("사람이 들어와따 !\n" + ip.getHostAddress() + " : " + sock.getPort());

			in = new BufferedReader(new InputStreamReader(sock.getInputStream()));

			out = new FileWriter(new File(src + "Server.txt"), false);

			while((len = in.read(cbuf)) != -1) {
				out.write(cbuf, 0, len);
			}
			
			out.flush();
			
			System.out.println("복사 완료");
			System.out.println(checkF.length());
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (sock != null) {
					sock.close();
				}
				if (serv != null) {
					serv.close();
				}
				if (in != null) {
					in.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}