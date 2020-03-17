package kh202003.kh20200317.socket;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex01_BasicServer {
	public static void main(String[] args) {

		ServerSocket servSock = null; // 서버 리슨 소켓
		Socket sock = null; // 통신 소켓
		PrintWriter out = null;

		try {
			servSock = new ServerSocket(10009); // 리슨 소켓
			System.out.println("서버 소켓 생성 완료");
			System.out.println();

			System.out.println("클라이언트 접속 대기중");
			System.out.println("Listen Port : " + servSock.getLocalPort());
			// 클라이언트가 접속하면 통신용 소켓을 반환한다.
			sock = servSock.accept();

			// 일시정지 상태, BLOCKED
			InetAddress ip = sock.getInetAddress();
			System.out.println("사람이 들어와따 !\n" + ip.getHostAddress() + " : " + sock.getPort());

			out = new PrintWriter(sock.getOutputStream(), true);
			out.println("나는 니리니리");

			// 데이터 통신
			// 통신소켓 Sock 에서 입출력 스트림을 얻어 통신한다.

//			sock.getInputStream(); // 소켓을 통한 입력 스트림
//			sock.getOutputStream();// 소켓을 통한 출력 스트림

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (out != null) {
					out.close();
				}
				if (sock != null) {
					sock.close();
				}
				if (servSock != null) {
					servSock.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
