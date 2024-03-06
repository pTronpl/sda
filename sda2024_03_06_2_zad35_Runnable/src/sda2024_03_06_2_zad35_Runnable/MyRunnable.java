package sda2024_03_06_2_zad35_Runnable;

public class MyRunnable implements Runnable {
	
	private String name;
	private static int counter;
	
	

	public MyRunnable(String name) {
		super();
		this.name = name;
		counter++;
	}



	@Override
	public void run() {
		System.out.println("Counter:" + this.counter + "  " +this.name + " " + Thread.currentThread().getName());

	}

}
