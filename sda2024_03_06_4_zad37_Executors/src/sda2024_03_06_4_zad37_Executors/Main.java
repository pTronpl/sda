package sda2024_03_06_4_zad37_Executors;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Main {
	
	static Executor executor;
/*
 * ZADANIE 37.
Stwórz klasę zawierającą standardową metodę statyczną main oraz zmienną typu Executor 
i korzystając z metody fabrykującej newFixedThreadPool klasy Executors utwórz pulę executorów o rozmiarze 2.
W iteracji dodaj do Executora 10 obiektów klasy ThreadPlaygroundRunnable z poprzedniego zadania. 
Jako nazwy użyj dowolnego ciągu znaków oraz numeru aktualnej iteracji.
 */
	public static void main(String[] args) {
		
		executor = Executors.newFixedThreadPool(2);

		for (int i=1; i<=10; i++) {
		      executor.execute(new ThreadPlaygroundRunnable("Watek " + i));
		    }

	}
}
