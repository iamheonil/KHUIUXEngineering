package kh202003.kh20200318.sync;

public class Output extends Thread {

	SyncData data;

	public Output(SyncData data) {
		this.data = data;
	}

	@Override
	public void run() {
		System.out.println("Output Start");

		synchronized (data) {
			if (data.available == false) {
				try {
					data.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("TOTAL : " + data.total);
			}
		}

		System.out.println("Output END");
	}

}
