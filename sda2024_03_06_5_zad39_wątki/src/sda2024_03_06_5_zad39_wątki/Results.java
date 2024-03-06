package sda2024_03_06_5_zad39_wątki;

import java.util.concurrent.atomic.AtomicInteger;

public class Results {
	private static AtomicInteger result = new AtomicInteger(0);
	
	

	/**
	 * @return the wynik
	 */
	public static int getResult() {
		return result.get();
	}

	/**
	 * @param wynik the wynik to set
	 */
	public static void setResult(int res) {
		result.addAndGet(res);
	}
	
	
}
