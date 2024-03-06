package sda2024_03_06_3_zad36_Threads;

public class ThreadPlaygroundRunnable implements Runnable{
	private String name;
	
	
	public ThreadPlaygroundRunnable(String name) {
		super();
		this.name = name;
	}


	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Counter:" + i + "  " +this.name + " " + Thread.currentThread().getName());
		}
		
	}

}
