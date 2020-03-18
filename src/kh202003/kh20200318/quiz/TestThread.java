package kh202003.kh20200318.quiz;

public class TestThread extends Thread {
	public static void main(String[] args) {

		Increment ic = new Increment(50);
		Decrement dc = new Decrement(12, 45);
		
		Thread t1 = new Thread(ic);
		Thread t2 = new Thread(dc);

		System.out.println("������ ����");
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("������ �̿��ؼ� �����尡 ������ ���� ����!");
	}
}