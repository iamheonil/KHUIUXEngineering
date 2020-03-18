package kh202003.kh20200318.thread;

class Thread06 extends Thread {
	@Override
	public void run() {
		method01();
	}

	public void method01() {
		method02();
	}

	public void method02() {
		method03();
	}

	public void method03() {
		try {
			throw new Exception();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

public class Ex06_StackTrace {
	public static void main(String[] args) {

		Thread06 th06 = new Thread06();
		
		th06.start();
		
		th06.run();
		
	}
}