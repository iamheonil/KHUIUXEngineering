package kh202003.kh20200318.thread;

import java.util.Random;

public class Ex03_ThreadTest extends Thread {

	private int idx; // 쓰레드의 인덱스

	public Ex03_ThreadTest(int idx) {
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

		for (int i = 0; i < 10; i++) {
			new Ex03_ThreadTest(i).start();
		}
		
		System.out.println("Main End");
	}
}