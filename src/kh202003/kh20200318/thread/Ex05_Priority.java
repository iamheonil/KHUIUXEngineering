package kh202003.kh20200318.thread;

public class Ex05_Priority extends Thread {

	private int idx;

	public Ex05_Priority(int idx) {
		this.idx = idx;

	}

	@Override
	public void run() {
		System.out.println(idx + " Ω√¿€");

		for (int i = 0; i < 1000; i++) {
			System.out.print(idx);
		}

		System.out.println("\n" + idx + " ≥°");
	}

	public static void main(String[] args) {

		System.out.println("MAIN START");
		Ex05_Priority py1 = new Ex05_Priority(1);
		Ex05_Priority py2 = new Ex05_Priority(2);
		Ex05_Priority py3 = new Ex05_Priority(3);

		// Thread Scheduling

		py1.setPriority(Thread.MIN_PRIORITY); // 1
		py2.setPriority(Thread.NORM_PRIORITY); // 2
		py3.setPriority(Thread.MAX_PRIORITY); // 3

		py1.start();
		py2.start();
		py3.start();

		try {
			py1.join();
			py2.join();
			py3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("MAIN END");
	}
}