package kh202003.kh20200318.thread;

// extends Thread 넣어주면 스레드 클래스
class Thread01 extends Thread {

	@Override
	public void run() {

		for (int i = 1; i <= 100; i++) {
			System.out.println("Thread : " + i);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		} // for End
	} // run End
}// Class End

public class Ex01_classThread {
	public static void main(String[] args) {

		Thread01 tr01 = new Thread01();

//		tr01.run();	// 일반 메소드 호출 -> 이건 스레드가 아님

		tr01.start();

		for (int i = 1; i <= 100; i++) {
			System.out.println("Main : " + i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	} // main End
} // Class End