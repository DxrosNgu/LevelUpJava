package java11.chapter16.FibonnaciPrimesImproved;

public class NumberChecker {

	public Boolean isPrime(Integer testNumber) {
		for (Integer i = 2; i < testNumber; i++) {
			if (testNumber % i == 0) return false;
		}
		return true;
	}
	
	
}