package kh202003.kh20200318.quiz;

public class Increment implements Runnable {

	private int inc;

	public Increment(int inc) {
		this.inc = inc;
	}

	@Override
	public void run() {
//		if (inc == 50) {
		int incPlus = 1;
		
		while (incPlus <= inc) {
			System.out.println("현재 인꾸리 : " + incPlus);
			
			incPlus += 2;
			
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
//			for (int i = 1; incPlus >= inc; i++) {
//				inc += 2;
//				System.out.println("현재 인꾸리 : " + inc);
//				try {
//					Thread.sleep(50);
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
//			}
//			System.out.println("인꾸리 : " + inc);
//		}
	}

}
