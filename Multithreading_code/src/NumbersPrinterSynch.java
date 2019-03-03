import java.util.ArrayList;
import java.util.List;

public class NumbersPrinterSynch {

	
	public static Long timeInit;
	public static Long timeEnd;
	public static Long dur;


	public static void main(String[] args) throws InterruptedException {
		NumbersSequenceSynch.setN(10);
		
		timeInit = System.nanoTime();
		NumbersSequenceSynch seq = new NumbersSequenceSynch();

		MyThreadSynchr t1 = new MyThreadSynchr(seq);
		t1.start();
		MyThreadSynchr t2 = new MyThreadSynchr(seq);
		t2.start();
		
		printDuration();
		
	}

	public static void printDuration() {
		timeEnd=System.nanoTime();
		dur = timeEnd - timeInit;
		
		System.out.println("Duration in Seconds: " + dur * 0.000000001);

	}

}

class MyThreadSynchr extends Thread {

	NumbersSequenceSynch seq = new NumbersSequenceSynch();
	public static List<Integer> list = new ArrayList<>();

	public MyThreadSynchr(NumbersSequenceSynch seq) {
		this.seq = seq;
	}

	public void run() {
		synchronized (seq) {
		for (int i = 0; i < (NumbersSequenceSynch.getN()/2); i = i + 1) {
				Integer nextValue = seq.getNextValue();
				System.out.println("Current Thread: " + Thread.currentThread().getName() + " , value: " + nextValue);
			}
		}
//		try {
//			Thread.sleep(10000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
	}
}
