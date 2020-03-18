package kh202003.kh20200318.sync;


public class WaitNotifyEx {
	public static void main(String[] args) {

		SyncData data = new SyncData();
		
		Output o = new Output(data);
		Input i = new Input(data);
		
		o.start();
		i.start();
		
	}
}