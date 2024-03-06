package sda2024_03_06_4_zad37_Executors;

public class ThreadPlaygroundRunnable implements Runnable{
	private String name;
	
	
	public ThreadPlaygroundRunnable(String name) {
		this.name = name;
	}


	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Counter:" + i + "  " +this.name + " " + Thread.currentThread().getName());
		}
		
	}

}
