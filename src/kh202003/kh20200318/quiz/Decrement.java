package kh202003.kh20200318.quiz;

public class Decrement implements Runnable {

	private int dec;
	private int dec2;

	public Decrement(int dec, int dec2) {
		this.dec = dec;
		this.dec2 = dec2;
	}

	@Override
	public void run() {

		while (dec < dec2) {

			dec2--;
			System.out.println("��ũ 1�� " + dec + " ��ũ 2�� " + dec2);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

	}

}
