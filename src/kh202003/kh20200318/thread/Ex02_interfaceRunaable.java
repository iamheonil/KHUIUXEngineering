package kh202003.kh20200318.thread;

// Runnable Ŭ����
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

//		th02.start(); // runaable Ŭ�����̱� ������ .start() �� ����.

		// Thread Ŭ������ Runaable Ŭ������ �����ϸ� ��ü�� �����Ѵ�.
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