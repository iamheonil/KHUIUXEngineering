package kh202003.kh20200317.socket;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Ex04_Client {
	public static void main(String[] args) {

//		 - sock : Socket
//		 - out : PrintWriter
//		 - file : File
//		 - in : FileReader

		Socket sock = null;
		FileReader in = null;
		PrintWriter out = null;
		File file = null;
		Scanner sc = new Scanner(System.in);
		BufferedReader br = null;
		char[] cbuf = new char[1024];
		int len = -1;

		try {
//			sock = new Socket("192.168.20.25", 10009);
			sock = new Socket("192.168.0.2", 10009);

			file = new File("./src/kh202003/kh20200317/socket/result/copy.txt");
			System.out.print(file + "을 불러왔습니다.");
			System.out.println();
			

			in = new FileReader(file);
			
			out = new PrintWriter(sock.getOutputStream(), true);
			System.out.println(file.length());
			
			while ((len = in.read(cbuf)) != -1) {
				out.write(cbuf, 0, len);
				out.flush();
			}

		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {

			try {
				if (sock != null) {
					sock.close();
				}
				if (in != null) {
					in.close();
				}
				if (out != null) {
					out.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}