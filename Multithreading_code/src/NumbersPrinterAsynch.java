public class NumbersPrinterAsynch{
		
	
	public static void main(String[] args) {
	
		NumbersSequence.setN(10);
		 
		NumbersSequence seq = new NumbersSequence();
		
		Worker w1 = new Worker(seq);
		w1.start();
		
		Worker w2 = new Worker(seq);
		w2.start();
		
		
	}
	
	
	
}


class Worker extends Thread{
	
	NumbersSequence seq = new NumbersSequence();
	
	public Worker(NumbersSequence seq) {
		this.seq=seq;
	}
	
	public void run() {
		for(int i=0; i<NumbersSequence.getN();i++) {
			System.out.println("Current Thread: "+currentThread().getName()+ " Value: "+seq.getNextValue());
			
		}
	}
	
	
}