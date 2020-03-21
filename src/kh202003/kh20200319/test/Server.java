package kh202003.kh20200319.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) {

		ServerSocket serv = null;
		Socket sock = null;
		FileReader fr = null;
		File file = new File("./src/kh202003/kh20200317/socket/result/Server.txt");
		BufferedReader in = null;
		FileWriter out = null;
		int len = -1;
		File src = new File("./src/kh202003/kh20200317/socket/result/Server2.txt");
		char[] cbuf = new char[1024];
		
		try {
			serv = new ServerSocket(10008);
			System.out.println("소켓 생성 완료");

			sock = serv.accept();
			InetAddress ip = sock.getInetAddress();
			int port = sock.getPort();

			System.out.println("config = " + ip);
			System.out.print("포트 / " + port);
			
//			in = new BufferedReader(new FileReader(file));
//			System.out.println(in.read(cbuf));
//			out = new FileWriter(new File("./src/kh202003/kh20200317/socket/result/Server2.txt"), false);
//			
//			while ((len = in.read(cbuf)) != -1) {
//				out.write(cbuf, 0, len);
//				out.flush();
//			}
			
			in = new BufferedReader(new InputStreamReader(sock.getInputStream()));

	         out = new FileWriter(new File(src + "Server5.txt"), false);

	         while((len = in.read(cbuf)) != -1) {
	            out.write(cbuf, 0, len);
	         }
	         
	         out.flush();
	         
	         System.out.println("복사 완료");
			System.out.println(src.length());
//			System.out.println("파일 " + src.length());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
