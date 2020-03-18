package kh202003.kh20200318.thread;

// Runnable 클래스
class Thread02 implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 100; i++) {
			System.out.println("Thread : " + i);

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}
}

public class Ex02_interfaceRunaable {
	public static void main(String[] args) {

		Thread02 th02 = new Thread02();

//		th02.start(); // runaable 클래스이기 때문에 .start() 가 없다.

		// Thread 클래스에 Runaable 클래스를 전달하며 객체를 생성한다.
		Thread threadExcutor = new Thread(th02);

		threadExcutor.start();

		for (int i = 1; i <= 100; i++) {
			System.out.println("Main : " + i);

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}
}