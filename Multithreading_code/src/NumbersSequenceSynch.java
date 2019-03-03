
public class NumbersSequenceSynch {
	
	private int currentValue = 0;
	public static int n ;
	
	public int getNextValue() {
		currentValue=currentValue+=1;
		return currentValue;	
	}

	public static int getN() {
		return n;
	}

	public static void setN(int n) {
		NumbersSequenceSynch.n = n;
	}
	
	
}


