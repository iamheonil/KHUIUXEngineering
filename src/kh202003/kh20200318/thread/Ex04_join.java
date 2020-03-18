package kh202003.kh20200318.thread;

import java.util.Random;

public class Ex04_join extends Thread {

	private int idx; // 쓰레드의 인덱스

	public Ex04_join(int idx) {
		this.idx = idx;

	}

	@Override
	public void run() {

		System.out.println(idx + " 쓰레드 시작");
		
		Random ran = new Random();
		
		try {
			Thread.sleep(ran.nextInt(3000));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(idx + " 쓰레드 끝");

	}

	public static void main(String[] args) {

		System.out.println("Main Start");

		
		Ex04_join t1 = new Ex04_join(1);
		Ex04_join t2 = new Ex04_join(2);
		Ex04_join t3 = new Ex04_join(3);
		
		t1.start();
		t2.start();
		t3.start();
		
		try {
			
			// public final void join() throws InteruptedException
			// 스레드가 종료될 때 까지 기다린다.
			t1.join();
			t2.join();
			t3.join();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Main End");
	}
}