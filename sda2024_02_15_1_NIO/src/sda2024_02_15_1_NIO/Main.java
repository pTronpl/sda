package sda2024_02_15_1_NIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws IOException {
    	
    	Path path = Path.of("zad_1_NIO.txt");
    	Files.deleteIfExists(path);
    	Files.createFile(path);
    	StringBuilder sb = new StringBuilder("");
    	//IntStream randStream = random.ints(500, 999, 999999);
    	new Random().ints(500, 999, 1000000)
    	.forEach(t -> {
    		sb.append("" + t+"\n");
//			writeToFile(path, t);
		});
    	writeToFile(path,sb);
    	//-------------------------------------------------
    	Path pathResult = Path.of("zad_1_NIO_res.txt");
    	Files.deleteIfExists(pathResult);
    	Files.createFile(pathResult);
    	Files.readAllLines(path).stream().mapToInt(i -> Integer.valueOf(i)).filter( e-> e%2 == 1)
    	.forEach(t -> {
			writeToFile(pathResult, t);
		});
    	
    	/*
    	 * Napisz kod który stworzy plik i wpisze do niego 500 losowych liczb z przedziału 999-999.999. 
    	 * Następnie wczytaj ten plik, znajdź nieparzyste liczby i wpisz je do nowego pliku.

			Podpowiedz:
			obiekt Random i jego nextInt funkcja pozwala na generowanie losowych wartości z przedziału;
			możesz skorzystać ze streamów ale nie musisz;
    	 */
//        Path sciezka = Path.of("resources/data"); // obiekt reprezentujący ścieżkę do pliku
//        Files.createFile(sciezka); // tworzę plik
//        Files.write(sciezka, "\njakiś tekst".getBytes(), StandardOpenOption.APPEND); // dopisuję do niego zawartość
//
//        List<String> a = Files.readAllLines(sciezka); // wczytuję wszystkie linijki z pliku pod ścieżką
//        a.forEach(System.out::println); // wypisuje je
//
//        Files.readAllLines(Path.of("resources/jakis.txxt")).forEach(System.out::println); // wypisuje zawartość innego pliku
    }

	private static void writeToFile(Path path, StringBuilder sb) {
		try {
			Files.write(path, (sb.toString()).getBytes(), StandardOpenOption.APPEND);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}

	/**
	 * @param path
	 * @param t
	 */
	static void writeToFile(Path path, int t) {
		try {
			Files.write(path, (""+t+"\n").getBytes(), StandardOpenOption.APPEND);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
