package sda2024_03_06_5_zad39_wątki;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class ResultWriter implements Runnable{

		@Override
		public void run() {
			Results.setResult(new AtomicInteger(new Random().nextInt(1,6)));
			
		}
}
