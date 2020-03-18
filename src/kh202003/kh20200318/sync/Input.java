package kh202003.kh20200318.sync;

public class Input extends Thread {

	SyncData data;

	public Input(SyncData data) {
		this.data = data;
	}

	@Override
	public void run() {
		System.out.println("Input Start");
		
		synchronized (data) {
			for (int i = 0; i <= 100; i++) {
				data.total += i;
			}
			data.available = true;
			data.notifyAll();
		}
		
		
		System.out.println("Input End");
	}

}
