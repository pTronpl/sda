package sda2024_03_06_1_zad34_Thread;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		MyThread thread1 = new MyThread("nowy watek 1");
		thread1.start();
		Thread.sleep(500);
		MyThread thread2 = new MyThread("nowy watek 2");
		thread2.start();
		Thread.sleep(500);
		MyThread thread3 = new MyThread("nowy watek 3");
		thread3.start();
		Thread.sleep(500);

	}

}
