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
			System.out.println("单农 1锅 " + dec + " 单农 2锅 " + dec2);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

	}

}
