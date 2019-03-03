

public class NumbersPrinterMainThread {


	public static Long timeInit;
	public static Long timeEnd;

	public static void main(String[] args) throws InterruptedException {
		
		NumbersSequenceSynch.setN(100);
		timeInit = System.nanoTime();
		NumbersSequenceSynch seq = new NumbersSequenceSynch();

		for (int i = 0; i < NumbersSequenceSynch.getN(); i = i + 1) {
		
				System.out.println("Current Thread: " + 
				Thread.currentThread().getName() + " , value: " + seq.getNextValue());
			
		}
		
		timeEnd= System.nanoTime();
		printDuration();

	}

	public static void printDuration() {
		
		Long dur = timeEnd - timeInit;
		
		System.out.println("Duration in Seconds: " + dur * 0.000000001);

	}

}






