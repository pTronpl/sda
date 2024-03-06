package sda2024_03_06_1_zad34_Thread;

public class MyThread extends Thread{
	
	private String name;
	private static int counter;
	
/*
 * Utwórz klasę rozszerzającą klasę Thread np. MyThread, przeciąż metodę run(), 
 * w której wyświetlisz w konsoli nazwę wątku odczytując ją ze statycznej metody aktualnego wątku:
Thread.currentThread().getName()
Utwórz klasę z metodą public static void main(String[] args). 
Wewnątrz metody main utwórz zmienną typu naszej klasy stworzonej powyżej np. MyThread oraz zainicjuj klasę. 
Na zmiennej wykonać metodę start().
 */
	
public MyThread(String name) {
		super();
		this.name = name;
		counter++;
	}

	//	Thread.currentThread().getName()
	@Override
	public void run(){
		System.out.println("Counter:" + this.counter + "  " +this.name + " " + Thread.currentThread().getName());
		try {
			MyThread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
