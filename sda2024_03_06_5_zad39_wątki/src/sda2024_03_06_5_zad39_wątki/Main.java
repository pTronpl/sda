package sda2024_03_06_5_zad39_wątki;



import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

	public static void main(String[] args) {
		/*
		 * 	Napisz program, który ma za zadanie rozwiązać poniższy problem.
			Istnieje system przechowujący aktualne wyniki w zawodach. 
			Wiele ekranów odczytuje aktualne wyniki, natomiast kilka czujników aktualizuje te wyniki.
			Napisz program, który pozwala na nieprzerwany odczyt danych przez wiele ekranów (wątków) 
			oraz aktualizację danych przez wiele czujników (wątków) - ustaw to jako operacje cykliczne.
			Wykorzystaj obiekty 'Atomic' aby zapewnić atomowość operacji.
		 */
		ResultReader reader = new ResultReader();
		ResultWriter writer = new ResultWriter();
		
		ExecutorService ex = Executors.newFixedThreadPool(8);

		for (int i = 0; i < 20; i++) {
			ex.execute(writer);
			ex.execute(reader);
		}
		ex.shutdown();
	}

}
