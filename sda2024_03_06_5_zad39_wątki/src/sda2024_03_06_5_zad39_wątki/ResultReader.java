package sda2024_03_06_5_zad39_wątki;

public class ResultReader implements Runnable{
	@Override
	public void run() {
		System.out.println(Results.getResult());		
	}
}
